package ConcurrentFuture;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String... args) throws Exception{
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        DownloadTask task = new DownloadTask("http://www.baidu.com");
        Future<String> future = executorService.submit(task);
        String html = future.get();
        System.out.println(html);
        executorService.shutdown();
    }
}
