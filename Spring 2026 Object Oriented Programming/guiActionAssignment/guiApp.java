package guiActionAssignment;

import javaInterfaceAssignment.Account;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class guiApp {
    private int x;
    private int y;
    private String temp;

    /* Methods */
    public int add(int a, int b) {
        return a + b;
    }

    /* GUI */
    JLabel display1;
    public guiApp() {
        JPanel jPanel = new JPanel();
        JFrame jFrame = new JFrame();
        JButton button1 = new JButton();
        JTextField text1 = new JTextField(10);
        JTextField text2 = new JTextField(10);
        display1 = new JLabel();

        jFrame.setBounds(1, 1,400, 400);
        button1.setText("Add");
        JLabel label1 = new JLabel("Enter the first number");
        jPanel.add(label1);
        jPanel.add(text1);
        jPanel.add(button1);
        JLabel label2 = new JLabel("Enter the second number");
        jPanel.add(label2);
        jPanel.add(text2);
        jPanel.add(display1);
        jPanel.setSize(400, 400);
        jFrame.add(jPanel);
        jFrame.setVisible(true);

        /* Button Functionality */
        button1.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        temp = text1.getText();
                        x = Integer.parseInt(temp);
                        temp = text2.getText();
                        y = Integer.parseInt(temp);
                        System.out.println("numbers were added");
                        display1.setText("The answer is " + add(x, y));
                    }
                });



    }



    static void main() {
        guiApp g = new guiApp();
    }
}
