package concurrent;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class Mutex {
    private final static Object MUTEX = new Object();
    Integer IPOtest = 1;
    Integer testIPOListTest = 2;
    Integer STARMethod = 3;

    public void accessResource() {
        synchronized (MUTEX) {
            try {
                TimeUnit.MINUTES.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void STARMethod() {
        System.out.println("123");
    }

    public static void main(String... args) {
//        final Mutex mutex = new Mutex();
//        for(int i = 0;i<5;i++) {
//            new Thread(mutex::accessResource).start();
//        }

        Pattern p = Pattern.compile(".*(ETF|STAR).*");

        Pattern pattern = Pattern.compile("^[a-z][a-z0-9]*([A-Z][a-z0-9]+)*(DO|IPO|ETF|DTO|VO|DAO|BO|DOList|DTOList|VOList|DAOList|BOList|X|Y|Z|UDF|UDAF|[A-Z])?$");
        if (!p.matcher("STARMethod").matches()) {
            System.out.println("ttt");
        }

    }
}
