package test;

public class Counter {
    public int count = 0;
    public synchronized void add(int num) {
        count +=num;
    }

    public synchronized void des(int num) {
        count -= num;
    }

    public int getCount() {
        return count;
    }
}
