package entradasaidadados;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderTeste {
	public static void main(String[] args) throws IOException {		
		Reader fileReader = new FileReader("C:\\\\Users/RAVDev/Documents/Workspace_Marcos/Exemplos/arquivo.txt");

		int data = fileReader.read();
		while(data != -1) {
		  //do something with data... falta decodificar
		  System.out.println(data);

		  data = fileReader.read();
		}
		fileReader.close();

	}

}
