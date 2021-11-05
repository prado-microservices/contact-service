package com.prado.contact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prado.contact.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>{

	Contact findByContactId(Long contactId);
	
}
