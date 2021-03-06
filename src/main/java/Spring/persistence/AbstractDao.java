package Spring.persistence;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void persist(Object entity) {
		
		getSession().merge(entity);
	}

	public void update(Object entity) {
		getSession().update(entity);
	}

	public void delete(Object entity) {
		getSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public List<Object> getByObject(String request) {

		return getSession().createQuery(request).list();
	}

	public Object getObject(Class obj, Long id) {

		return getSession().load(obj, id);

	}
	
	

}
