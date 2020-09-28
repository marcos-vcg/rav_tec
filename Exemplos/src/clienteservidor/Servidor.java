package clienteservidor;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Servidor {

	public static void main(String[] args) throws IOException {

		ServerSocket servidor = new ServerSocket(12345);
		System.out.println("Porta 12345 aberta!");
		
		// Após abrir a porta fica aguardando a conexão do cliente
		Socket cliente = servidor.accept();   // Método blocante, segura a thread até que algo o notifique.
		System.out.println("Nova conexão com o cliente " + 
		    cliente.getInetAddress().getHostAddress() );       // imprime o ip do cliente
		
		// Recebe as informações do cliente
		Scanner s = new Scanner(cliente.getInputStream());
		while (s.hasNextLine()) {
		    System.out.println(s.nextLine());
		}
		
		// Encerra as conexões
		s.close();
		cliente.close();
		servidor.close();
	}
}