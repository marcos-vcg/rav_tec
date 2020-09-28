package classes;

import java.util.ArrayList;

public class Genero {
	
	public Genero() {
		
	}

	public static void main(String[] args) {

		ArrayList<String> generos = new ArrayList<>();
		generos.add("Ação");
		generos.add("Aventura");
		generos.add("Drama");
		generos.add("Comédia");
		generos.add("Suspense");
		generos.add("Terror");
		
		for(String x: generos) {
		System.out.println(x);}

	}
}