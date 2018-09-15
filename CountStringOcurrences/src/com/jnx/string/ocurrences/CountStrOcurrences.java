package com.jnx.string.ocurrences;

import java.util.ArrayList;
import java.util.List;

public class CountStrOcurrences {

	public static void main(String[] args) {

		String text1 = "cuenta la ocurrencia de las letras de este texto"; 
		String text2 = "esta es una segunda prueba de texto";
		String text3 = "probando de nueva cuenta este algoritmo con un texto";
		
		CountOcurrence x = new CountOcurrence(text1);
		x.countAll(text2);
		x.countAll(text3);
		
	}
}

class CountOcurrence {

	public CountOcurrence(String text) {
		this.countAll(text);	
	}
	
	public void countAll(String text) {
		System.out.println("----------------");
		int lenOriginal = text.length();
		System.out.println("Len:" + lenOriginal + " - " + text);
		text = text.replace(" ","");
		int lenTemp = text.length();
		System.out.println("espacios:" + (lenOriginal - lenTemp));
		
		List<Integer> part = new ArrayList<>(3);
		
		getChar(text);
	}
	
	private void getChar(String text) {
		int lenOriginal = text.length();
		
		if(lenOriginal==0) {
			System.out.println("Len:0 - << la cadena de texto esta vacia >>");
			return;
		}
		
		System.out.println("Len:" + lenOriginal + " - " + text);
		
		String firstCharacter = text.substring(0,1);	
		text = text.replace(firstCharacter,"");
		int lenTemp = text.length();
		System.out.println(" " + firstCharacter + ": -" + (lenOriginal - lenTemp));
		getChar(text);
		
		return;
	}
}

// Heap & Stack