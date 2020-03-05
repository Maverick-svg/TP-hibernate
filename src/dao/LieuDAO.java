package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import fr.adaming.model.Formation;
import fr.adaming.model.Lieu;

public class LieuDAO implements ILieuDAO{
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	
	@Override
	public int creatLieu(Lieu l1) {
		try {
			Session session = factory.openSession();
			session.beginTransaction();
			session.save(l1);
			session.getTransaction().commit();
			session.close();
		
			return 1;
			}catch(HibernateException e) {
				e.printStackTrace();
			return 0;
			}
		
	}

	@Override
	public List<Lieu> getLieu() {
		List<Lieu> list = new ArrayList();
		
		try {
			Session session = factory.openSession();
			session.beginTransaction();
			list = session.createQuery("from Lieu").list();
			System.out.println("coucou DAo");
			return list;
			
			
		}catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("enrevoir dao");
			return null;
		}
		

	}
}
