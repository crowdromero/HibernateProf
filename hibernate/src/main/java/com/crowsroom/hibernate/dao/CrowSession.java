package com.crowsroom.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CrowSession {
	
	
	private Session session;
	
	public CrowSession() {
		 
        Configuration configuration=new Configuration();
        configuration.configure();
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        session=sessionFactory.openSession();
        session.beginTransaction();
		
	}

	public Session getSession() {
		
        
        return session;
	}
	
	private void closeSession() {
		//sessionFactory.close();
		

	}

}
