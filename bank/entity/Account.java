package bank.entity;

public class Account {
	private int id;
	private String name;
	private double balance;

	public Account() {

	}

	public Account(int id, String name) {

		this.id = id;
		this.name = name;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addBalance(double balance) {
		this.balance += balance;
	}

	public void transferMoney(Account acc, double amt) {
		if (this.balance >= amt) {
			acc.addBalance(amt);
			balance = balance - amt;
		}

	}
}
