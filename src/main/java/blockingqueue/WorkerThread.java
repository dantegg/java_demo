package blockingqueue;

import java.util.concurrent.BlockingQueue;

public class WorkerThread extends Thread {
    BlockingQueue<String> queue;

    public WorkerThread(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            String name = "";
            try {
                name = queue.take();
            } catch (InterruptedException e) {
                break;
            }
            String result = "hello, " + name + "!";
            System.out.println(result);
        }
    }
}
