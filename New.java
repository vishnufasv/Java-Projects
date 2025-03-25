package thread;

public class New implements Runnable{
	public void run() {
		System.out.println("thread is running successfully");
	}

	public static void main(String[] args) {
		Runnable a1 = new New();
		Thread a2 =new Thread(a1,"mythread");
		a2.start();
		String str = a2.getName();
		System.out.println(str);
	}

}
