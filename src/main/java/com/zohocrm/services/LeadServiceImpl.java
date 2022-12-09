package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Lead;
import com.zohocrm.repositories.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	private LeadRepository leadRepo;
	
	@Override
	public void saveOneLead(Lead leads) {
		leadRepo.save(leads);
	}

	@Override
	public List<Lead> ListAllMethod() {
		List<Lead> list = leadRepo.findAll();
		return list;
	}

	@Override
	public void deleteById(long id) {
		leadRepo.deleteById(id);
	}

	@Override
	public Lead findLeadById(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}

}
