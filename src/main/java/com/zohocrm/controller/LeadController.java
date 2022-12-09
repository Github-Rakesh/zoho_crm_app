package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Contacts;
import com.zohocrm.entities.Lead;
import com.zohocrm.services.ContactServices;
import com.zohocrm.services.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@Autowired
	private ContactServices contactServices;
	
	@GetMapping("/createLeadPage")
	public String viewLeadPage() {
		return "create_lead";
	}
	
	@RequestMapping("/saveNewLead")
	public String saveLead(@ModelAttribute("lead") Lead leads,Model model) {
		leadService.saveOneLead(leads);
		model.addAttribute("lead", leads);
		return "lead_info";
	}
	
	@RequestMapping("/listall")
	public String ListAllMethod(Model model) {
		List <Lead> lead = leadService.ListAllMethod();
		model.addAttribute("list", lead);
		return "list_all";
	}
	
	@RequestMapping("/deleteLead")
	public String deleteById(@RequestParam("id") long id,Model model) {
		leadService.deleteById(id);
		List <Lead> lead = leadService.ListAllMethod();
		model.addAttribute("list", lead);
		return "list_all";
	}
	
	@RequestMapping("/contactDetails")
	public String findLeadById(@RequestParam("id") long id, Model model) {
		Lead lead = leadService.findLeadById(id);
		Contacts contact = new Contacts();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setSource(lead.getSource());
		
		contactServices.saveContact(contact);
		
		leadService.deleteById(id);
		
		List<Contacts> contacts = contactServices.listAll();
		model.addAttribute("list", contacts);
		return "contactListAll";
	}
	
	@RequestMapping("/leadInfo")
	public String leadInfo(@RequestParam("id") long id, Model model) {
		Lead findLeadById = leadService.findLeadById(id);
		model.addAttribute("lead", findLeadById);
		return "lead_info";
	}
	
}












