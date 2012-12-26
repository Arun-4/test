package net.viralpatel.contact.service;

import java.util.List;

import net.viralpatel.contact.model.Contact;

public interface ContactService {
	
	public void addContact(Contact contact);
	public List<Contact> listContact();
	public void removeContact(Integer id);
}
