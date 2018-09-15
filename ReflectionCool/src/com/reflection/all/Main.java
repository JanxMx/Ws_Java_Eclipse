package com.reflection.all;

import java.lang.reflect.InvocationTargetException;

public class Main {

	public static void main(String[] args) {
		UsingReflection ref = new UsingReflection();
		
		System.out.println("------------ Get Class Object -------------");
		try {
			ref.getClassObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("------------ Get Super Class -------------");
		try {
			ref.getSuperclass();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("------------ Get Classes -------------");
		ref.getClasses();
		
		System.out.println("------------ Get Declared Classes -------------");
		try {
			ref.getDeclaredClasses();
		} catch (SecurityException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("------------ Get Declaring Classes -------------");
		try {
			ref.getDeclaringClass();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("------------ Get Declaring Classes -------------");
		try {
			ref.getPackage();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("------------ Get Modifiers -------------");
		try {
			ref.getModifiers();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("------------ Get Modifiers -------------");
		try {
			ref.getTypeParameters();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("------------ Get Implemented Interfaces -------------");
		try {
			ref.getImplementedInterfaces();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("------------ Get All Public Methods -------------");
		try {
			ref.getAllPublicMethods();
		} catch (SecurityException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("------------ Get All Public Constructors -------------");
		try {
			ref.getAllPublicConstructors();
		} catch (SecurityException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("------------ Get All Public Fields -------------");
		try {
			ref.getAllPublicFields();
		} catch (SecurityException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("------------ Get All Annotations -------------");
		try {
			ref.getAllAnnotations();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("------------ Get Public Field -------------");
		try {
			ref.getPublicField();
		} catch (NoSuchFieldException | SecurityException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("------------ Get Field Declaring Class -------------");
		try {
			ref.getFieldDeclaringClass();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("------------ Get Field Type -------------");
		try {
			ref.getFieldType();
		} catch (NoSuchFieldException | SecurityException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("------------ Get Public Field Value -------------");
		try {
			ref.getSetPublicFieldValue();
		} catch (NoSuchFieldException | SecurityException | ClassNotFoundException | IllegalArgumentException
				| IllegalAccessException e) {
			e.printStackTrace();
		}
		
		System.out.println("------------ Get Private Field Value -------------");
		try {
			ref.getSetPrivateFieldValue();
		} catch (NoSuchFieldException | SecurityException | ClassNotFoundException | IllegalArgumentException
				| IllegalAccessException e) {
			e.printStackTrace();
		}
		
		System.out.println("------------ Get Public Method -------------");
		try {
			ref.getPublicMethod();
		} catch (NoSuchMethodException | SecurityException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("------------ Invoking Public Method -------------");
		try {
			ref.invokingPublicMethod();
		} catch (NoSuchMethodException | SecurityException | ClassNotFoundException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		
		System.out.println("------------ Invoking Private Method -------------");
		try {
			ref.invokingPrivateMethods();
		} catch (NoSuchMethodException | SecurityException | ClassNotFoundException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		
		System.out.println("------------ Get Public Constructor -------------");
		try {
			ref.getPublicConstructor();
		} catch (NoSuchMethodException | SecurityException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("------------ Instantiate Object Using Constructor -------------");
		try {
			ref.instantiateObjectUsingConstructor();
		} catch (NoSuchMethodException | SecurityException | ClassNotFoundException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		
	}
}
