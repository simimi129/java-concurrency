package bead2;

public class SumRunnable implements Runnable{

    private int[] arr;
    private volatile int sum=0;

    public SumRunnable(int[] arr){
        this.arr = arr;
    }

    public void run() {
        for (int i : arr) {
            sum+=i;
        }
    }

    public int getSum(){
        return sum;
    }
}
