package reentrance;

public class Main {
    public static int LOOP = 10000;
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
}
