package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Contacts;
import com.zohocrm.services.ContactServices;

@Controller
public class ContactController {
	
	@Autowired
	private ContactServices contactService;
	
	@RequestMapping("/contactListAll")
	private String contactListAll(Model model) {
		List<Contacts> contact = contactService.listAll();
		model.addAttribute("list", contact);
		return "contactListAll";
	}
	
	@RequestMapping("/deleteContactLead")
	public String deleteById(@RequestParam("id") long id,Model model) {
		contactService.deleteById(id);
		List<Contacts> contact = contactService.listAll();
		model.addAttribute("list", contact);
		return "contactListAll";
	}
	
	@RequestMapping("/contactInfo")
	public String findContactInfo(@RequestParam("id") long id,Model model) {
		Contacts contact = contactService.findById(id);
		model.addAttribute("lead", contact);
		return "lead_info";
	}
	
}
