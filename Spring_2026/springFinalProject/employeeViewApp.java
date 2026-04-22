package springFinalProject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class employeeViewApp {
    /* Static Variables */
    public static double totalPrice = 0.00;
    public static Boolean removeItem = false;
    public static itemDrink FD, IT, TD, CT;
    public static itemFood SB, BP, BV;
        public static void main(String[] args) {
            /* Item Creation */
            initializeItems();




            /* GUI */
            JLabel display1 = new JLabel("Total: $" + totalPrice);
            JFrame JFrame = new JFrame();
            JPanel CardPanel = new JPanel();
            CardLayout cardLayout = new CardLayout();
            CardPanel.setLayout(cardLayout);
            JPanel MenuPanel = new JPanel();
            JPanel DrinkPanel = new JPanel();
            JPanel PlantMenuPanel = new JPanel();
            JPanel IntroPanel = new JPanel();


            CardPanel.add(IntroPanel, "Intro");
            CardPanel.add(MenuPanel, "Food");
            CardPanel.add(DrinkPanel, "Beverages");
            CardPanel.add(PlantMenuPanel, "Plant Menu");
            JFrame.setLayout(new BorderLayout());
            JPanel CategoryButtons = new JPanel();





            /* Button Functionality */
            JButton IntroButton = new JButton("Intro");
            IntroButton.addActionListener(e -> cardLayout.show(CardPanel, "Intro"));


                    /* Introductions */


                    /* Food */
            JButton FoodButton = new JButton("Food");
            FoodButton.addActionListener(e -> cardLayout.show(CardPanel, "Food"));

            JButton ShakingBeefB = new JButton("Shaking Beef");
            ShakingBeefB.addActionListener(
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            ShakingBeefB.setText("Shaking Beef");
                            SB.selectItem(SB.price);
                            System.out.println("Price was added");
                            totalPrice += SB.price;
                            display1.setText(String.format("Your total is: %.2f", totalPrice));
                }});
            JButton BeefPhoB = new JButton("Beef Pho");
            BeefPhoB.addActionListener(
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            BeefPhoB.setText("Beef Pho");
                            BP.selectItem(BP.price);
                            System.out.println("Price was added");
                            totalPrice += BP.price;
                            display1.setText(String.format("Your total is: %.2f", totalPrice));
                        }});
            JButton BeefVB = new JButton("Beef Verminchelli");
            BeefVB.addActionListener(
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            BeefVB.setText("Beef Verminchelli");
                            BV.selectItem(BV.price);
                            System.out.println("Price was added");
                            totalPrice += BV.price;
                            display1.setText(String.format("Your total is: %.2f", totalPrice));
                        }});


                /* Drinks */
            JButton BeverageButton = new JButton("Beverages");
            BeverageButton.addActionListener(e -> cardLayout.show(CardPanel, "Beverages"));

            JButton fountainDrinkB = new JButton("Fountain Drink");
            fountainDrinkB.addActionListener(
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            fountainDrinkB.setText("Fountain Drink");
                            FD.selectItem(FD.price);
                            System.out.println("Price was added");
                            totalPrice += FD.price;
                            display1.setText(String.format("Your total is: %.2f", totalPrice));
                        }
                    });
            JButton icedTeaB = new JButton("Iced Tea");
            icedTeaB.addActionListener(
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            IT.selectItem(IT.price);
                            System.out.println("Price was added");
                            totalPrice += IT.price;
                            display1.setText(String.format("Your total is: %.2f", totalPrice));
                        }
                    });


                /* Plant Based */
            JButton PlantMenuButton = new JButton("Plant Menu");
            PlantMenuButton.addActionListener(e -> cardLayout.show(CardPanel, "Plant Menu"));












            CategoryButtons.add(FoodButton);
            CategoryButtons.add(BeverageButton);
            DrinkPanel.add(fountainDrinkB);
            DrinkPanel.add(icedTeaB);
            MenuPanel.add(ShakingBeefB);
            MenuPanel.add(BeefPhoB);
            MenuPanel.add(BeefVB);
            JFrame.add(CategoryButtons, BorderLayout.NORTH);
            JFrame.add(CardPanel, BorderLayout.CENTER);
            JPanel bottomPanel = new JPanel();
            JFrame.setTitle("POS System");
            bottomPanel.add(display1);
            JFrame.add(bottomPanel, BorderLayout.SOUTH);


            JFrame.setBounds(500, 500, 400, 300);
            JFrame.setVisible(true);


        }


    public static void initializeItems() {
        items Items = new items();
        FD = Items.createFountainDrink();
        IT = Items.createIcedTea();
        TD = Items.createTractorDrinks();
        CT = Items.createCraftTea();
        SB = Items.createShakingBeef();
        BP = Items.createPho();
        BV = Items.createBeefVemichelli();
    }

}
