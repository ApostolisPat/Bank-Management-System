package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import com.toedter.calendar.*;


public class SignupTwo extends JFrame implements ActionListener{

    JTextField panTextField, aadharTextField  ;
    JRadioButton senior_yes,senior_no, existing_yes, existing_no;
    ButtonGroup seniorgroup, existinggroup;
    JComboBox religion, category, occupation, education, income;
    JButton next;
    String formno;

    //Constructor
    SignupTwo(String formno){
        this.formno = formno;

        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        JLabel religionLabel = new JLabel("Religion:");
        religionLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        religionLabel.setBounds(100, 140, 100, 30);
        add(religionLabel);

        String[] valReligion = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);


        JLabel categoryLabel = new JLabel("Category:");
        categoryLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        categoryLabel.setBounds(100, 190, 200, 30);
        add(categoryLabel);

        String[] valCategory = {"General", "OBC", "SC", "ST", "Other"};
        category = new JComboBox(valCategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);

        JLabel incomeLabel = new JLabel("Income:");
        incomeLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        incomeLabel.setBounds(100, 240, 200, 30);
        add(incomeLabel);

        String[] incomeCategory = {"0", "< 700", "< 1300", "< 2.000", "Upto 5.000"};
        income = new JComboBox(incomeCategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);

        JLabel educationLabel = new JLabel("Educational");
        educationLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        educationLabel.setBounds(100, 290, 200, 30);
        add(educationLabel);


        JLabel qualificationLabel = new JLabel("Qualification:");
        qualificationLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        qualificationLabel.setBounds(100, 315, 200, 30);
        add(qualificationLabel);

        String[] educationValues = {"None", "Graduate", "Post-Graduate", "Doctorate", "Other"};
        education = new JComboBox(educationValues);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);

        JLabel occupationLabel = new JLabel("Occupation:");
        occupationLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        occupationLabel.setBounds(100, 390, 200, 30);
        add(occupationLabel);

        String[] occupationValues = {"Employee", "Self-employed", "Student", "Retired", "Other"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);

        JLabel panLabel = new JLabel("PAN Number:");
        panLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        panLabel.setBounds(100, 440, 200, 30);
        add(panLabel);

        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300, 440, 400, 30);
        add(panTextField);

        JLabel aadharLabel = new JLabel("Aadhar Number:");
        aadharLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        aadharLabel.setBounds(100, 490, 200, 30);
        add(aadharLabel);

        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharTextField.setBounds(300, 490, 400, 30);
        add(aadharTextField);

        JLabel seniorLabel = new JLabel("Senior Citizen:");
        seniorLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        seniorLabel.setBounds(100, 540, 200, 30);
        add(seniorLabel);

        senior_yes = new JRadioButton("Yes");
        senior_yes.setBounds(300, 540, 100, 30);
        senior_yes.setBackground(Color.WHITE);
        add(senior_yes);
        senior_no = new JRadioButton("No");
        senior_no.setBounds(400, 540, 100, 30);
        senior_no.setBackground(Color.WHITE);
        add(senior_no);
        seniorgroup = new ButtonGroup();
        seniorgroup.add(senior_yes);
        seniorgroup.add(senior_no);

        JLabel existingAccLabel = new JLabel("Existing Account:");
        existingAccLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        existingAccLabel.setBounds(100, 590, 200, 30);
        add(existingAccLabel);

        existing_yes = new JRadioButton("Yes");
        existing_yes.setBounds(300, 590, 100, 30);
        existing_yes.setBackground(Color.WHITE);
        add(existing_yes);
        existing_no = new JRadioButton("No");
        existing_no.setBounds(400, 590, 100, 30);
        existing_no.setBackground(Color.WHITE);
        add(existing_no);
        existinggroup = new ButtonGroup();
        existinggroup.add(existing_yes);
        existinggroup.add(existing_no);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Rleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this); //Add an action listener to the button
        add(next);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String seniorcitizen = null;
        if(senior_yes.isSelected()){
            seniorcitizen = "Yes";
        }else if(senior_no.isSelected()){
            seniorcitizen = "No";
        }

        String existingaccount = null;
        if(existing_yes.isSelected()){
            existingaccount = "Yes";
        }else if(existing_no.isSelected()){
            existingaccount = "No";
        }

        String span = panTextField.getText();
        String saadhar = aadharTextField.getText();

        try{
            if(formno.isEmpty() || sreligion.isEmpty() || scategory.isEmpty() || sincome.isEmpty() ||
            seducation.isEmpty() || soccupation.isEmpty() || span.isEmpty() || saadhar.isEmpty() ||
            seniorcitizen.isEmpty() || existingaccount.isEmpty()){
                JOptionPane.showMessageDialog(null,"Please, fill all required values");
            }
            else {
                Conn c = new Conn();
                // Create the query
                String query = "Insert into signuptwo values('" + formno + "', '" + sreligion + "', '"
                        + scategory + "', '" + sincome + "', '" + seducation + "', '"
                        + soccupation + "', '" + span + "', '" + saadhar +
                        "', '" + seniorcitizen + "', '" + existingaccount + "')";
                c.s.executeUpdate(query);
            }

            //Signup-third-page Object
            setVisible(false);
            new SignupThree(formno).setVisible(true);
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String [] args){
        new SignupTwo("");
    }

}
