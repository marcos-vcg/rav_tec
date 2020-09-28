package teste;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class Main {
	JMenu menu, submenu;
	JMenuItem i1, i2, i3, i4, i5;

	Main() {
		JFrame f = new JFrame("Locadora");
		JMenuBar mb = new JMenuBar();
		menu = new JMenu("Cadastros");
		submenu = new JMenu("Sub Menu");
		i1 = new JMenuItem("Filme");
		final JDesktopPane jdpDesktop = new JDesktopPane();

		i1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				CategoriaFrame categoriaFrame = new CategoriaFrame();
				
				jdpDesktop.add(categoriaFrame);
				categoriaFrame.setVisible(true);
			}
		});

		i2 = new JMenuItem("Item 2");
		i3 = new JMenuItem("Item 3");
		i4 = new JMenuItem("Item 4");
		i5 = new JMenuItem("Item 5");
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		submenu.add(i4);
		submenu.add(i5);
		menu.add(submenu);
		mb.add(menu);
		f.setJMenuBar(mb);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setContentPane(jdpDesktop);

		f.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String args[]) {
		new Main();
	}
}