package ConcurrentExecutor;

import java.util.concurrent.*;

public class ThreadPool {
    public static void main(String... args) throws Exception{
        // ExecutorService executorService = Executors.newFixedThreadPool(3);
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = new ThreadPoolExecutor(0, 10,
                60L, TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>());
        executorService.submit(new PrintTask("Bob"));
        executorService.submit(new PrintTask("Alice"));
        executorService.submit(new PrintTask("Tom"));
        executorService.submit(new PrintTask("Jerry"));
        Thread.sleep(1000);
        executorService.shutdown();
    }
}
