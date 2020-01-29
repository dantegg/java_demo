package main.java.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FindMaxCount {

    public static void main(String... args) {
        // find max count char from a string demo
        String a = "djdnvalgqevzccdgqjnma";
        String[] vv = a.split("");
        HashSet<String> ss = new HashSet<>();
        HashMap<String, Integer> count = new HashMap<>();
        for (String s : vv) {
            System.out.println(s);
            ss.add(s);
        }
        ss.forEach(s -> {
            Integer num = 0;
            for (String s1 : vv) {
                if (s1.equals(s)) {
                    num++;
                }
            }
            count.put(s, num);
        });
        for(Map.Entry<String, Integer> e : count.entrySet()) {
            System.out.println("char:" + e.getKey() + ", num:"+ e.getValue()) ;
        }
    }
}
