package com.javawebtutor.hibernate.client;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.javawebtutor.hibernate.model.Bank;
import com.javawebtutor.hibernate.model.Customer;
import com.javawebtutor.hibernate.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		Bank bank = new Bank();
		bank.setBankName("HDFC");
		session.save(bank);
		Date birthDate = new java.util.Date();
		birthDate = new java.util.Date(83, 02, 22);
		Customer customer = new Customer("Mukesh", "Kumar", birthDate,
				"8939651567");
		Customer customer1 = new Customer("Ravi", "Raj", birthDate, "12345678");
		customer.setBank(bank);
		customer1.setBank(bank);

		session.save(customer);
		session.save(customer1);

		session.getTransaction().commit();
		session.close();
	}
}
