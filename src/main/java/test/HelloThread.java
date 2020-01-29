package main.java.test;

public class HelloThread extends Thread {
    volatile Boolean running = true;
    @Override
    public void run() {
        while (running) {
            System.out.println("thread is going");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("thread end");
    }
}
