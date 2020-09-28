package arrays;

public class Arrays {

	public static void main(String[] args) {
		
		String[] array1 = new String[10];
		array1[0] = "teste";
		
		
		for(int i = 0; i<array1.length; i++) {
			System.out.println("Elemento " +i+ " igual a " +array1[i]);
		}
	}
}