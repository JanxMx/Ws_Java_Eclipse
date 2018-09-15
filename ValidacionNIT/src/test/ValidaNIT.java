package test;

public class ValidaNIT {
	public static void main(String[] args) {
		//String nitValido = "00183742-7";
		//String nitValido = "00007108-0";
		//String nitValido = "00109819-5";
		String nitValido = "00657697-4";
		//String nitValido = "05077986-9"; 
		//String nitValido = "00954031-8";
		//String nitValido = "00421012-3";
		//String nitValido = "00531427-5";
		//String nitValido = "00141305-8";
		//String nitValido = "00127205-5";
		
		System.out.println("corriendo");
		AlgoritmoValidacion av = new AlgoritmoValidacion();
		System.out.println("resultado:" + av.validaNIT(nitValido));
	}
}

