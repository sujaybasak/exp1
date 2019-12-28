package bank.ui;

import bank.entity.Account;

public class AccountMain {

	public void printInfo(Account[] obj) {
		System.out.println("Account Details:");
		for (Account ac : obj) {
			System.out.println(" Id: " + ac.getId() + " Name: " + ac.getName() + " Balance: " + ac.getBalance());
		}
	}

	public static void main(String[] args) {
		Account acc[] = new Account[2];
		acc[0] = new Account(1, "Sujay");
		acc[1] = new Account(2, "Sourav");
		acc[0].addBalance(1000);
		acc[1].addBalance(1000);
		AccountMain a = new AccountMain();
		a.printInfo(acc);
		acc[0].transferMoney(acc[1], 100);
		a.printInfo(acc);

	}

}
