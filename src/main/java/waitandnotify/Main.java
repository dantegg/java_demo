package main.java.waitandnotify;

public class Main {


    public static void main(String[] args) throws Exception{
        TaskQueue queue = new TaskQueue();

        WorkerThread worker = new WorkerThread(queue);

        worker.start();
        queue.addTask("tim");
        Thread.sleep(1000);
        queue.addTask("tom");
        Thread.sleep(1000);
        queue.addTask("jerry");
        Thread.sleep(1000);
        worker.interrupt();
        worker.join();
        System.out.println("end");
    }

}
