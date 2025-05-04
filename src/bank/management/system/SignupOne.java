package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;


public class SignupOne extends JFrame {

    //Constructor
    SignupOne(){

        setLayout(null);

        Random ran = new Random(); //Create random number *OBJECT*
        long random = Math.abs((ran.nextLong() % 9000L) + 1000L); //Convert to long type

        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);


        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);

    }

    public static void main(String [] args){
        new SignupOne();
    }

}
