
public class Consumer1 implements Runnable {
	
	Bank bank;
	
	public Consumer1(Bank bank1) {
		bank = bank1;		
	}

	public void run() {
		
		long amnt = bank.withdraw(400);
		System.out.println("consumer 1 withdrwa = "+amnt);
		
	}

}
