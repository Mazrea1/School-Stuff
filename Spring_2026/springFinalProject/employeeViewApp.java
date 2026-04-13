package springFinalProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class employeeViewApp {
    public double totalPrice = 0.00;
        public static void main(String[] args) {
            /* Item Creation */
            /* create a method to initialize all the items and call into the main class */
            items Items = new items();
            item FD = Items.createFountainDrink();
            item IT = Items.createIcedTea();
            System.out.println("The total price is: " + FD.totalPrice);



            /* GUI */
            JLabel display1;
            JPanel jPanel = new JPanel();
            JFrame jFrame = new JFrame();
            JButton fountainDrinkButton = new JButton();
            JButton icedTeaButton = new JButton();
            JTextField text1 = new JTextField(10);
            display1 = new JLabel();


            jFrame.setBounds(1, 1,400, 400);
            fountainDrinkButton.setText("fountain drink");
            icedTeaButton.setText("iced tea");
            jPanel.add(fountainDrinkButton);
            jPanel.add(icedTeaButton);
            jPanel.add(display1);
            jPanel.setSize(400, 400);
            jFrame.add(jPanel);
            jFrame.setVisible(true);



            /* Button Functionality */
            fountainDrinkButton.addActionListener(
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            FD.selectItem();
                            System.out.println("Price was added");
                            display1.setText("Your total is: " + FD.totalPrice);
                        }
                    });
            icedTeaButton.addActionListener(
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            IT.selectItem();
                            System.out.println("Price was added");
                            display1.setText("Your total is: " + IT.totalPrice);
                        }
                    });
        }

}
