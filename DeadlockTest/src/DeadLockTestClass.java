public class DeadLockTestClass {

	static DeadLockTestClass deadLockTestClass= new DeadLockTestClass(); ;

	

	public static void main(String[] args) {

		ThreadOne t1 = new ThreadOne(deadLockTestClass);
		t1.start();

		ThreadTwo t2 = new ThreadTwo(deadLockTestClass);
		t2.start();

	}

	public void method1() {
		synchronized (String.class) {
			System.out.println("Aquired lock on String.class object");
			synchronized (Integer.class) {
				System.out.println("Aquired lock on Integer.class object");
			}
		}
	}

	public void method2() {
		synchronized (Integer.class) {
			System.out.println("Aquired lock on Integer.class object");
			synchronized (String.class) {
				System.out.println("Aquired lock on String.class object");
			}
		}
	}

}

class ThreadOne extends Thread {
	DeadLockTestClass deadlolck;

	public ThreadOne(DeadLockTestClass d) {
		deadlolck = d;
	}

	public void run() {
		// TODO Auto-generated method stub
		super.run();
		deadlolck.method1();

	}
}

class ThreadTwo extends Thread {
	DeadLockTestClass deadlolck;

	public ThreadTwo(DeadLockTestClass d) {
		deadlolck = d;
	}

	public void run() {
		// TODO Auto-generated method stub
		super.run();
		deadlolck.method2();
	}
}
