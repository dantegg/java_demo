package main.java.test;

public class DesThread extends Thread {
    Counter counter;

    public DesThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < MainTest.LOOP; i++) {
            counter.des(1);
        }
    }
}
