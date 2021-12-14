package com.gulukal.embedded_embeddable;

import org.hibernate.Session;

import com.gulukal.hibernate.controller.CityController;
import com.gulukal.hibernate.util.HibernateUtil;

public class EmbeddedPersonMainTest {
	
	public static void main(String[] args) {
		
		PersonEntity personEntity = new PersonEntity();
		personEntity.setName("Cemil");
		personEntity.setSurname("Duman");
		personEntity.setMiddleName("isim");
		personEntity.setEmailAddres("cemil.duman@bilgeadam.com");
		personEntity.setTcNumber("tc:151515");
		personEntity.setPhone("tel:1515155151");
		
		Address address = new Address();
		address.setCity("İstanbul");
		address.setCountry("Türkiye");
		address.setPostCode("+90");
		
		// personEntity.setAddress(new Address(null, null, null));
		personEntity.setAddress(address);
		
		Session session = HibernateUtil.getSessionfactory().openSession();
		session.getTransaction().begin();
		session.persist(personEntity);
		session.getTransaction().commit();
		System.out.println("ekleme tamamdır" + CityController.class);
		
	}
	
}
