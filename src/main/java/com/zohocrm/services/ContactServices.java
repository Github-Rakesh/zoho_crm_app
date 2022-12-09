package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entities.Contacts;

public interface ContactServices {
	public void saveContact(Contacts contacts);

	public List<Contacts> listAll();

	public void deleteById(long id);

	public Contacts findById(long id);

	public Contacts findBillingById(long id);
}
