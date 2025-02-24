package combobox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import classes.Filme;

@SuppressWarnings("serial")
public class GeneroCadastro extends JInternalFrame {
	static final int xPosition = 140, yPosition = 90;
	
	public GeneroCadastro(ArrayList<String> cadGenero) {
		super("Cadastro de G�neros", true, // resizable
				true, // closable
				true, // maximizable
				true);// iconifiable
		setSize(350, 260);
		setLocation(xPosition, yPosition);
		setLayout(null);
		
		
		// Criar Abas
		JTabbedPane abas = new JTabbedPane(JTabbedPane.TOP);
		add(abas).setBounds(10, 11, 320, 200);
		
		
		// Pain�is das Abas
		JPanel pnl_consulta = new JPanel();
		pnl_consulta.setLayout(null);
		abas.addTab("Pesquisa", null, pnl_consulta, "Pesquisar G�neros");
		
		JPanel pnl_cadastro = new JPanel();
		//panel2.setSize(200, 200);
		//add("Panel #2", panel2);
		abas.addTab("Cadastro", null, pnl_cadastro, "Cadastrar G�neros");
		//tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);
		
		
		
		// Aba Consulta
		pnl_consulta.add(new JLabel("Consulta:")).setBounds(20, 18, 98, 14);
		
		JTextField txf_genero_pesquisa = new JTextField(10);
		pnl_consulta.add(txf_genero_pesquisa).setBounds(90, 16, 98, 22);
		
		JComboBox cbx_genero = new JComboBox(cadGenero.toArray());
		cbx_genero.setBounds(120, 14, 98, 22);
		pnl_consulta.add(cbx_genero).setVisible(false);
		
		/*// Testando JList com JScrollPane
		String[] data = {"one", "two", "three", "four"};
		JList<String> cbx_genero = new JList(cadGenero.toArray());
		pnl_consulta.add(cbx_genero).setBounds(120, 14, 98, 40);
		JScrollPane scrl_genero = new JScrollPane(cbx_genero);
		pnl_consulta.add(scrl_genero).setBounds(120, 14, 98, 40);
		*/
		
		// Criar Tabela de Dados
		DefaultTableModel tbl_modelo = new DefaultTableModel();
		JTable tbl_generos = new JTable(tbl_modelo);
		JScrollPane scp_generos = new JScrollPane(tbl_generos);
		pnl_consulta.add(scp_generos).setBounds(20, 60, 100, 50);		
		
		// Preencher Tabela de Dados
		tbl_modelo.addColumn("G�nero");
		tbl_generos.getColumnModel().getColumn(0).setPreferredWidth(100);	
		
		
		tbl_modelo.setNumRows(0);
		for (String genero : cadGenero) {
			tbl_modelo.addRow(new Object[]{genero});
		}
		
		
		JButton btn_pesquisar = new JButton("Pesquisar");
		pnl_consulta.add(btn_pesquisar).setBounds(200, 16, 100, 20);
		btn_pesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tbl_modelo.setNumRows(0);
				for (String genero : cadGenero) {
					tbl_modelo.addRow(new Object[]{genero});
				}
			}
		});	
		

		
		
		
		
		
		JLabel lbl_edit= new JLabel("Edi��o:");
		pnl_consulta.add(lbl_edit).setBounds(70, 115, 98, 14);
		lbl_edit.setVisible(false);
		JTextField txf_genero_edit = new JTextField(10);
		pnl_consulta.add(txf_genero_edit).setBounds(120, 46, 98, 22);
		txf_genero_edit.setVisible(false);
		
				
		JButton btn_novo = new JButton("Novo");
		btn_novo.setVisible(true);
		pnl_consulta.add(btn_novo).setBounds(210, 115, 80, 25);
		btn_novo.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abas.setSelectedIndex(1);
				cbx_genero.setSelectedIndex(0);
			}
		});
		
		
		JButton btn_excluir = new JButton("Excluir");
		btn_excluir.setVisible(true);
		btn_excluir.setBounds(20, 115, 80, 25);
		pnl_consulta.add(btn_excluir);
		btn_excluir.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				if(cbx_genero.getSelectedItem().toString().contentEquals("") ) {
					JOptionPane.showMessageDialog(null, "Campos Obrigat�rios Vazios!", "Exclus�o Inv�lida!", JOptionPane.WARNING_MESSAGE);
				} else {
					cadGenero.remove(cbx_genero.getSelectedItem());
					cbx_genero.removeItemAt(cbx_genero.getSelectedIndex());
					JOptionPane.showMessageDialog(null, "Exclus�o efetuada com sucesso!", "Exclus�ao Efetuado!", JOptionPane.WARNING_MESSAGE);
					cbx_genero.setSelectedIndex(0);
				}
			}
		});
		
		
		JButton btn_editar = new JButton("Editar");
		btn_editar.setVisible(true);
		btn_editar.setBounds(115, 115, 80, 25);
		pnl_consulta.add(btn_editar);
		//Action Listener mais em baixo
		
	
		JButton btn_salvar = new JButton("Salvar");
		btn_salvar.setVisible(false);
		btn_salvar.setBounds(210, 115, 80, 25);
		pnl_consulta.add(btn_salvar);
		//Action Listener mais em baixo
		
		
		JButton btn_cancelar = new JButton("Cancelar");
		btn_cancelar.setVisible(false);
		btn_cancelar.setBounds(20, 115, 90, 25);
		pnl_consulta.add(btn_cancelar);
		btn_cancelar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl_edit.setVisible(false);
				txf_genero_edit.setVisible(false);
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
				
				if(cbx_genero.getSelectedItem().toString().contentEquals("") ) {
					JOptionPane.showMessageDialog(null, "Campos Obrigat�rios Vazios!", "Edi��o Inv�lida!", JOptionPane.WARNING_MESSAGE);
				} else {
					lbl_edit.setVisible(true);
					txf_genero_edit.setVisible(true);
					btn_novo.setVisible(false);
					btn_excluir.setVisible(false);
					btn_editar.setVisible(false);
					JOptionPane.showMessageDialog(null, "Informe o novo nome!", "Edi��o Inv�lida!", JOptionPane.WARNING_MESSAGE);
					btn_salvar.setVisible(true);
					btn_cancelar.setVisible(true);
					
					txf_genero_edit.setText(cbx_genero.getSelectedItem().toString());
					//cbx_genero.getSelectedItem();
				}	
			}
		});
		
		btn_salvar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txf_genero_edit.getText().contentEquals("") ) {
					JOptionPane.showMessageDialog(null, "Campos Obrigat�rios Vazios!", "Edi��o Inv�lida!", JOptionPane.WARNING_MESSAGE);
				} else {
					cadGenero.set(cbx_genero.getSelectedIndex(), txf_genero_edit.getText());
					cbx_genero.insertItemAt(txf_genero_edit.getText(), cbx_genero.getSelectedIndex());
					cbx_genero.removeItemAt(cbx_genero.getSelectedIndex());
					
					txf_genero_edit.setText("");
					JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!", "Cadastro Efetuado!", JOptionPane.WARNING_MESSAGE);
					lbl_edit.setVisible(false);
					txf_genero_edit.setVisible(false);
					btn_novo.setVisible(true);
					btn_excluir.setVisible(true);
					btn_editar.setVisible(true);
					btn_salvar.setVisible(false);
					btn_cancelar.setVisible(false);	
					cbx_genero.setSelectedIndex(0);
				}
			}
		});
		
		// Tabela
		/*JTable tabela = new JTable();
		DefaultTableModel modelo = new DefaultTableModel(new Object[] {"Generos"}, 0);
		tabela.setModel(modelo);
		for(String s: cadGenero) {
			modelo.addRow(new Object[] {s.toString()});
		}
		tabela.getColumnModel().getColumn(0).setPreferredWidth(100);;
		//table.addColumn(teste);
		panel1.add(tabela);*/
		
		
		
		// Aba Cadastro
		JLabel lbl_novo_genero = new JLabel("Novo G�nero:");
		pnl_cadastro.add(lbl_novo_genero);
		JTextField txf_novo_genero = new JTextField(10);
		pnl_cadastro.add(txf_novo_genero);
		JButton btn_cadastro = new JButton("Cadastrar");
		pnl_cadastro.add(btn_cadastro);
		
		
		btn_cadastro.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				if(txf_novo_genero.getText().contentEquals("") ) {
					JOptionPane.showMessageDialog(null, "Campos Obrigat�rios Vazios!", "Cadastro Inv�lido!", JOptionPane.WARNING_MESSAGE);
				} else {
					cadGenero.add(txf_novo_genero.getText());
					cbx_genero.addItem(txf_novo_genero.getText());
					JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!", "Cadastro Efetuado!", JOptionPane.WARNING_MESSAGE);
					txf_novo_genero.setText("");
				}
			}
		});	
		
	}
	
	
	
	//private void btn_salvarActionPerformed (java.awt.event.ActionEvent evt) {
	//	JOptionPane.showMessageDialog(null, "Editado com sucesso!", "Edi��o Efetuada!", JOptionPane.WARNING_MESSAGE);	}
	
	//dispose();
	//private void tabPanelStateChanged(javax.swing.event.ChangeEvent evt) { if (tabbedPane.getSelectedIndex() == 1){ recuperaCfop(); } }
}