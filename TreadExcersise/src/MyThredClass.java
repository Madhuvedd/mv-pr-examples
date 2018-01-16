public class MyThredClass implements Runnable {

	Person p;

	public MyThredClass(Person p) {
		this.p = p;
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThredClass(new Person("Mukund")));
		t1.start();
		Thread t2 = new Thread(new MyThredClass(new Person("Ved")));
		t2.start();
		Thread t3 = new Thread(new MyThredClass(new Person("Madhu")));
		t3.start();

	}

	public void run() {
		for (int i = 0; i < 3; i++) {
	        try {
	            Account acc = Account.getAccount(p);
	            acc.withdraw(100);
	            try {
	                Thread.sleep(200);
	            } catch (InterruptedException ex) {
	            }
	            if (acc.getBal() < 0) {
	                System.out.println("account is overdrawn!");
	            }
	            acc.deposite(200);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    System.out.println("Final Acc balance is Rs." + Account.getBal());
	

	}

}
