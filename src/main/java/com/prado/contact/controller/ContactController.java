package com.prado.contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prado.contact.entity.Contact;
import com.prado.contact.service.ContactService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/contacts")
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@PostMapping("/save")
	public Contact saveContact(@RequestBody Contact contact) {
		log.info("Contact Controller: Save Contact: " + contact);
		return contactService.saveContact(contact);
	}
	
	@GetMapping("/fetch/{id}")
	public Contact findContact(@PathVariable("id") Long contactId) {
		log.info("Contact Controller: Find Contact: " + contactId);
		return contactService.findContact(contactId);
	}
}
