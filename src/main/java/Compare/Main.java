package Compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person(1L, "haha");
        Person p2 = new Person(1L, "haha");
        List<Person> l1 = Arrays.asList(p1);
        List<Person> l2 = Arrays.asList(p2);

        if (l1.containsAll(l2)) {
            System.out.println("vvv");
        } else {
            System.out.println("fff");
        }

        Double dd = new Double(0.0);
        Double bb = new Double(0.0);
        List<Double> d1 = Arrays.asList(dd);
        List<Double> d2 = Arrays.asList(bb);

        if (d1.containsAll(d2)) {
            System.out.println("xxx");
        } else {
            System.out.println("nnn");
        }


    }
}
