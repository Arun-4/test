package net.viralpatel.contact.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.viralpatel.contact.dao.ContactDAO;
import net.viralpatel.contact.model.Contact;
import net.viralpatel.contact.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactDAO contactDAO;
	
	@Transactional
	public void addContact(Contact contact) {
		contactDAO.addContact(contact);
	}

	@Transactional
	public List<Contact> listContact() {

		return contactDAO.listContact();
		
	}

	@Transactional
	public void removeContact(Integer id) {
		contactDAO.removeContact(id);
	}
}
