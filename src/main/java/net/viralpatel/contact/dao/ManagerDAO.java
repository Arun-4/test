package net.viralpatel.contact.dao;

import java.io.Serializable;
import java.util.List;

public interface ManagerDAO {

	public <T> List<T> getObjects(Class<T> clazz);

	public <T> T getObject(Class<T> clazz, Serializable id);

	public void saveObject(Object obj);

	public <T> void removeObject(Class<T> clazz, Serializable id);
}
