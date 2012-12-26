package net.viralpatel.contact.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.viralpatel.contact.dao.ManagerDAO;

@Repository
public class ManagerDAOImpl implements ManagerDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public <T> List<T> getObjects(Class<T> clazz) {
		return sessionFactory.getCurrentSession().createCriteria(clazz).list();
	}

	@SuppressWarnings("unchecked")
	public <T> T getObject(Class<T> clazz, Serializable id) {
		return ((T) sessionFactory.getCurrentSession().get(clazz, id));
	}

	public void saveObject(Object obj) {
		sessionFactory.getCurrentSession().saveOrUpdate(obj);

	}

	public <T> void removeObject(Class<T> clazz, Serializable id) {
		sessionFactory.getCurrentSession().delete(sessionFactory.getCurrentSession().load(clazz, id));
	}
}
