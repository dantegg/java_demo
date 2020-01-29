package main.java.reentrance;

import org.junit.jupiter.api.Test;

public class Main {
    public static int LOOP = 10;
    public static void main(String[] args) throws Exception {
        Counter counter = new Counter();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < LOOP; i++) {
                    counter.incr(1);
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < LOOP; i++) {
                    counter.desc(1);
                }
            }
        };
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("end " + counter.getValue());
    }

    @Test
    public void testReentran() throws Exception {
        TestReentrant testReentrant = new TestReentrant();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < LOOP; i++) {
                    testReentrant.incr1();
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < LOOP; i++) {
                    testReentrant.incr2();
                }
            }
        };
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("end" + testReentrant.getArr());
    }
}
