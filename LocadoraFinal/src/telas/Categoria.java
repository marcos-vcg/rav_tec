package telas;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Categoria extends JInternalFrame {
	static final int xPosition = 200, yPosition = 50;

	public Categoria(ArrayList<String> cadCategoria) {
		super("Cadastro de Categorias", true, // resizable
				true, // closable
				true, // maximizable
				true);// iconifiable
		setSize(250, 250);
		setLocation(xPosition, yPosition);
		setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Nova Categoria:");
		add(label);
		JTextField texto = new JTextField(10);
		add(texto);
		
		JLabel label2 = new JLabel("\nPre�o:");
		add(label2);
		JTextField texto2 = new JTextField(10);
		add(texto2);
		
		JButton botao = new JButton("Cadastrar");
		add(botao);
		
		
		botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				if(texto.getText().contentEquals("") || texto2.getText().contentEquals("") ) {
					JOptionPane.showMessageDialog(null, "Campos Obrigat�rios Vazios!", "Cadastro Inv�lido!", JOptionPane.WARNING_MESSAGE);
				} else {
					cadCategoria.add(texto.getText());
					cadCategoria.add(texto2.getText());
					JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!", "Cadastro Efetuado!", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		
	}
	
}