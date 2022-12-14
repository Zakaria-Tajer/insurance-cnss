package Dao;

import Models.Dossier;
import Models.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DossierDao {
    private Configuration con;
    private SessionFactory factory;
    private Session session;
    private Transaction transaction;


    public void saveDossier(Dossier dossier) {
        con =  new Configuration().configure("hibernate.cfg.xml");
        factory = con.buildSessionFactory();
        session = factory.openSession();
        transaction = session.beginTransaction();
        session.persist(dossier);
        transaction.commit();
    }
}
