package net.viralpatel.contact.service.impl;

import java.io.Serializable;
import java.util.List;

import net.viralpatel.contact.dao.ManagerDAO;
import net.viralpatel.contact.service.Manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ManagerImpl implements Manager {

	@Autowired
	private ManagerDAO managerDAO;

	@Transactional
	public <T> List<T> getObjects(Class<T> clazz) {
		return managerDAO.getObjects(clazz);
	}

	@Transactional
	public <T> T getObject(Class<T> clazz, Serializable id) {
		return managerDAO.getObject(clazz, id);
	}

	@Transactional
	public void saveObject(Object obj) {
		managerDAO.saveObject(obj);

	}

	@Transactional
	public <T> void removeObject(Class<T> clazz, Serializable id) {
		managerDAO.removeObject(clazz, id);
	}

}
