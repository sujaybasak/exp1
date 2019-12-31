package service;

import java.util.Set;

import entities.Guest;

public interface GuestService {
	void addGuest(Guest e);

    Guest findById(int id);

    Set<Guest> allGuest();

}
