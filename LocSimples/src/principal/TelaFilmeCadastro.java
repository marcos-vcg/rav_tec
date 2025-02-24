package principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TelaFilmeCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textTitulo;
	private JLabel lblGenero;
	private JTextField textLancamento;
	private JTextField textCopias;
	private JLabel lblDuracao;
	private JTextField textDuracao;
	private JLabel lblCategoria;
	private JComboBox comboBoxCategoria;
	private JLabel lblImagem;
	private JLabel lblSinopse;
	private final Action salvar = new SwingAction();
	private final Action voltar = new SwingAction_1();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFilmeCadastro frame = new TelaFilmeCadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
	}

	/**
	 * Create the frame.
	 */
	public TelaFilmeCadastro() {
		
		
		ArrayList<String> generos = new ArrayList<>();
		generos.add("");
		generos.add("A��o");
		generos.add("Aventura");
		generos.add("Drama");
		generos.add("Com�dia");
		generos.add("Suspense");
		generos.add("Terror");
		
		List<String> categorias = new ArrayList<String>(Arrays.asList (new String[]{"", "Lan�amento", "Padr�o", "Antigo"}));
		List<Filme> filmes = new ArrayList<Filme>();
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Titulo:");
		lblTitulo.setBounds(20, 11, 81, 14);
		contentPane.add(lblTitulo);
		
		textTitulo = new JTextField();
		textTitulo.setBounds(20, 29, 161, 20);
		contentPane.add(textTitulo);
		textTitulo.setColumns(10);
		
		lblGenero = new JLabel("Genero:");
		lblGenero.setBounds(212, 11, 98, 14);
		contentPane.add(lblGenero);
		
		JComboBox comboBoxGenero = new JComboBox(generos.toArray());
		comboBoxGenero.setBounds(212, 28, 98, 22);
		//comboBoxGenero.add(generos)
		contentPane.add(comboBoxGenero);
		
		JLabel lblLancamento = new JLabel("Lan�amento:");
		lblLancamento.setBounds(349, 11, 75, 14);
		contentPane.add(lblLancamento);
		
		textLancamento = new JTextField();
		textLancamento.setBounds(349, 29, 75, 20);
		contentPane.add(textLancamento);
		textLancamento.setColumns(10);
		
		JLabel lblCopias = new JLabel("C�pias:");
		lblCopias.setBounds(454, 11, 55, 14);
		contentPane.add(lblCopias);
		
		textCopias = new JTextField();
		textCopias.setBounds(454, 29, 55, 20);
		contentPane.add(textCopias);
		textCopias.setColumns(10);
		
		lblDuracao = new JLabel("Dura��o:");
		lblDuracao.setBounds(20, 77, 98, 14);
		contentPane.add(lblDuracao);
		
		textDuracao = new JTextField();
		textDuracao.setBounds(20, 102, 98, 20);
		contentPane.add(textDuracao);
		textDuracao.setColumns(10);
		
		lblCategoria = new JLabel("Categoria:");
		lblCategoria.setBounds(212, 77, 98, 14);
		contentPane.add(lblCategoria);
		
		JComboBox comboBoxCategoria = new JComboBox(categorias.toArray());
		comboBoxCategoria.setBounds(212, 101, 98, 22);
		contentPane.add(comboBoxCategoria);
		
		lblImagem = new JLabel("Imagem:");
		lblImagem.setBounds(349, 77, 75, 14);
		contentPane.add(lblImagem);
		
		lblSinopse = new JLabel("Sinopse:");
		lblSinopse.setBounds(20, 165, 98, 14);
		contentPane.add(lblSinopse);
		
		JEditorPane editorPaneSinopse = new JEditorPane();
		editorPaneSinopse.setBounds(20, 190, 290, 71);
		contentPane.add(editorPaneSinopse);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setAction(voltar);
		btnVoltar.setBounds(335, 238, 68, 23);
		contentPane.add(btnVoltar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textTitulo.getText().contentEquals("") || comboBoxGenero.getSelectedItem().toString().contentEquals("") || 
						textCopias.getText().contentEquals("") || textLancamento.getText().contentEquals("")) {
					
					JOptionPane.showMessageDialog(null, "Campos Obrigat�rios Vazios!", "Cadastro Inv�lido!", JOptionPane.WARNING_MESSAGE);
				} else {
					
					Filme filme = new Filme(textTitulo.getText(), comboBoxGenero.getSelectedItem().toString(), Integer.parseInt(textCopias.getText()), textLancamento.getText());
					filme.setDuracao(textDuracao.getText());
					filme.setCategoria(comboBoxCategoria.getSelectedItem().toString());
					// filme.setImagem( pegar imagem );
					filme.setSinopse(editorPaneSinopse.getText());
					filmes.add(filme);
					
					/*System.out.println(filmes.size());*/
				}
				
				
				/*
				for(Filme filme: filmes) {
					System.out.println("");
					System.out.println(filme.getTitulo());
					System.out.println(filme.getGenero());
					System.out.println(filme.getCopias());
					System.out.println(filme.getLancamento());
					System.out.println(filme.getDuracao());
					System.out.println(filme.getCategoria());
					System.out.println(filme.getSinopse());
					System.out.println("");
				}*/
				
				
			}
		});
		btnSalvar.setAction(salvar);
		btnSalvar.setBounds(434, 238, 75, 23);
		contentPane.add(btnSalvar);
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
		}
	}
}
