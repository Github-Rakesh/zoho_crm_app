package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entities.Lead;

public interface LeadService {

	public List<Lead> ListAllMethod();

	void deleteById(long id);

	Lead findLeadById(long id);

	public void saveOneLead(Lead leads);

}
