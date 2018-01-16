class MyRunnable implements Runnable {

	static int count;

	public MyRunnable() {
		// TODO Auto-generated constructor stub
	}

	public void run() {
		while (MyRunnable.count <= 10) {
			System.out.println(" sec thread = " + (++MyRunnable.count));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class Demo {

	public static void main(String[] args)   {

		MyRunnable rnnMyRunnable = new MyRunnable();

		Thread thread = new Thread(rnnMyRunnable);
		thread.start();
		
		System.out.println("startying main thread");
		while(MyRunnable.count<=10){
			System.out.println(" main == "+(++MyRunnable.count));
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	}

}
