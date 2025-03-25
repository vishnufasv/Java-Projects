package thread;

public class AllStateOfThread implements Runnable {
	public void run()
	{
		try
		{
			Thread.sleep(1500);
		}
		catch (InterruptedException e) {
			
			e.printStackTrace();
			
		}
		System.out.println("state of thread1 while it called joint()");
		AllStateOfThreads.thread1.getState();
		
		try {
			Thread.sleep(200);
		}
		catch(InterruptedException e) {
			
			e.printStackTrace();
		}
	}
		public class AllStateOfThreads implements Runnable{
		 public static Thread thread1;
		 public static AllStateOfThread obj;
		 public static void main(String[]args) {
			 obj=new AllStateOfThread();
			 thread1=new Thread(obj);
			 System.out.println("state of thread1 after creating it ");
			 thread1.getState();
			 thread1.start();
			 System.out.println("after calling start()");
			 thread1.getState();
		 }
		 public void run()
		 {
			 AllStateOfThreads myThread= new AllStateOfThreads();
			 Thread thread2=new Thread(myThread);
			 System.out.println("state of thread2 after creating it ");
			 thread2.getState();
			 thread2.start();
			 System.out.println("after calling start()");
			 thread2.getState();
			 
		 }
			
		}}