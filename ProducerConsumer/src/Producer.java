public class Producer implements Runnable {
	Bank bank;

	public Producer(Bank b) {
		bank = b;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
            
			bank.deposit(500);
			System.out.println("producer = " +500);
			try {
	            Thread.sleep(1000);
	         } catch (InterruptedException e) { }
		}

	}

}
