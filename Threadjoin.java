package thread;

public class Threadjoin extends Thread {
    public void run() {
        for (int i = 1; i <= 4; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Threadjoin t1 = new Threadjoin();
        Threadjoin t2 = new Threadjoin();
        Threadjoin t3 = new Threadjoin();

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        t2.start();
        t3.start();
    }
}