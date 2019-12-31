package service;

import java.util.Set;

import dao.GuestDao;
import entities.Guest;
import exception.IncorrectIdException;

public class GuestServiceImpl implements GuestService {
	private GuestDao dao;

	public GuestServiceImpl(GuestDao dao) {
		this.dao = dao;
	}

	@Override
	public void addGuest(Guest e) {
		dao.addGuest(e);

	}

	@Override
	public Guest findById(int id) {
		if (id < 0) {
			throw new IncorrectIdException("id is incorrect");
		}
		Guest e = dao.findById(id);
		return e;
	}

	@Override
	public Set<Guest> allGuest() {
		Set<Guest> guest = dao.allGuest();
		return guest;
	}

}
