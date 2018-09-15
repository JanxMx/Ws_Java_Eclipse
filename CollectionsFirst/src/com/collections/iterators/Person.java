package com.collections.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Person implements Iterable {
	
	private String firstName;
	private String lastName;
	private int age;
	private List<Person> children = new ArrayList<Person>();
	
	public Person(String fn, String ln, int a, Person... kids) {
		this.firstName = fn;
		this.lastName = ln;
		this.age = a;
		
		for(Person child: kids) {
			children.add(child);
		}
	}

	public Iterator<Person> iterator() {
		return children.iterator();
	}
	
	public String toString() {
		return "[Person: " + 
				"firstName=" + firstName + " "  +
				"lastName=" + lastName + " " +
				"age=" + age + "]";
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Person> getChildren() {
		return children;
	}

	public void setChildren(List<Person> children) {
		this.children = children;
	}

}
