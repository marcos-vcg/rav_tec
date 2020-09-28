package clienteservidor;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Servidor {

	public static void main(String[] args) throws IOException {

		ServerSocket servidor = new ServerSocket(12345);
		System.out.println("Porta 12345 aberta!");
		
		// Ap�s abrir a porta fica aguardando a conex�o do cliente
		Socket cliente = servidor.accept();   // M�todo blocante, segura a thread at� que algo o notifique.
		System.out.println("Nova conex�o com o cliente " + 
		    cliente.getInetAddress().getHostAddress() );       // imprime o ip do cliente
		
		// Recebe as informa��es do cliente
		Scanner s = new Scanner(cliente.getInputStream());
		while (s.hasNextLine()) {
		    System.out.println(s.nextLine());
		}
		
		// Encerra as conex�es
		s.close();
		cliente.close();
		servidor.close();
	}
}