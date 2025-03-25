package thread;

public class ThreadSync {
    private final String name; 
    public ThreadSync(String name) {
        this.name = name;
    }
    public String getName() {  
        return this.name;
    }
    public synchronized void call(ThreadSync caller) {
        System.out.println(this.getName() + " has asked to call me " + caller.getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        caller.callMe(this); 
    }
    public synchronized void callMe(ThreadSync caller) {
        System.out.println(this.getName() + " has been called by " + caller.getName());
    }
    public static void main(String[] args) {
        ThreadSync caller1 = new ThreadSync("caller-1");
        ThreadSync caller2 = new ThreadSync("caller-2");
        new Thread(new Runnable() {
            public void run() {
                caller1.call(caller2);
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                caller2.call(caller1);
            }
        }).start();
    }
}

