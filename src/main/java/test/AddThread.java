package test;

public class AddThread extends Thread {
    Counter counter;

    public AddThread(Counter counter) {
        this.counter = counter;
    }
    @Override
    public void run() {
        for (int i = 0; i < MainTest.LOOP; i++) {
            counter.add(1);
        }
    }
}
