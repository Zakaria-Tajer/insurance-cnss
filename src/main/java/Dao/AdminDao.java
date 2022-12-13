package Dao;

import Models.Admin;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AdminDao {
    private Configuration con;
    private SessionFactory factory;
    private Session session;
    private Transaction transaction;

    public void saveAdmin(Admin agent) {
        con =  new Configuration().configure("hibernate.cfg.xml");
        factory = con.buildSessionFactory();
        session = factory.openSession();
        transaction = session.beginTransaction();
        session.persist(agent);
        transaction.commit();
    }
}
