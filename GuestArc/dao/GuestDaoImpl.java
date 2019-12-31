package dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import entities.Guest;
import exception.GuestFoundException;
import util.GuestIdComparator;

public class GuestDaoImpl implements GuestDao {
	Map<Integer,Guest> store =new HashMap<>();
	@Override
	public void addGuest(Guest e) {
		   store.put(e.getId(), e);
		
	}

	@Override
	public Guest findById(int id) {
		 Guest e = store.get(id);
	        if (e == null) {
	            throw new GuestFoundException("guest not found for id=" + id);
	        }
	        return e;
	}

	@Override
	public Set<Guest> allGuest() {
		  Collection<Guest> guest = store.values();
	        Set<Guest> guestSet = new TreeSet<>(new GuestIdComparator());
	        guestSet.addAll(guest);
	        return guestSet;
	}

}
