package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import fr.adaming.model.Formation;

public class FormationDAO implements IFormationDAO {
	SessionFactory factory = new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();
	

	@Override
	public int addFormation(Formation formation) {
	
		try {
			Session session = factory.openSession();
			session.beginTransaction();
			session.save(formation);
			session.getTransaction().commit();
			session.close();
		
			return 1;
			}catch(HibernateException e) {
				e.printStackTrace();
			return 0;
			}
	}

	@Override
	public List<Formation> getFormation() {
		List<Formation> list = new ArrayList();
		
		try {
			Session session = factory.openSession();
			session.beginTransaction();
			list = session.createQuery("from Formation").list();
			return list;
			
			
		}catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	
}
