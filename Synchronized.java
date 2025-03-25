package swing;

public class Synchronized {
    synchronized void print(int n) {
        for (int i = 0; i <= 5; i++) {
            System.out.println(n * i); 
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    static class Thread1 extends Thread {
        Synchronized t;

        Thread1(Synchronized t) {
            this.t = t;
        }

        public void run() {
            t.print(5);
        }
    }
    static class Thread2 extends Thread {
        Synchronized t;

        Thread2(Synchronized t) {
            this.t = t;
        }

        public void run() {
            t.print(10);
        }
    }
    public static void main(String[] args) {
        Synchronized obj = new Synchronized();
        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);
        t1.start();
        t2.start();
    }
}