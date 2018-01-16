public class Bank {

	long totalMoney;
	boolean available;

	public synchronized void deposit(int dep) {

		while (available == true) {

			try {

				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//totalMoney = totalMoney + dep;
		//System.out.println("de = " + dep);
		available = true;
		notifyAll();

	}

	public synchronized long withdraw(int withdraw) {

		while (available == false) {

			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		;
		available = false;
		notifyAll();
		return withdraw;

		/*
		 * if (totalMoney > withdraw) {
		 * 
		 * totalMoney = totalMoney - withdraw;
		 * 
		 * notifyAll();
		 * 
		 * return withdraw; } else { System.out.println(" error withdraw ");
		 * notifyAll();
		 * 
		 * return 0; }
		 */
	}

}
