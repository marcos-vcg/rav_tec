package telas;

import classes.Clientes;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class JanelaPrincipal {

	public static void main(String[] args) {

		JFrame janela = new JFrame("Locação de Filmes"); 			// Cria
		janela.setVisible(true); 									// Mostra
		janela.setSize(600, 400); 									// Tamanho
		janela.setLayout(new FlowLayout()); 						// Tudo segue o novo layout
		janela.setLocationRelativeTo(null); 						// Centraliza
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      // Sai ao fechar a tela

		
		// Filmes
		JLabel labelFilmes = new JLabel("Lista de Filmes Disponíveis\n");
		janela.getContentPane().add(labelFilmes);	
		
		// Lista
//		JList listaFilmes = new JList<E>();
		
		// Botão Filme
		JButton botaoSelecionarFilme = new JButton("Filme!");
		janela.add(botaoSelecionarFilme);
		botaoSelecionarFilme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Filme selecionado!");
			}
		});
		
		
		
		
		// Clientes
		JLabel labelClientes = new JLabel("Lista de Clientes Cadastrados\n");
		janela.add(labelClientes);
		
		// Lista
//		JList listaClientes = JList<E>();		
		
		// Botão Cliente
		JButton botaoCliente = new JButton("Cliente!");
		janela.add(botaoCliente);
		botaoCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Cliente selecionado!");
			}
		});		
		

		
		
		// Botçao Alugar
		JButton botaoAlugar = new JButton("Alugar!");
		janela.add(botaoAlugar);
		botaoAlugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Filme alugado com sucesso!");
			}
		});

	}

}
