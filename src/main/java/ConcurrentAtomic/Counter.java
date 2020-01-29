package main.java.ConcurrentAtomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private AtomicInteger value = new AtomicInteger(0);

    public int add(int m) {
        return this.value.getAndAdd(m);
    }

    public int des(int m) {
        return this.value.getAndAdd(-m);
    }

    public int get() {
        return this.value.get();

    }
}

