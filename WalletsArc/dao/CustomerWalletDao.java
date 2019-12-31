package dao;

import java.util.Set;

import entities.CustomerWallet;

public interface CustomerWalletDao {
	
	    void addCustomer(CustomerWallet e);

	    CustomerWallet findByMobileNo(String mobileNo);
	    
	    CustomerWallet transferMoney(CustomerWallet sender,CustomerWallet receiver, double amt);

	    Set<CustomerWallet> allCustomer();
	}


