package exemplo;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Botoes {

	public static void main(String[] args) {
		
		// Janela Principal
		JFrame janela = new JFrame("Filmes (Pesquisa)"); 			// Cria
		janela.setVisible(true); 									// Mostra
		janela.setSize(600, 400); 									// Tamanho
		janela.setLayout(new FlowLayout()); 						// Tudo segue o novo layout
		janela.setLocationRelativeTo(null); 						// Centraliza
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      // Sai ao fechar a tela
		
		
		JPanel painel = new JPanel();
		painel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		JButton botao = new JButton("1");
		botao.setVisible(true); 
		botao.setBounds( 50 , 50 , 100 , 20 );
		painel.add( botao );
	}

}
