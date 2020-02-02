package concurrent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlightQueryExample {
    private static List<String> flightCompany = Arrays.asList("CSA", "CEA", "HNA");

    public static void main(String... args) {
        List<String> results = search("SH", "BJ");
        System.out.println("==================result==================");
        results.forEach(System.out::println);
    }

    private static List<String> search(String original, String destination) {
        final List<String> result = new ArrayList<>();

        List<FlightQueryTask> tasks = flightCompany.stream().map(f-> createSearchTask(f, original, destination)).collect(Collectors.toList());
        tasks.forEach(Thread::start);
        tasks.forEach(t-> {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        tasks.stream().map(FlightQueryTask::get).forEach(result::addAll);
        return result;
    }

    private static FlightQueryTask createSearchTask(String flight, String original, String destination) {
        return new FlightQueryTask(flight, destination, original);
    }

}
