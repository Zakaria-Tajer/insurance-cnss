package Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class AnalysisDao {



    private Configuration con;
    private SessionFactory factory;
    private Session session;
    private Transaction transaction;
    public Object getAnalysis() {
        con =  new Configuration().configure("hibernate.cfg.xml");
        factory = con.buildSessionFactory();
        session = factory.openSession();
        transaction = session.beginTransaction();
        Query query = session.createQuery("SELECT analysis_name, id, analysis_uniqueId FROM Analysis");
        return query.list();
    }
}
