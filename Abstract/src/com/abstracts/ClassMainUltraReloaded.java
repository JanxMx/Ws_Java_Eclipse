package com.abstracts;

import com.abstracts.animal.interfaces.Cazar;
import com.abstracts.animal.vertebrados.mamiferos.*;

public class ClassMainUltraReloaded {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {

		CreateGeneric cg = new CreateGeneric();
		validaCazador((Perro) cg.createAnimal(Perro.class));
		validaCazador((Gato) cg.createAnimal(Gato.class));
		validaCazador((Ardilla) cg.createAnimal(Ardilla.class));
		validaCazador((Caballo) cg.createAnimal(Caballo.class));
		validaCazador((Conejo) cg.createAnimal(Conejo.class));
		validaCazador((Coyote) cg.createAnimal(Coyote.class));
	}
	
	public static <T> void validaCazador(T t) {
		if(t instanceof Cazar) {
			((Cazar)t).describeCaza();
		}
	}
}
