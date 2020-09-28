package telas;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Genero extends JInternalFrame {
	static final int xPosition = 140, yPosition = 80;
	
	public Genero(ArrayList<String> cadGenero) {
		super("Cadastro de G�neros", true, // resizable
				true, // closable
				true, // maximizable
				true);// iconifiable
		setSize(350, 200);
		setLocation(xPosition, yPosition);
		setLayout(new FlowLayout());
		

		
		// Criar Abas
		JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.setSize(200, 200);
		
		JPanel panel1 = new JPanel();
		panel1.setSize(200, 200);
		add("Panel #1", panel1);
		tabbedPane.addTab("Tab 1", null, panel1, null);
		tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
		
		JPanel panel2 = new JPanel();
		panel2.setSize(200, 200);
		add("Panel #2", panel2);
		tabbedPane.addTab("Tab 2", panel2);
		tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);
		
		add(tabbedPane);
		
		
		// Consulta
		panel1.add(new JLabel("G�nero:")).setBounds(212, 11, 98, 14);;

		JComboBox comboBoxGenero = new JComboBox(cadGenero.toArray());
		comboBoxGenero.setBounds(212, 28, 98, 22);
		// comboBoxGenero.add(generos)
		panel1.add(comboBoxGenero);
		
		
		
		// Conte�do da Aba Cadastro
		JLabel label = new JLabel("Novo G�nero:");
		panel2.add(label);
		JTextField texto = new JTextField(10);
		panel2.add(texto);
		JButton botao = new JButton("Cadastrar");
		panel2.add(botao);
		
		
		botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				if(texto.getText().contentEquals("") ) {
					JOptionPane.showMessageDialog(null, "Campos Obrigat�rios Vazios!", "Cadastro Inv�lido!", JOptionPane.WARNING_MESSAGE);
				} else {
					cadGenero.add(texto.getText());
					JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!", "Cadastro Efetuado!", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		
		
	}
	
}