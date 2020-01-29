package main.java.ThreadLocalLearn;

public class Main {
    public static void main(String... args) throws Exception {
        Thread t1 = new ProcessThread(new User("bob", 10));
        Thread t2 = new ProcessThread(new User("jerry", 10000));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("end");
    }
}
