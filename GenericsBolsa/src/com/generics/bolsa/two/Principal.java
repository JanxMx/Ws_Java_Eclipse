package com.generics.bolsa.two;

public class Principal {

	public static void main(String[] args) {
		
		BolsaGeneric<Dulce> bolsaGeneric = new BolsaGeneric<>(5);
		
		Chocolatina c1 = new Chocolatina("Chocolatina","Milka");
		Chocolatina c2 = new Chocolatina("Chocolatina", "Carlos V");
		Chocolatina c3 = new Chocolatina("Chocolatina", "Ferrero");
		Golosina g1 = new Golosina("Golosina", "Gominola");
		Golosina g2 = new Golosina("Golosina", "Chicle");
		Golosina g3 = new Golosina("Golosina", "Paleta");
		
		bolsaGeneric.add(c1);
		bolsaGeneric.add(c2);
		bolsaGeneric.add(c3);
		bolsaGeneric.add(g1);
		bolsaGeneric.add(g2);
		bolsaGeneric.add(g3);
		
		for(Object o:bolsaGeneric) {
			
			if(o instanceof Chocolatina) {
				System.out.println("tipo:" + ((Dulce)o).getTipo() + "-" + ((Chocolatina)o).getMarca());
			}else if(o instanceof Golosina) {
				System.out.println("tipo:" + ((Dulce)o).getTipo() + "-" + ((Golosina)o).getNombre());
			}
		}
	}
}
