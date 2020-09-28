package entradasaidadados;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterTeste{
	public static void main(String[] args) throws IOException {
		Writer fileWriter = new FileWriter("arquivo.txt");

		fileWriter.write("data 1");
		fileWriter.write("data 2");
		fileWriter.write("data 3");

		fileWriter.close();
	}
	
}