package ConcurrentAtomic;

public class Main {

    private static int LOOP = 10000;

    public static void main(String[] args) throws Exception {
        main.java.ConcurrentAtomic.Counter c = new main.java.ConcurrentAtomic.Counter();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < LOOP; i++) {
                    c.add(1);
                }
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < LOOP; i++) {
                    c.des(1);
                }
            }
        };
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("c value is : " + c.get());
        System.out.println("end");

    }
}
