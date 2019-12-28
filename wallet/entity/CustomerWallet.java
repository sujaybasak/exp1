package wallet.entity;



public class CustomerWallet {
private String mobileNo;
private String name;
private double balance;
public String getMobileNo() {
	return mobileNo;
}
public String getName() {
	return name;
}
public double getBalance() {
	return balance;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}
public void setName(String name) {
	this.name = name;
}
public void addBalance(double balance) {
	this.balance += balance;
}
public void transferMoney(CustomerWallet acc, double amt) {
	if (this.balance >= amt) {
		acc.addBalance(amt);
		balance = balance - amt;
	}

}
public CustomerWallet(String mobileNo, String name, double balance) {
	this.mobileNo = mobileNo;
	this.name = name;
	this.balance = balance;
}

}
