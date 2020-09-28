package exemplo;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Teste {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Locação de Filmes"); 			// Cria
		janela.setVisible(true); 									// Mostra
		janela.setSize(600, 400); 									// Tamanho
		janela.setLayout(new FlowLayout()); 						// Tudo segue o novo layout
		janela.setLocationRelativeTo(null); 						// Centraliza
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      // Sai ao fechar a tela
		
		JPanel painel = new JPanel ();
		janela.getContentPane().add (painel); 
		
		
		

	}

}
