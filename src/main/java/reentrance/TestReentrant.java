package reentrance;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestReentrant {
    final Lock lock = new ReentrantLock();
    private List<Integer> arr = new ArrayList<>();

    public void incr1() {
        lock.lock();
        try {
            arr.add(1);
        } finally {
            lock.unlock();
        }
    }

    public void incr2() {
        lock.lock();
        try {
            arr.add(2);
        } finally {
            lock.unlock();
        }
    }



    public List<Integer> getArr() {
        return this.arr;
    }
}
