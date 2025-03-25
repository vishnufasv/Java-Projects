package swing;

public class DeadLock {

	public static void main(String[] args) {
		final String r1 ="gokul";
		final String r2 ="vimal";
		
		Thread t1 = new Thread() {
			public void run () {
			synchronized(r1) {
				System.out.println("Thread1 locked r1");
				try {
					Thread.sleep(500);
				}
				catch(Exception e) {	
				}
				synchronized(r2) {
					System.out.println("Thread1 locked r2");
				}
			}
			}};
			
			Thread t2 = new Thread() {
				public void run() {
					synchronized(r1) {
						System.out.println("Thread2 locked r1");
						try {
							Thread.sleep(500);
						}
						catch(Exception e) {	
						}
						synchronized(r2) {
							System.out.println("Thread2 locked r2");
						}
					}
				}
			};
			t1.start();
			t2.start();
	}

}
