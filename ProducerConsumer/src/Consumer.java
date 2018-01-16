public class Consumer implements Runnable {

	Bank bank;

	public Consumer(Bank bank2) {
		bank = bank2;
	}

	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i =0 ; i< 5 ;i++){
		long ammount = bank.withdraw(500);
		System.out.println(" Consumer= " + ammount);
		}
	}

}
