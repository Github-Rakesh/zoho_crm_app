package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Billing;
import com.zohocrm.entities.Contacts;
import com.zohocrm.services.ContactServices;
import com.zohocrm.util.BillingService;

@Controller
public class BillingController {

	@Autowired
	private ContactServices contactService;

	@Autowired
	private BillingService billingService;
	
	@RequestMapping("/billingContact")
	public String billingContact(@RequestParam("id") long id, Model model) {
		Contacts contact = contactService.findBillingById(id);
		model.addAttribute("contact", contact);
		return "create_billing";
	}

	@RequestMapping("/generateBill")
	public String generateBill(@ModelAttribute("bill") Billing bill, Model model) {
		billingService.saveBillingContacts(bill);
		List<Billing> billing = billingService.listAllBill();
		model.addAttribute("bill", billing);
		return "list_all_bill";
	}
	
	@RequestMapping("/deleteBill")
	public String deleteBill(@RequestParam("id") long id,Model model) {
		billingService.deleteById(id);
		List<Billing> billing = billingService.listAllBill();
		model.addAttribute("bill", billing);
		return "list_all_bill";
	}
	
	@RequestMapping("/listBill")
	public String listBill(Model model) {
		List<Billing> billing = billingService.listAllBill();
		model.addAttribute("bill", billing);
		return "list_all_bill";
	}
	
}
