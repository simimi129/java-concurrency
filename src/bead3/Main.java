package bead3;

import java.util.Arrays;

public class Main {
    static int maxArr(int[] arr) throws InterruptedException {
        int split = arr.length / 2;
        int[] a = Arrays.copyOfRange(arr, 0, split);
        int[] b = Arrays.copyOfRange(arr, split, arr.length);

        MaxRunnable max1 = new MaxRunnable(a);
        MaxRunnable max2 = new MaxRunnable(b);

        Thread t1 = new Thread(max1);
        Thread t2 = new Thread(max2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        int result1 = max1.getMax();
        int result2 = max2.getMax();

        return Math.max(result1, result2);
    }

    public static void main(String[] args) throws InterruptedException {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(maxArr(arr));
    }
}