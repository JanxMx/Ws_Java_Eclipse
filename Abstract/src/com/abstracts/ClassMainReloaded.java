package com.abstracts;

import com.abstracts.animal.interfaces.Cazar;
import com.abstracts.animal.vertebrados.mamiferos.*;

public class ClassMainReloaded {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {

		CreateGeneric cg = new CreateGeneric();

		Perro perro = (Perro) cg.createAnimal(Perro.class);
		if(isCazador(perro)) {
			perro.describeCaza();
		}
		Gato gato = (Gato) cg.createAnimal(Gato.class);
		if(isCazador(gato)) {
			gato.describeCaza();
		}
		cg.createAnimal(Ardilla.class);
		cg.createAnimal(Caballo.class);
		cg.createAnimal(Conejo.class);
		Coyote coyote = (Coyote) cg.createAnimal(Coyote.class);
		if(isCazador(coyote)) {
			coyote.describeCaza();
		}
		
	}
	
	public static boolean isCazador(Object obj) {
		return obj instanceof Cazar ? true: false;
	}
	

}
