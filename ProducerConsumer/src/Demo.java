
public class Demo {
	
	
	
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		Producer pr = new Producer(bank);
		Consumer cr = new Consumer(bank);
		//Consumer1 cr1 = new Consumer1(bank);
		
		Thread t1 = new Thread(pr);
		Thread t2 = new Thread(cr);
		//Thread t3 = new Thread(cr1);
		
		t1.start();
		t2.start();
		//t3.start();
	}

}
