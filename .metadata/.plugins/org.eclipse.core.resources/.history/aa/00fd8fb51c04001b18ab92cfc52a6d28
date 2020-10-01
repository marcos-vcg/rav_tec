package telas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import classes.Categoria;

@SuppressWarnings("serial")
public class CategoriaCadastro extends JInternalFrame {
	static final int xPosition = 140, yPosition = 80;

	public CategoriaCadastro(ArrayList<Categoria> cadCategoria) {
		super("Cadastro de Categorias", true, // resizable
				true, // closable
				true, // maximizable
				true);// iconifiable
		setSize(350, 200);
		setLocation(xPosition, yPosition);
		setLayout(null);
		
		
		// Criar Abas
		JTabbedPane abas = new JTabbedPane(JTabbedPane.TOP);
		abas.setBounds(10, 11, 320, 139);
		add(abas);
		
		
		// Painéis das Abas
		JPanel pnl_consulta = new JPanel();
		pnl_consulta.setLayout(null);
		abas.addTab("Pesquisa", null, pnl_consulta, "Pesquisar Categorias");
		JPanel pnl_cadastro = new JPanel();
		pnl_cadastro.setLayout(null);
		abas.addTab("Cadastro", null, pnl_cadastro, "Cadastrar Categoria");
		
		
		// Aba Consulta
		pnl_consulta.add(new JLabel("Categoria:")).setBounds(55, 18, 98, 14);
		JComboBox cbx_categoria = new JComboBox();
		for(int i = 0; i < cadCategoria.size(); i++) {
			cbx_categoria.addItem(cadCategoria.get(i).getNome());
			}
		pnl_consulta.add(cbx_categoria).setBounds(120, 14, 98, 22);
		
		JLabel lbl_edit_categoria= new JLabel("Categoria:");
		pnl_consulta.add(lbl_edit_categoria).setBounds(10, 49, 98, 14);
		lbl_edit_categoria.setVisible(false);
		JTextField txf_edit_categoria = new JTextField(10);
		txf_edit_categoria.setBounds(80, 46, 98, 22);
		pnl_consulta.add(txf_edit_categoria);
		txf_edit_categoria.setVisible(false);
		JLabel lbl_edit_preco= new JLabel("Preço:");
		pnl_consulta.add(lbl_edit_preco).setBounds(200, 49, 98, 14);
		lbl_edit_preco.setVisible(false);
		JTextField txf_edit_preco = new JTextField(10);
		txf_edit_preco.setBounds(250, 46, 48, 22);
		pnl_consulta.add(txf_edit_preco);
		txf_edit_preco.setVisible(false);
		
		
		
		JButton btn_novo = new JButton("Novo");
		btn_novo.setVisible(true);
		btn_novo.setBounds(210, 75, 80, 25);
		pnl_consulta.add(btn_novo);
		btn_novo.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abas.setSelectedIndex(1);
				cbx_categoria.setSelectedIndex(0);
			}
		});
		
		
		JButton btn_excluir = new JButton("Excluir");
		btn_excluir.setVisible(true);
		btn_excluir.setBounds(20, 75, 80, 25);
		pnl_consulta.add(btn_excluir);
		btn_excluir.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				if(cbx_categoria.getSelectedItem().toString().contentEquals("") ) {
					JOptionPane.showMessageDialog(null, "Campos Obrigatórios Vazios!", "Exclusão Inválida!", JOptionPane.WARNING_MESSAGE);
				} else {
					cadCategoria.remove(cbx_categoria.getSelectedItem());
					cbx_categoria.removeItemAt(cbx_categoria.getSelectedIndex());
					JOptionPane.showMessageDialog(null, "Exclusão efetuada com sucesso!", "Exclusçao Efetuado!", JOptionPane.WARNING_MESSAGE);
					cbx_categoria.setSelectedIndex(0);
				}
			}
		});
		
		
		JButton btn_editar = new JButton("Editar");
		btn_editar.setVisible(true);
		btn_editar.setBounds(115, 75, 80, 25);
		pnl_consulta.add(btn_editar);
		//Action Listener mais em baixo
		
	
		JButton btn_salvar = new JButton("Salvar");
		btn_salvar.setVisible(false);
		btn_salvar.setBounds(210, 75, 80, 25);
		pnl_consulta.add(btn_salvar);
		//Action Listener mais em baixo
		
		
		JButton btn_cancelar = new JButton("Cancelar");
		btn_cancelar.setVisible(false);
		btn_cancelar.setBounds(20, 75, 90, 25);
		pnl_consulta.add(btn_cancelar);
		btn_cancelar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl_edit_categoria.setVisible(false);
				lbl_edit_preco.setVisible(false);
				txf_edit_categoria.setVisible(false);
				txf_edit_preco.setVisible(false);
				btn_novo.setVisible(true);
				btn_excluir.setVisible(true);
				btn_editar.setVisible(true);
				JOptionPane.showMessageDialog(null, "Cancelado com sucesso!", "Cancelamento!", JOptionPane.WARNING_MESSAGE);
				btn_salvar.setVisible(false);
				btn_cancelar.setVisible(false);			
			}
		});
		
		
		btn_editar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(cbx_categoria.getSelectedItem().toString().contentEquals("") ) {
					JOptionPane.showMessageDialog(null, "Campos Obrigatórios Vazios!", "Edição Inválida!", JOptionPane.WARNING_MESSAGE);
				} else {
					lbl_edit_categoria.setVisible(true);
					lbl_edit_preco.setVisible(true);
					txf_edit_categoria.setVisible(true);
					txf_edit_preco.setVisible(true);
					btn_novo.setVisible(false);
					btn_excluir.setVisible(false);
					btn_editar.setVisible(false);
					JOptionPane.showMessageDialog(null, "Informe o novo nome!", "Edição Inválida!", JOptionPane.WARNING_MESSAGE);
					btn_salvar.setVisible(true);
					btn_cancelar.setVisible(true);
					
					txf_edit_categoria.setText(cbx_categoria.getSelectedItem().toString());
					txf_edit_preco.setText(cadCategoria.get(cbx_categoria.getSelectedIndex()).getPreco());
				}	
			}
		});
		
		btn_salvar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txf_edit_categoria.getText().contentEquals("") || txf_edit_preco.getText().contentEquals("")) {
					JOptionPane.showMessageDialog(null, "Campos Obrigatórios Vazios!", "Edição Inválida!", JOptionPane.WARNING_MESSAGE);
				} else {
					
					cadCategoria.get(cbx_categoria.getSelectedIndex()).setNome(txf_edit_categoria.getText());
					cadCategoria.get(cbx_categoria.getSelectedIndex()).setPreco(txf_edit_preco.getText());	
					cbx_categoria.insertItemAt(txf_edit_categoria.getText(), cbx_categoria.getSelectedIndex());
					cbx_categoria.removeItemAt(cbx_categoria.getSelectedIndex());
					
					txf_edit_categoria.setText("");
					JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!", "Cadastro Efetuado!", JOptionPane.WARNING_MESSAGE);
					lbl_edit_categoria.setVisible(false);
					lbl_edit_preco.setVisible(false);
					txf_edit_categoria.setVisible(false);
					txf_edit_preco.setVisible(false);
					btn_novo.setVisible(true);
					btn_excluir.setVisible(true);
					btn_editar.setVisible(true);
					btn_salvar.setVisible(false);
					btn_cancelar.setVisible(false);	
					cbx_categoria.setSelectedIndex(0);
				}
			}
		});
		
		
		
		
		
		// Aba Cadastro
		pnl_cadastro.add(new JLabel("Nova Categoria:")).setBounds(55, 18, 98, 14);
		JTextField txf_nova_categoria = new JTextField(10);
		pnl_cadastro.add(txf_nova_categoria).setBounds(150, 14, 98, 22);
		
		pnl_cadastro.add(new JLabel("Preço:")).setBounds(55, 38, 98, 14);;
		JTextField txf_novo_preco = new JTextField(10);
		pnl_cadastro.add(txf_novo_preco).setBounds(150, 44, 98, 22);
		
		JButton btn_cadastro_categoria = new JButton("Cadastrar");
		pnl_cadastro.add(btn_cadastro_categoria).setBounds(120, 80, 98, 22);
		
		
		
		btn_cadastro_categoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				if(txf_nova_categoria.getText().contentEquals("") || txf_novo_preco.getText().contentEquals("") ) {
					JOptionPane.showMessageDialog(null, "Campos Obrigatórios Vazios!", "Cadastro Inválido!", JOptionPane.WARNING_MESSAGE);
				} else {
					Categoria cad_categoria = new Categoria(txf_nova_categoria.getText(), txf_novo_preco.getText());
					cadCategoria.add(cad_categoria);
					cbx_categoria.addItem(txf_nova_categoria.getText());
					JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!", "Cadastro Efetuado!", JOptionPane.WARNING_MESSAGE);
					txf_nova_categoria.setText("");
					txf_novo_preco.setText("");
				}
			}
		});
		
	}
	
}