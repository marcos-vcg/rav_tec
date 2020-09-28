package exemplo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class ikleenRegister {

    JFrame frame;
    JPanel phonePanel, fieldPanel, mainPanel;
    JLabel name, email, password, address, mobile, l_register;
    JTextField nameField, emailField, passwordField, addressField, mobileField, countryCode;
    JButton b_register;

    public void launchGUI()
    {
        frame = new JFrame("iKleen - Register / Create Free Account");

        //phonePanel and its components
        phonePanel = new JPanel();
        phonePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        mobileField = new JTextField(15);
        countryCode = new JTextField(2);
        countryCode.setText("+91");
        countryCode.setEnabled(false);
        phonePanel.add(countryCode);
        phonePanel.add(mobileField);

        //fieldPanel and its components
        fieldPanel = new JPanel();
        fieldPanel.setLayout(new GridLayout(5,2,3,3));
        fieldPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        name = new JLabel("Name: ");
        email = new JLabel("Email ID: ");
        password = new JLabel("Password: ");
        address = new JLabel("Address: ");
        mobile = new JLabel("Mobile Number: ");
        nameField = new JTextField(15);
        emailField = new JTextField(15);
        passwordField = new JTextField(15);
        addressField = new JTextField(15);
        fieldPanel.add(name);
        fieldPanel.add(nameField);
        fieldPanel.add(email);
        fieldPanel.add(emailField);
        fieldPanel.add(password);
        fieldPanel.add(passwordField);
        fieldPanel.add(address);
        fieldPanel.add(addressField);
        fieldPanel.add(mobile);
        fieldPanel.add(phonePanel);

        //mainPanel and its components
        mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        Font font = new Font("MS Sans Serif", Font.BOLD, 18);
        l_register = new JLabel("Create a free account");
        l_register.setFont(font);
        l_register.setAlignmentX(Component.CENTER_ALIGNMENT);
        b_register = new JButton("Create Account");
        b_register.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(l_register);
        mainPanel.add(fieldPanel);
        mainPanel.add(b_register);

        //final frame settings
        frame.setContentPane(mainPanel);
        frame.pack();
        centerFrame();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void centerFrame() {
        Dimension currentScreen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((currentScreen.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((currentScreen.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }
}