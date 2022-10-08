package bead2;

import java.util.Arrays;

public class Main {
    static int sumArr(int[] arr) throws InterruptedException {
        int split = arr.length/2;
        int[] a = Arrays.copyOfRange(arr, 0, split);
        int[] b = Arrays.copyOfRange(arr, split, arr.length);

        SumRunnable sum1 = new SumRunnable(a);
        SumRunnable sum2 = new SumRunnable(b);

        Thread t1 = new Thread(sum1);
        Thread t2 = new Thread(sum2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        int result1 = sum1.getSum();
        System.out.println(result1);
        int result2 = sum2.getSum();
        System.out.println(result2);

        return result1 + result2;
    }

    public static void main(String[] args) throws InterruptedException {

        int[] arr = {1,2,3,4,5,6};
        System.out.println(sumArr(arr));
    }
}