package main.java.readwritelock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Counter {
    final ReadWriteLock lock = new ReentrantReadWriteLock();
    private Lock rLock = lock.readLock();
    private Lock wLock = lock.writeLock();

    private int value = 0;

    public void add(int m) {
        wLock.lock();
        try {
            this.value += m;
        } finally {
            wLock.unlock();
        }
    }

    public void des(int n) {
        wLock.lock();
        try {
            this.value -= n;
        } finally {
            wLock.unlock();
        }
    }

    public int read() {
        rLock.lock();
        try {
            return value;
        } finally {
            rLock.unlock();
        }
    }
}
