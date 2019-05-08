package ConcurrentExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Schedule {
    public static void main(String... args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(3);
        executorService.scheduleAtFixedRate(new HelloTask("Bob"), 2, 5, TimeUnit.SECONDS );
        // executorService.scheduleWithFixedDelay(new HelloTask("Alice"), 2, 5, TimeUnit.SECONDS );
    }
}
