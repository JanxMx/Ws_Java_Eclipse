package com.abstracts;

import java.util.Arrays;

import com.abstracts.animal.Animal;
import com.abstracts.animal.vertebrados.mamiferos.*;

public class ClassMain {
	
	public static void main(String[] args) {

		Perro perro = new Perro();
		System.out.println("----------------------------------------------");
		System.out.println("Tipo:     " + perro.getType());
		System.out.println("Subgroup: " + perro.getFirstSubGroup());
		System.out.println("Eat:      " + Arrays.toString(perro.eat()));
		
		Animal gato = new Gato();
		System.out.println("----------------------------------------------");
		System.out.println("Tipo:     " + gato.getType());
		System.out.println("Subgroup: " + gato.getFirstSubGroup());
		System.out.println("Eat:      " + Arrays.toString(gato.eat()));

		Ardilla ardilla = new Ardilla();
		System.out.println("----------------------------------------------");
		System.out.println("Tipo:     " + ardilla.getType());
		System.out.println("Subgroup: " + ardilla.getFirstSubGroup());
		System.out.println("Eat:      " +  Arrays.toString(ardilla.eat()));
		
	}

}
