package test;

public class ThreadLearn implements Runnable {
    String name;

    public ThreadLearn(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(" new thread name " + name);
    }
}
