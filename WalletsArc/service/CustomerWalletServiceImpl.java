package service;

import java.util.Set;

import dao.CustomerWalletDao;
import entities.CustomerWallet;
import exception.IncorrectMobileNoException;

public class CustomerWalletServiceImpl implements CustomerWalletService {
	private CustomerWalletDao dao;

	public CustomerWalletServiceImpl(CustomerWalletDao dao) {
		this.dao = dao;
	}

	@Override
	public void addCustomer(CustomerWallet e) {
		dao.addCustomer(e);
	}

	@Override
	public CustomerWallet findByMobileNo(String mobileNo) {
		if (mobileNo == null) {
			throw new IncorrectMobileNoException("id is incorrect");
		}
		CustomerWallet e = dao.findByMobileNo(mobileNo);
		return e;
	}

	@Override
	public Set<CustomerWallet> allCustomer() {
		Set<CustomerWallet> cust = dao.allCustomer();
		return cust;

	}

}
