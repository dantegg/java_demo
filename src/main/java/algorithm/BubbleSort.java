package algorithm;

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
                System.out.println("compare:"  + arr[j]);
                if(arr[j]>arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("after:");
        for (int i = 0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
