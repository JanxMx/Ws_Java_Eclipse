package com.jnx.findwords;

public class FindWords2 {

	public static void main(String[] args) {

		char[] letters = {'o','c','a'};
		int[] types = {2};
		
		DiscoverWords2 x = new DiscoverWords2(letters, types);
	}
}

class DiscoverWords2 {

	public DiscoverWords2(char[] letters, int[] types) {
		this.getWords(letters, types);	
	}
	
	public void getWords(char[] letters, int[] types) {
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
			createWords(letters, t, 0, null);
		}
	}	
	
	private void createWords(char[] letters, int len, int start, String base) {
		
		len = letters.length;
		for(int x=start; x<len; x++) {
		//for(char x: letters) {
			System.out.println("len:" + len + "letra:" + letters[x]);
			if(len>1) {
				createWords(letters , len - 1, start + 1, base + letters[x]);
			}
		}
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