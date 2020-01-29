package main.java.algorithm;

import java.util.Comparator;

public class AbSortFunc implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return Math.abs((Integer) o1) - Math.abs((Integer) o2);
    }
}
