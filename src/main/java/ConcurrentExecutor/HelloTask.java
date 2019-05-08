package ConcurrentExecutor;

import java.time.LocalTime;

public class HelloTask implements Runnable {
    String name;

    public HelloTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("hello, " + name + "!Its " + LocalTime.now());
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Goodbye, " + name + "!Its" + LocalTime.now());
    }
}
