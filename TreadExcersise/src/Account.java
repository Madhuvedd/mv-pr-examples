public class Account {

	public static Account account;
	private static int balance = 1000;
	private static Person person;

	private Account() {

	}

	public static Account getAccount(Person p) {
		if (account == null) {
			account = new Account();
		}
		account.person = p;
		return account;

	}

	public synchronized void withdraw(int bal) {
		try {
			if (balance >= bal) {
				System.out.println(person.getName() + " "
						+ "is try to withdraw");
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					e.printStackTrace();
				}
				balance = balance - bal;
				System.out.println(person.getName() + " "
						+ "is complete the withdraw");
			} else {
				System.out.println(person.getName() + " "
						+ "doesn't have enough money for withdraw ");
			}
			System.out.println(person.getName() + " " + " withdraw Rs."
					+ balance);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public synchronized void deposite(int bal) {
		try {
			if (bal > 0) {
				System.out.println(person.getName() + " "
						+ " is try to deposit");
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					e.printStackTrace();
				}
				balance = balance + bal;
				System.out.println(person.getName() + " "
						+ "is complete the deposit");
			} else {
				System.out.println(person.getName() + " "
						+ "doesn't have enough money for deposit");
			}
			System.out.println(person.getName() + " " + " deposit Rs."
					+ balance);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int getBal() {
		// TODO Auto-generated method stub
		return balance;
	}
}
