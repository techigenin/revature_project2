package com.revature.festivalapp.util;

import org.hibernate.SessionFactory;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import org.hibernate.cfg.Configuration;

import org.hibernate.service.ServiceRegistry;

import com.revature.festivalapp.pojos.EventRole;
import com.revature.festivalapp.pojos.FestivalEvent;
import com.revature.festivalapp.pojos.Schedule;
import com.revature.festivalapp.pojos.Stage;
import com.revature.festivalapp.pojos.User;

public class SessionFactoryUtil {

private static SessionFactory sf;

	static {

		Configuration configuration = new Configuration().configure();

		configuration.setProperty("hibernate.connection.username", System.getenv("FEST_USERNAME"));

		configuration.setProperty("hibernate.connection.password", System.getenv("FEST_PASSWORD"));

		configuration.setProperty("hibernate.connection.url", "jdbc:postgresql://" + System.getenv("FEST_DATABASE"));

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

		sf = configuration.buildSessionFactory(serviceRegistry);
		
		sf = configuration.configure("hibernate.cfg.xml")
				.addAnnotatedClass(User.class)
				.addAnnotatedClass(EventRole.class)
				.addAnnotatedClass(FestivalEvent.class)
				.addAnnotatedClass(Schedule.class)
				.addAnnotatedClass(Stage.class)
				.buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {

		return sf;

		

	}

}