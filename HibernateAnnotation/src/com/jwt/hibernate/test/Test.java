package com.jwt.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.jwt.hibernate.Student;

public class Test {
	public static void main(String[] args) {
		Session session = new AnnotationConfiguration().configure()
				.buildSessionFactory().openSession();

		Transaction t = session.beginTransaction();
		Student student = new Student();
		student.setId(1);
		student.setName("Mukesh");
		student.setRoll("101");
		student.setDegree("B.E");
		student.setPhone("99999");
		Student student1 = new Student();
		student1.setId(2);
		student1.setName("Ravi");
		student1.setRoll("102");
		student1.setDegree("B.E");
		student1.setPhone("934499");

		session.persist(student);
		session.persist(student1);

		t.commit();
		session.close();
		System.out.println("successfully saved");

	}
}
