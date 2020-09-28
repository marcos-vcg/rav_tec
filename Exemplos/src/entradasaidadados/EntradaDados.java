package entradasaidadados;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class EntradaDados {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;  //do teclado ou new FileInputStream("arquivo.txt"); 
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String s = br.readLine();
		System.out.println(s);
		
	}
}
