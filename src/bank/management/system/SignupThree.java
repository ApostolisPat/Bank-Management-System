package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignupThree extends JFrame implements ActionListener {

    String formno;
    JRadioButton savingsAccBtn, fixedDepositAccBtn, currentAccBtn, reccuringDepositAccBtn;
    ButtonGroup accountsGroup;
    JCheckBox atmCardCheckBox, internetBankingCheckBox, mobileBankingCheckBox, alertsCheckBox, chequeCheckBox, eStatementCheckBox, declarationCheckBox;
    JButton submit, cancel;


    SignupThree(String formno){
        this.formno = formno;

        setLayout(null);
        JLabel accountDetails = new JLabel("Page 3: Account Details");
        accountDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        accountDetails.setBounds(280, 40, 400, 40);
        add(accountDetails);

        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setBounds(100, 140, 200, 30);
        add(type);

        savingsAccBtn = new JRadioButton("Savings Account");
        savingsAccBtn.setFont(new Font("Raleway", Font.BOLD, 16));
        savingsAccBtn.setBackground(Color.WHITE);
        savingsAccBtn.setBounds(100, 180, 250, 20);
        add(savingsAccBtn);

        fixedDepositAccBtn = new JRadioButton("Fixed Deposit Account");
        fixedDepositAccBtn.setFont(new Font("Raleway", Font.BOLD, 16));
        fixedDepositAccBtn.setBackground(Color.WHITE);
        fixedDepositAccBtn.setBounds(350, 180, 250, 20);
        add(fixedDepositAccBtn);

        currentAccBtn = new JRadioButton("Current Account");
        currentAccBtn.setFont(new Font("Raleway", Font.BOLD, 16));
        currentAccBtn.setBackground(Color.WHITE);
        currentAccBtn.setBounds(100, 220, 250, 20);
        add(currentAccBtn);

        reccuringDepositAccBtn = new JRadioButton("Reccuring Deposit Account");
        reccuringDepositAccBtn.setFont(new Font("Raleway", Font.BOLD, 16));
        reccuringDepositAccBtn.setBackground(Color.WHITE);
        reccuringDepositAccBtn.setBounds(350, 220, 250, 20);
        add(reccuringDepositAccBtn);

        accountsGroup = new ButtonGroup();
        accountsGroup.add(savingsAccBtn);
        accountsGroup.add(fixedDepositAccBtn);
        accountsGroup.add(currentAccBtn);
        accountsGroup.add(reccuringDepositAccBtn);

        JLabel card = new JLabel("Card Number:");
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setBounds(100, 300, 200, 30);
        add(card);

        JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("Raleway", Font.BOLD, 22));
        number.setBounds(330, 300, 300, 30);
        add(number);

        JLabel carddetail = new JLabel("Your 16 Digit Card Number");
        carddetail.setFont(new Font("Raleway", Font.BOLD, 12));
        carddetail.setBounds(100, 330, 300, 20);
        add(carddetail);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100, 370, 200, 30);
        add(pin);

        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pnumber.setBounds(330, 370, 300, 30);
        add(pnumber);

        JLabel pindetail = new JLabel("Your 4 Digit Password");
        pindetail.setFont(new Font("Raleway", Font.BOLD, 12));
        pindetail.setBounds(100, 400, 300, 20);
        add(pindetail);

        JLabel services = new JLabel("Services Required:");
        services.setFont(new Font("Raleway", Font.BOLD, 22));
        services.setBounds(100, 450, 400, 30);
        add(services);

        atmCardCheckBox = new JCheckBox("ATM CARD");
        atmCardCheckBox.setBackground(Color.WHITE);
        atmCardCheckBox.setFont(new Font("Raleway", Font.BOLD, 16));
        atmCardCheckBox.setBounds(100, 500, 200, 30);
        add(atmCardCheckBox);

        internetBankingCheckBox = new JCheckBox("Internet Banking");
        internetBankingCheckBox.setBackground(Color.WHITE);
        internetBankingCheckBox.setFont(new Font("Raleway", Font.BOLD, 16));
        internetBankingCheckBox.setBounds(350, 500, 200, 30);
        add(internetBankingCheckBox);

        mobileBankingCheckBox = new JCheckBox("Mobile Banking");
        mobileBankingCheckBox.setBackground(Color.WHITE);
        mobileBankingCheckBox.setFont(new Font("Raleway", Font.BOLD, 16));
        mobileBankingCheckBox.setBounds(100, 550, 200, 30);
        add(mobileBankingCheckBox);

        alertsCheckBox = new JCheckBox("EMAIL & SMS Alerts");
        alertsCheckBox.setBackground(Color.WHITE);
        alertsCheckBox.setFont(new Font("Raleway", Font.BOLD, 16));
        alertsCheckBox.setBounds(350, 550, 200, 30);
        add(alertsCheckBox);

        chequeCheckBox = new JCheckBox("Cheque Book");
        chequeCheckBox.setBackground(Color.WHITE);
        chequeCheckBox.setFont(new Font("Raleway", Font.BOLD, 16));
        chequeCheckBox.setBounds(100, 600, 200, 30);
        add(chequeCheckBox);

        eStatementCheckBox = new JCheckBox("E Statement");
        eStatementCheckBox.setBackground(Color.WHITE);
        eStatementCheckBox.setFont(new Font("Raleway", Font.BOLD, 16));
        eStatementCheckBox.setBounds(350, 600, 200, 30);
        add(eStatementCheckBox);

        declarationCheckBox = new JCheckBox("I Hereby declare that the above entered details are correct to the best of my knowledge.");
        declarationCheckBox.setBackground(Color.WHITE);
        declarationCheckBox.setFont(new Font("Raleway", Font.BOLD, 12));
        declarationCheckBox.setBounds(100, 680, 600, 30);
        add(declarationCheckBox);

        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(250, 720, 100, 30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(420, 720, 100, 30);
        cancel.addActionListener(this);
        add(cancel);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 820);
        setLocation(350, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == submit){
            //savingsAccBtn, fixedDepositAccBtn, currentAccBtn, reccuringDepositAccBtn
            String accountType = null;
            if(savingsAccBtn.isSelected()){
                accountType = "Savings Account";
            }else if(fixedDepositAccBtn.isSelected()){
                accountType = "Fixed Deposit Account";
            }else if(currentAccBtn.isSelected()){
                accountType = "Curent Account";
            }else if(reccuringDepositAccBtn.isSelected()){
                accountType = "Reccuring Deposit Account";
            }

            Random random = new Random();
            String cardnumber ="" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);

            String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);

            String facility = "";
            //atmCardCheckBox, internetBankingCheckBox, mobileBankingCheckBox, alertsCheckBox,
            // chequeCheckBox, eStatementCheckBox, declarationCheckBox;
            if(atmCardCheckBox.isSelected()){
                facility = facility + " ATM Card";
            }
            else if(internetBankingCheckBox.isSelected()){
                facility = facility + " Internet Banking";
            }
            else if(mobileBankingCheckBox.isSelected()){
                facility = facility + " Mobile Banking";
            }
            else if(alertsCheckBox.isSelected()){
                facility = facility + " Email & SMS Alerts";
            }
            else if(chequeCheckBox.isSelected()){
                facility = facility + " Cheque Book";
            }
            else if(eStatementCheckBox.isSelected()){
                facility = facility + " E-Statement";
            }

            try{
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null, "Account Type is required");
                }else{
                    Conn conn = new Conn();
                    String query1 = "insert into signupthree values ('" + formno + "','" + accountType
                            + "','" + cardnumber + "','" + pinnumber +  "','" + facility + "')";
                    String query2 = "insert into login values ('" + formno + "','" + cardnumber + "','" +
                            pinnumber + "')";
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);

                    JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber +
                            "\n PIN: " + pinnumber);
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }else if (ae.getSource() == cancel){

        }
    }

    public static void main(String[] args){
        new SignupThree("");
    }
}
