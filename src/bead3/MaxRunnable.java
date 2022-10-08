package bead3;

import static bead3.Main.max;

public class MaxRunnable implements Runnable {
    private int[] arr;

    public MaxRunnable(int[] arr) {
        this.arr = arr;
    }

    public void run() {
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
    }
}
