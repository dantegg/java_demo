package algorithm;

import org.junit.jupiter.api.Test;

public class QuickSort {


    public void sort(int[] arr, int low, int high) {
        if (low > high) {
            return;
        }
        int key = arr[low];
        int i = low;
        int j = high;
        while(i<j) {
            while (i<j && arr[j] > key) {
                j--;
            }
            if (i<j) arr[i++] = arr[j];
            while (i<j && arr[i] <= key) {
                i++;
            }
            if (i<j) arr[j--] = arr[i];
        }
        arr[i] = key;
        sort(arr, low, i-1);
        sort(arr, i+1, high);
    }

    @Test
    public void testDemo() {
        int[] arr = {3,5, 2,6,1,7,9,11,23,12,41,8,9};
        System.out.println("quick sort begin:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("==================");
        System.out.println("quick result is:");
        sort(arr, 0, arr.length -1 );
        for (int re : arr) {
            System.out.print(re + " ");
        }
    }
}
