package entradasaidadados;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaDadosArquivoTry {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = null;
		try {
			
			br = new BufferedReader(new InputStreamReader (new FileInputStream("arquivo.txt")));
			
			String s = br.readLine();
			while (s != null) {
				System.out.println(s);
				s = br.readLine(); }
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
		} finally {
			br.close();    // com exceção ou não, o close() do br sera invocado
		}

	}

}