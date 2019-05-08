package test;

public class Bthread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < MainTest.LOOP; i++) {
            MainTest.shared.b2a(1);
            if (i % 100 == 0) {
                System.out.println("hahaha");
            }
        }
    }
}
