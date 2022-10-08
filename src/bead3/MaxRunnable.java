package bead3;

public class MaxRunnable implements Runnable {
    private int[] arr;
    private volatile int max = Integer.MAX_VALUE;
    public MaxRunnable(int[] arr) {
        this.arr = arr;
        this.max = arr[0];
    }

    public void run() {
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
    }
    public int getMax() {
        return max;
    }
}
