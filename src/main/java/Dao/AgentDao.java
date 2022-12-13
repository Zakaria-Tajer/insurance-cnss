package Dao;

import Models.Agent;
import com.sun.net.httpserver.HttpsServer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class AgentDao {
    private Configuration con;
    private SessionFactory factory;
    private Session session;
    private Transaction transaction;

    public void saveData(Agent agent) {
        con =  new Configuration().configure("hibernate.cfg.xml");
        factory = con.buildSessionFactory();
        session = factory.openSession();
        transaction = session.beginTransaction();
        session.persist(agent);
     transaction.commit();
    }

    public Object getAgent(String agentEmail, String agentPassword) {
        con =  new Configuration().configure("hibernate.cfg.xml");
        factory = con.buildSessionFactory();
        session = factory.openSession();
        transaction = session.beginTransaction();
        Query query = session.createQuery("SELECT email, password, uniqueId FROM Agent WHERE email = '"+agentEmail+"'");
        return  query.list();


    }
}
