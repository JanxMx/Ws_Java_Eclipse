package com.jnx.findwords;

import java.util.ArrayList;
import java.util.List;

public class FindWords3 {

	public static void main(String[] args) {

		List<String> letters = new ArrayList<>();
		letters.add("o");
		letters.add("c");
		letters.add("a");
		int[] types = {2};
		
		DiscoverWords3 x = new DiscoverWords3(letters, types);
	}
}

class DiscoverWords3 {

	public DiscoverWords3(List<String> letters, int[] types) {
		this.getWords(letters, types);	
	}
	
	public void getWords(List<String> letters, int[] types) {
		if(letters==null ) {
			System.out.println("la cadena esta vacia.");
			return;
		}
		
		if(types==null ) {
			System.out.println("la longitud para crear palabras es incorrecta.");
			return;
		}		
		
		for(int t: types) {
			System.out.println("---------------");
			createWords(letters, t, null);
		}
	}	
	
	private void createWords(List<String> letters, int len, String base) {
		//System.out.println("letters:" + letters);
		//int lenLetters = letters.size();
		//for(int x=0; x<lenLetters; x++) {
		for(String x: letters) {
			System.out.println("letters:" + letters);
			//System.out.println("len:" + len + " -letra:" + letters.get(x));
			System.out.println("len:" + len + " -letra:" + x);
			/*
			if(len>1) {
				System.out.println("otro...");
				List<String> lettersTemp = letters;
				lettersTemp.remove(0);	
				int lenTemp = len - 1;
				//createWords(lettersTemp , lenTemp, base + letters.get(x));
				createWords(lettersTemp , lenTemp, base + x);
			}*/
			if(len==0) {
				return;
			}
			System.out.println("otro...");
			List<String> lettersTemp = letters;
			lettersTemp.remove(0);	
			int lenTemp = len - 1;
			//createWords(lettersTemp , lenTemp, base + letters.get(x));
			createWords(lettersTemp , lenTemp, base + x);
			

			System.out.println("mmmm...");
		}
		//return;
	}
}
/*
 		for(char x: letters) {
			
		
			for(char x2: text) {
				for(char x2: text) {
					System.out.println("");
				}
			}
		}
		
*/
	
/*	
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
		//System.out.println("firstCharacter:" + firstCharacter);		
		text = text.replace(firstCharacter,"");
		int lenTemp = text.length();
		System.out.println(" " + firstCharacter + ": -" + (lenOriginal - lenTemp));
		getChar(text);
		
		return;
	}
}
*/