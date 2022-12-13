package Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class RadioDao {

    private Configuration con;
    private SessionFactory factory;
    private Session session;
    private Transaction transaction;
    public Object getRadios() {
        con =  new Configuration().configure("hibernate.cfg.xml");
        factory = con.buildSessionFactory();
        session = factory.openSession();
        transaction = session.beginTransaction();
        Query query = session.createQuery("SELECT radio_name, id , radio_unique_id FROM Radio ");
        return query.list();
    }
}
