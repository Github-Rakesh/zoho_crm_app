package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Contacts;
import com.zohocrm.repositories.ContactRepository;

@Service
public class ContactServicesImpl implements ContactServices {

	@Autowired
	private ContactRepository contactRepo;
	
	@Override
	public void saveContact(Contacts contacts) {
		contactRepo.save(contacts);
	}

	@Override
	public List<Contacts> listAll() {
		List<Contacts> findAll = contactRepo.findAll();
		return findAll;
	}

	@Override
	public void deleteById(long id) {
		contactRepo.deleteById(id);
	}

	@Override
	public Contacts findById(long id) {
		Optional<Contacts> findById = contactRepo.findById(id);
		Contacts contacts = findById.get();
		return contacts;
	}

	@Override
	public Contacts findBillingById(long id) {
		Optional<Contacts> findById = contactRepo.findById(id);
		Contacts contacts = findById.get();
		return contacts;
	}

}
