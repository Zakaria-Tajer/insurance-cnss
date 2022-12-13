package Dao;

import Models.Agent;
import Models.Doctor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class DoctorDao {
    private Configuration con;
    private SessionFactory factory;
    private Session session;
    private Transaction transaction;
    public Object getDoctors() {
        con =  new Configuration().configure("hibernate.cfg.xml");
        factory = con.buildSessionFactory();
        session = factory.openSession();
        transaction = session.beginTransaction();
        Query query = session.createQuery("SELECT doctor_type, id, remboursement FROM Doctor");
        return query.list();
    }
}
