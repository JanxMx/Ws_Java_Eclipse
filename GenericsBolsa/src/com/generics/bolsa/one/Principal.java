package com.generics.bolsa.one;

public class Principal {

	public static void main(String[] args) {
		BolsaGeneric<Chocolatina> bolsaGeneric = new BolsaGeneric<>(3);
		Chocolatina c1 = new Chocolatina("milka");
		Chocolatina c2 = new Chocolatina("milka");
		Chocolatina c3 = new Chocolatina("ferrero");
		
		bolsaGeneric.add(c1);
		bolsaGeneric.add(c2);
		bolsaGeneric.add(c3);
		//bolsaGeneric.add(c1);
		
		for(Object o:bolsaGeneric) {
			System.out.println(((Chocolatina)o).getMarca());
		}
		
		BolsaGeneric<Golosina> bolsaGeneric2 = new BolsaGeneric<>(3);
		Golosina g1 = new Golosina("gominola");
		Golosina g2 = new Golosina("chicle");
		Golosina g3 = new Golosina("paleta");
		
		bolsaGeneric2.add(g1);
		bolsaGeneric2.add(g2);
		bolsaGeneric2.add(g3);
		//bolsaGeneric2.add(g1);		
		
		for(Object o:bolsaGeneric2) {
			System.out.println(((Golosina)o).getNombre());
		}		
		
	}
}
