package service;

import java.util.Set;

import entities.CustomerWallet;

public interface CustomerWalletService {
		
	    void addCustomer(CustomerWallet e);

	    CustomerWallet findByMobileNo(String mobileNo);

	    Set<CustomerWallet> allCustomer();
	}

