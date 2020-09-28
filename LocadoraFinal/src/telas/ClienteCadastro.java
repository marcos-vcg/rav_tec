package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import classes.Cliente;

@SuppressWarnings("serial")
public class ClienteCadastro extends JInternalFrame {

	static final int xPosition = 30, yPosition = 30;
	private final Action salvar = new SwingAction();
	private final Action voltar = new SwingAction_1();

	public ClienteCadastro(ArrayList<Cliente> cadCliente) {
		super("Cadastro de Filmes", true, // resizable
				true, // closable
				true, // maximizable
				true);// iconifiable
		setSize(550, 300);
		setLocation(xPosition, yPosition);
		setLayout(null);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(20, 11, 81, 14);
		add(lblNome);

		JTextField textNome = new JTextField(10);
		textNome.setBounds(20, 29, 161, 20);
		add(textNome);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(212, 11, 98, 14);
		add(lblCpf);

		JTextField textCpf = new JTextField(10);
		textCpf.setBounds(212, 29, 75, 20);
		add(textCpf);
		
		add(new JLabel("Telefone:")).setBounds(349, 11, 98, 14);
		
		JTextField textTelefone = new JTextField(10);
		textTelefone.setBounds(349, 29, 75, 20);
		add(textTelefone);

		add(new JLabel("Email:")).setBounds(454, 11, 55, 14);
		
		JTextField textT = new JTextField(10);
		textT.setBounds(454, 29, 55, 20);
		add(textT);

		add(new JLabel("Nascimento:")).setBounds(20, 77, 98, 14);
		
		JTextField textNascimento = new JTextField(10);
		textNascimento.setBounds(20, 102, 98, 20);
		add(textNascimento);

		add(new JLabel("Endere�o:")).setBounds(212, 77, 98, 14);
		
		JTextField textEndereco = new JTextField(10);
		textEndereco.setBounds(20, 102, 98, 20);
		add(textEndereco);
		
		add(new JLabel("Foto:")).setBounds(349, 77, 75, 14);

		JLabel lblDependentes = new JLabel("Dependentes:");
		lblDependentes.setBounds(20, 165, 98, 14);
		add(lblDependentes);

		JEditorPane editorPaneSinopse = new JEditorPane();
		editorPaneSinopse.setBounds(20, 190, 290, 71);
		add(editorPaneSinopse);

		
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setAction(voltar);
		btnVoltar.setBounds(335, 238, 68, 23);
		add(btnVoltar);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textNome.getText().contentEquals("")
						|| textCpf.getText().contentEquals("") || textTelefone.getText().contentEquals("")) {

					JOptionPane.showMessageDialog(null, "Campos Obrigat�rios Vazios!", "Cadastro Inv�lido!",
							JOptionPane.WARNING_MESSAGE);
				} else {

					Cliente cliente = new Cliente(textNome.getText(), textCpf.getText(), textTelefone.getText());
					
					//cliente.setDuracao(textDuracao.getText());
					//cliente.setCategoria(comboBoxCategoria.getSelectedItem().toString());
					// filme.setImagem( pegar imagem );
					//cliente.setSinopse(editorPaneSinopse.getText());
					cadCliente.add(cliente);

					JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!", "Cadastro Efetuado!",
							JOptionPane.WARNING_MESSAGE);
					System.out.println(cadCliente.size());
				}

				/*
				 * for(Filme filme: filmes) { System.out.println("");
				 * System.out.println(filme.getTitulo()); System.out.println(filme.getGenero());
				 * System.out.println(filme.getCopias());
				 * System.out.println(filme.getLancamento());
				 * System.out.println(filme.getDuracao());
				 * System.out.println(filme.getCategoria());
				 * System.out.println(filme.getSinopse()); System.out.println(""); }
				 */

			}
		});
		btnSalvar.setAction(salvar);
		btnSalvar.setBounds(434, 238, 75, 23);
		add(btnSalvar);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Salvar");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
		}
	}

	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Voltar");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}
}
