package dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import entities.CustomerWallet;
import exception.CustomerNotFoundException;

public class CustomerWalletDaoImpl implements CustomerWalletDao {
	  private Map<String, CustomerWallet> store = new HashMap<>();
	@Override
	public void addCustomer(CustomerWallet e) {
		store.put(e.getMobileNo(), e);
		}
	@Override
	public CustomerWallet transferMoney(CustomerWallet sender,CustomerWallet receiver, double amt) {
		if (sender.getBalance() >= amt) {
			receiver.addBalance(amt);
			sender.addBalance(-amt);
		}
		return receiver;

	}

	@Override
	public CustomerWallet findByMobileNo(String mobileNo) {
		 CustomerWallet e = store.get(mobileNo);
	        if (e == null) {
	            throw new CustomerNotFoundException("customer not found for id=" + mobileNo);
	        }
	        return e;
	}

	@Override
	public Set<CustomerWallet> allCustomer() {
		Collection<CustomerWallet> cust = store.values();
        Set<CustomerWallet> custSet = new HashSet<>(cust);
        return custSet;
	}

}
