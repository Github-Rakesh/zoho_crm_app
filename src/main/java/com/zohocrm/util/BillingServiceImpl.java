package com.zohocrm.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Billing;
import com.zohocrm.repositories.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {
	
	@Autowired
	private BillingRepository billingRepo;

	@Override
	public void saveBillingContacts(Billing bill) {
		billingRepo.save(bill);
	}

	@Override
	public List<Billing> listAllBill() {
		List<Billing> findAll = billingRepo.findAll();
		return findAll;
	}

	@Override
	public void deleteById(long id) {
		billingRepo.deleteById(id);
	}

}
