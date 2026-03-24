package javaInterfaceAssignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Account{

    /* Methods */
    public String withdraw() {
        return ("Withdrawing money from account");
    }
    public String deposit() {
        return("Depositing money to account");
    }
    public String checkBalance() {
        return("Checking balance of account");
    }



    /* GUI */
    JLabel display1;
    public Account() {
        JPanel jPanel = new JPanel();
        JFrame jFrame = new JFrame();
        JButton button1 = new JButton();
        display1 = new JLabel();


        button1.setText("Withdraw");
        JButton button2 = new JButton("Deposit");
        JButton button3 = new JButton("Check Balance");
        JLabel label1 = new JLabel("Welcome to your account");
        jPanel.add(button1);
        jPanel.add(button2);
        jPanel.add(button3);
        jPanel.add(label1);
        jPanel.setSize(1200, 800);
        jPanel.add(display1);
        jFrame.add(jPanel);
        jFrame.setVisible(true);
        jFrame.pack();



    /* Button Functionality */
    button1.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    display1.setText("");
                    display1.setText(withdraw());
                }
            });
    button2.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    display1.setText("");
                    display1.setText(deposit());
                }
            });
    button3.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    display1.setText("");
                    display1.setText(checkBalance());
                }
            });


    }
    static void main() {
        Account a = new Account();
    }
}
