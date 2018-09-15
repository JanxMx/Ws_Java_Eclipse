package generics.comparable;

public class MainGenerics {

	public static void main(String[] args) {
		System.out.println("probando Generics...");
		System.out.println("prueba uno: null");
		GenericVO<String> gtOne = new GenericVO<String>();
		System.out.println("First:" + gtOne.getFirst());
		System.out.println("Second:" + gtOne.getSecond());
		System.out.println("prueba dos: String");
		GenericVO<String> gtTwo = new GenericVO<String>("uno","dos");
		System.out.println("First:" + gtTwo.getFirst());
		System.out.println("Second:" + gtTwo.getSecond());
		gtTwo.setFirst("A");
		gtTwo.setSecond("B");
		System.out.println("First:" + gtTwo.getFirst());
		System.out.println("Second:" + gtTwo.getSecond());		
		System.out.println("prueba tres: Integer");
		GenericVO<Integer> gtThree = new GenericVO<Integer>(1,2);
		System.out.println("First:" + gtThree.getFirst());
		System.out.println("Second:" + gtThree.getSecond());
		gtThree.setFirst(10);
		gtThree.setSecond(20);
		System.out.println("First:" + gtThree.getFirst());
		System.out.println("Second:" + gtThree.getSecond());		
	}

}
