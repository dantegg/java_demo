package test;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetOfInteger {

    public static void main(String... args) {
        Random random = new Random(47);
        Set<Integer> intset = new HashSet<Integer>();
        for(int i = 0;i<10000;i++) {
            Integer add = random.nextInt(30);
            System.out.println(add+" vvv");
            intset.add(add);
        }
        System.out.println(intset);
    }
}
