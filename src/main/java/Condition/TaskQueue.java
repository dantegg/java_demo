package main.java.Condition;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TaskQueue {
    final Queue<String> queue = new LinkedList<>();

    final Lock lock = new ReentrantLock();
    final Condition condition = lock.newCondition();

    public String getTask() throws InterruptedException {
        lock.lock();

        try {
            while (queue.isEmpty()) {
                condition.await();
            }
            return queue.remove();
        } finally {
            lock.unlock();
        }
    }

    public void addTask(String task) throws InterruptedException {
        lock.lock();
        try {
            queue.add(task);
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
