package test.generic;

public class Util {
    public static <T extends Comparable> void sort(T[] array) {

    }

    private static <T extends Comparable> void sort(T[] arry, int left, int right) {
        if (left<right) {
            int q = partition(arry, left, right);
            sort(arry, left, q-1);
            sort(arry, q+1, right);
        }
    }

    private static <T extends Comparable> int partition(T[] array, int left, int right) {
        int i = left - 1;
        for(int j = left;j<right;j++) {
            if(array[j].compareTo(array[right]) <= 0) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i+1, right);
        return i+ 1;
    }

    private static <T> void  swap(T[] array, int i, int j) {
        T t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
}
