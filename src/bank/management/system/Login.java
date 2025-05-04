package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    // Define globally so we can use them in the action listener.
    JButton login, signup, clear;
    JTextField cardTextField;
    JPasswordField pinTextField;


    //Create new JFrame
    Login(){

        setTitle("AUTOMATED BANK SYSTEM"); //Set the title of the window

        setLayout(null);

        //Image Icon is a JavaSwing wrapper (A component)
        ImageIcon logo = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg")); //Set the logo of the java window
        Image logo2 = logo.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT); //Scale the icon, by turning it into AWT image
        ImageIcon logo3 = new ImageIcon(logo2); //Revert the AWT Image to Swing icon
        JLabel label = new JLabel(logo3); //Create a new JLabel and add the logo
        label.setBounds(70, 10, 100, 100);
        add(label); //Add the label to the JFrame

        // Welcome text label
        JLabel text = new JLabel("Welcome to ATM"); // Create new label
        text.setFont(new Font("Osward", Font.BOLD, 38)); //Set the label font
        text.setBounds(200,40,400,40); //Position the text
        add(text); //Add it to JFrame

        // Card number label
        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(120,150,150,30);
        add(cardno);
        // Card number text field
        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 230, 30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardTextField);

        // PIN label
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(120,220,250,30);
        add(pin);
        // PIN text field
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 230, 30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinTextField);

        // Sign in button
        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this); // Add listener for implementing action when button is clicked
        add(login);

        // Clear button
        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        // Signup button
        signup = new JButton("SIGN UP");
        signup.setBounds(300, 340, 230, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);


        getContentPane().setBackground(Color.WHITE); //Set the background to white

        setSize(800, 480); //Set the size of the window
        setVisible(true); //Set it to visible, so we can see it
        setLocation(500, 200); //Set position of window
    }

    // Override actionPerformed
    public void actionPerformed(ActionEvent event){
        if(event.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }else if(event.getSource() == login){

        }else if(event.getSource() == signup){

        }

    }

    public static void main(String[] args){
        new Login();
    }
}
