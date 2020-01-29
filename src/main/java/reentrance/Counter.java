package main.java.reentrance;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {

    final Lock lock = new ReentrantLock();

    private int value = 0;

    public void incr(int m) {
        lock.lock();
        try {
            value += m;
        } finally {
            lock.unlock();
        }
    }

    public void desc(int n) {
        lock.lock();
        try {
            value -= n;
        } finally {
            lock.unlock();
        }
    }

    public int getValue() {
        return value;
    }
}
