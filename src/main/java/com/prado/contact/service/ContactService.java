package com.prado.contact.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prado.contact.entity.Contact;
import com.prado.contact.repository.ContactRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ContactService {
	
	@Autowired
	private ContactRepository contactRepository;
	
	public Contact saveContact(Contact contact) {
		log.info("Contact Service: save Contact: " + contact);
		return contactRepository.save(contact);
	}
	
	public Contact findContact(Long contactId) {
		log.info("Contact Service: find Contact: " + contactId);
		return contactRepository.findByContactId(contactId);
	}
}
