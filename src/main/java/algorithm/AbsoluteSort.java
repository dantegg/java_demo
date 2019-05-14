package algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 整数按照绝对值sort
 */
public class AbsoluteSort {

    public static void main(String... args) {
        List<Integer> arr = Arrays.asList(1,-1,-8, 4, -6, -2, -7);
        System.out.println("before:" + arr);
        Collections.sort(arr, new AbSortFunc());
        System.out.println("after:" + arr);
    }
}
