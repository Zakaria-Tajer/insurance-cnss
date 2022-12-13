package Dao;

import Models.Patient;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class PatientDao {
    private Configuration con;
    private SessionFactory factory;
    private Session session;
    private Transaction transaction;


    public Object getPatients() {

        con =  new Configuration().configure("hibernate.cfg.xml");
        factory = con.buildSessionFactory();
        session = factory.openSession();
        transaction = session.beginTransaction();
        Query query = session.createQuery("SELECT patient_name, patient_unique_id, patient_id FROM Patient");
        return query.list();

    }
}
