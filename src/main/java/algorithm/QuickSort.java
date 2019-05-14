package algorithm;

import org.junit.jupiter.api.Test;

public class QuickSort {


    public void sort(int[] arr, int low, int high) {
        int pivot;
        if (low < high) {
            pivot = partition(arr ,low, high);
            sort(arr, low, pivot-1);
            sort(arr, pivot+1, high);
        }
    }

    public int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        while(low < high) {
            while (high > low && arr[high] >= pivot) {
                high --;
            }
            arr[low] = arr[high];
            while(high>low && arr[low] <= pivot) {
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = pivot;
        return low;
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
