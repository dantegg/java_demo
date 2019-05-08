package Condition;

public class WorkerThread extends Thread {
    TaskQueue queue;

    public WorkerThread(TaskQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            String name;
            try {
                name = queue.getTask();
            } catch (InterruptedException e) {
                break;
            }
            System.out.println("name is " + name);
        }
    }

}
