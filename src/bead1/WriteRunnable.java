package bead1;

public class WriteRunnable implements Runnable{

    int id;

    public WriteRunnable(int id){
        this.id = id;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(id + " ");
        }
    }
}
