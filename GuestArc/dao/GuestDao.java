package dao;

import java.util.Set;

import entities.Guest;



public interface GuestDao {
	void addGuest(Guest e);

    Guest findById(int id);

    Set<Guest> allGuest();
}
