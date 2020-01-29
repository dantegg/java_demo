package main.java.test;

public class SharedObject {

    final Object lockA = new Object();
    final Object lockB = new Object();

    int accountA = 1000;
    int accountB = 2000;

    public void a2b(int balance) {
        synchronized (lockA) {
            accountA -= balance;
            synchronized (lockB) {
                accountB += balance;
            }
        }
    }

    public void b2a(int balance) {
        synchronized (lockA) {
            accountA += balance;
            synchronized (lockB) {
                accountB -= balance;

            }
        }

    }
}
