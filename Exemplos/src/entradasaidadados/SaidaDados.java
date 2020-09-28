package entradasaidadados;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

class SaidaDados {
	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("arquivo.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);

		bw.write("Teste");
		bw.newLine();
		bw.write("Caelum");
		bw.close();
	}
}