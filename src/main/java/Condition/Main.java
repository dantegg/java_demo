package Condition;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        TaskQueue queue = new TaskQueue();
        WorkerThread thread = new WorkerThread(queue);
        thread.start();
        queue.addTask("tom");
        Thread.sleep(1000);
        queue.addTask("jerry");
        Thread.sleep(1000);
        queue.addTask("frank");
        Thread.sleep(1000);
        thread.interrupt();
        thread.join();
        System.out.println("main end");
    }
}
