package test;

public class Athread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < MainTest.LOOP; i++) {
            MainTest.shared.a2b(1);
            if (i % 100 == 0) {
                System.out.println("xixi");
            }
        }
    }
}
