package test;

public class AlgoritmoValidacion {
	public boolean validaNIT(String nitTemp) {
		boolean result = false;
		int digito = 0;
		String cadena = "";
		String dv = "";
		int acumulado = 0;
		String elem = "";
		int elem_int = 0;
		int valor = 0;
		int digito2 = 0;
		String dig2 = "";
		System.out.println("validando nit:" + nitTemp);

		try {
			if (nitTemp.length() == 10) {// persona jurídica(moral)
				System.out.println("moral");
				cadena = nitTemp.substring(0, 8);// cadena sin dígito y sin guiòn
				dv = nitTemp.substring(9, 10);// dígito verificador
System.out.println("cadena:     " + cadena);
System.out.println("dev:        " + dv);
				if (!dv.equals("k"))
					digito = Integer.parseInt(dv);// convierte dígito a entero
System.out.println("digito:     " + digito);
System.out.println("************************");
System.out.println("cadena.length(): " + cadena.length());				
				for (int i = 0; i < (cadena.length()); i++) { // Recorre la cadena
System.out.println("i:"+i);					
					elem = cadena.substring(i, i + 1);// cada elemento de la cadena
					elem_int = Integer.parseInt(elem);// convierte cada elemento a entero
					valor = elem_int * (cadena.length() - i + 1);// Multiplica cada elemento de el arreglo por su peso + 1
					acumulado = acumulado + valor;// Sumatoria de valor
					
System.out.println("elem:  " + elem);
System.out.println("elem_int:  " + elem_int);
System.out.println("valor:  " + valor);
System.out.println("acumulado:  " + acumulado);
				}
System.out.println("************************");				
System.out.println("acumulado:  " + acumulado);
				
				while (acumulado > 11)
					// Saca el módulo de la sumatoria de valor
					acumulado = acumulado - 11;
System.out.println("acumulado2: " + acumulado);

				int modulo = 11 - acumulado; // A once le resta acumulado
System.out.println("modulo:     " + modulo);

				while (modulo > 11)
					// Saca el módulo de modulo
					modulo = modulo - 11;
System.out.println("modulo2:    " + modulo);
				if (modulo != 10 && modulo != 11) { // Verifica q modulo no sea ni 10 ni 11 y el digito obtenido es modulo
					digito2 = modulo;
System.out.println("digito2:    " + digito2);
				} else if (modulo == 10) { // Si modulo es 10 el dígito obtenido es el caracter 'k'
					dig2 = "k";
System.out.println("dig2:       " + dig2);
				} else if (modulo == 11) { // Si modulo es 11 el dígito obtenido es cero
					digito2 = 0;
System.out.println("digito2:    " + digito2);
				}
				if (dv.equals("k")) {
System.out.println("dv.equals(k)...");
					if (dv.equals(dig2)) {
System.out.println("dv.equals(dig2)...");							
						System.out.println("Dígito correcto");
						return true;
					}
				} else if (digito2 == digito) { // Si el dígito q se obtiene es igual al dígito de la cadena NIT correcto
System.out.println("else if... digito2:" + digito2);					
					System.out.println("Dígito correcto");
					return true;
				} else { // Si el dígito q se obtiene es distinto al dígito de la cadena el NIT es incorrecto
System.out.println("else...");
					System.out.println("Dígito incorrecto");
					return false;
				}
			}
			if (result)
				System.out.println("Dígito correcto");
			else
				System.out.println("Dígito incorrecto");

			return result;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
