package com.gulukal.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.gulukal.hibernate.entity.CityEntity;
import com.gulukal.hibernate.entity.PersonEntity;
import com.gulukal.inheritance.MsiEntity;



public class HibernateUtil {
	// dış dünyada bununla bu classa erişim sağlayabileceğim.
	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}
	
	// hibernate ile bağlantı kuracağım yer
	private static final SessionFactory sessionFactory = sessionFactoryHibernate();
	
	// method
	private static SessionFactory sessionFactoryHibernate() {
		try {
			// instance
			Configuration configuration = new Configuration();
			
			// entity classlarımızı buraya ekleyeceğiz
			configuration.addAnnotatedClass(CityEntity.class);
			configuration.addAnnotatedClass(MsiEntity.class); // superclasstan aldık
			configuration.addAnnotatedClass(PersonEntity.class);
			
			SessionFactory factory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
			return factory;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
