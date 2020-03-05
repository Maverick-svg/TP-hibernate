//package main;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//
//import dao.FormationDAO;
//import dao.IFormationDAO;
//import dao.ILieuDAO;
//import dao.LieuDAO;
//import fr.adaming.model.Formation;
//import fr.adaming.model.Lieu;
//
//public class Main {
//	SessionFactory factory = new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();
//	Session session = factory.openSession();
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Lieu L1 = new Lieu("30 rue du plein", "Lille");
//		Lieu L2 = new Lieu("2 avenu jean", "Bordeau");
//		
//		ILieuDAO daoL = new LieuDAO();
//		daoL.creatLieu(L1);
//		daoL.creatLieu(L2);
//		
//		Formation F1 = new Formation("Math", L1);
//		Formation F2 = new Formation("Histoire", L2);
//		Formation F3 = new Formation("Français", L2);
//		
//		IFormationDAO daoF = new FormationDAO();
//		
//		daoF.addFormation(F1);
//		daoF.addFormation(F2);
//		daoF.addFormation(F3);
//		
//		System.out.println("formation ajouté");
//	}
//
//}
