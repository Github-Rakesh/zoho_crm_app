package com.zohocrm.util;

import java.util.List;

import com.zohocrm.entities.Billing;

public interface BillingService {

	public void saveBillingContacts(Billing bill);

	public List<Billing> listAllBill();

	public void deleteById(long id);

}
