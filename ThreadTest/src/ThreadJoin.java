public class ThreadJoin {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		T2 t2 = new T2();
		t1.start();
		
		/*try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		t2.start();
		//t2.yield();
	
		
	}
}

class Thread1 extends Thread {
	public void run() {
		int i = 0;
		while (i < 10) {
			System.out.println(" t1 " + i);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
			Thread.yield();
		}
	}
}

class T2 extends Thread {
	public void run() {
		int i = 0;
		while (i < 10) {
			System.out.println(" t2 " + i);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
	}
}
