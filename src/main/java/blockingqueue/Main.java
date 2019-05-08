package blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

    public static void main(String[] args) throws Exception{
        BlockingQueue<String> taskQueue = new ArrayBlockingQueue<>(100);
        WorkerThread worker = new WorkerThread(taskQueue);
        worker.start();
        taskQueue.put("Bob");
        Thread.sleep(1000);
        taskQueue.put("Tom");
        Thread.sleep(1000);
        taskQueue.put("Jerry");
        Thread.sleep(1000);
        worker.interrupt();
        worker.join();
        System.out.println("end");

    }
}
