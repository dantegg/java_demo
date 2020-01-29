package main.java.ForkJoinTask;

import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Long> {

    static final int THRESHOLD = 500;
    long[] array;
    int start;
    int end;

    SumTask(long[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    protected Long compute() {
        if (end - start <= THRESHOLD) {
            long sum  = 0;
            for (int i = start;i<end;i++) {
                sum += this.array[i];
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {

                }
            }
            return sum;
        }
        int middle = (end + start)/2;
        System.out.println(String.format("Split %d ~ %d ==> %d ~ %d, %d ~ %d", start, end, start, middle, middle, end));
        SumTask subTask1 = new SumTask(this.array, start, middle);
        SumTask subTask2 = new SumTask(this.array, middle, end);
        invokeAll(subTask1, subTask2);
        long result1 = subTask1.join();
        long result2 = subTask2.join();
        Long res = result1 + result2;
        System.out.println(" re1 = " + result1 + ", re2=" + result2);
        return res;
    }
}
