package main.java.waitandnotify;

import java.util.LinkedList;
import java.util.Queue;

public class TaskQueue {
    final Queue<String> queue = new LinkedList<>();

    public synchronized String getTask() throws InterruptedException{
        while (this.queue.isEmpty()) {
            this.wait();
        }

        return this.queue.remove();
    }

    public synchronized void addTask(String task) throws InterruptedException {
        queue.add(task);
        this.notifyAll();
    }
}
