package arrays;

public class ArrayBidimensional {

	public static void main(String[] args) {
		String[][] array = new String[10][10];
		
		for(int i = 0; i<array.length; i++) {
			for(int j = 0; j<array[i].length; j++) {
			System.out.println("Linha " +i+ " Coluna " + j + " igual a " +array[i][j]);
			}
		}
		
	}
}