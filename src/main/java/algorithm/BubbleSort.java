package main.java.algorithm;

/**
 * @author dantegg
 */
public class BubbleSort {

    public static void main(String... args) {
        int[] arr = {16, 7, 1, 3,4, 10, 9};
        System.out.println("before:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        for (int i = 0;i<arr.length-1;i++) {
            for (int j=0;j<arr.length-i-1;j++) {
                System.out.print("i is " + i + ", j is " + j);
                System.out.println("compare:"  + arr[j]+ ", "+ arr[j+1]);
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("after:");
        for (int i = 0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
