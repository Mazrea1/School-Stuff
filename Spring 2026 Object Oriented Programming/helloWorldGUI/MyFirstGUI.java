package helloWorldGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFirstGUI implements ActionListener {
    JLabel display1;
    public MyFirstGUI() {
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();

        JLabel welcomeLabel = new JLabel();

        display1 = new JLabel();

        JButton button = new JButton();
        button.setText("OK !!");
        button.addActionListener(this);
        jPanel.add(welcomeLabel);
        jPanel.add(button);
        jPanel.add(display1);
        jFrame.add(jPanel);
        welcomeLabel.setText("WELCOME TO GUI !!");
        jFrame.setVisible(true);
        jFrame.pack();

    }

    public static void main(String[] args) {
        MyFirstGUI g = new MyFirstGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("You clicked the button !");
        display1.setText("You clicked Me !!");
    }



}

