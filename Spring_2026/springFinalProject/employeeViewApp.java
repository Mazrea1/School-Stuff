package springFinalProject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class employeeViewApp {
    /* Static Variables */
    public static double totalPrice = 0.00;
    public static Boolean removeItem = false;
    public static itemIntro SSR, PER, VER, PSR, TSR, VD;
    public static itemDrink FD, IT, TD, CT;
    public static itemFood SB, BP, BV, SC, SS, CP, SP, CV, SV, TV, VV;
    public static final double TAX_RATE = 0.0825;
    public static JLabel display1;
    public static DefaultListModel<String> orderListModel;
    public static JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setPreferredSize(new Dimension(220, 80));
        button.setFont(new Font("Arial", Font.BOLD, 14));
        return button;
    }

        public static void main(String[] args) {
            /* Item Creation */

            initializeItems();
            display1 = new JLabel("Total: $" + String.format("%.2f", totalPrice));
            display1.setFont(new Font("Arial", Font.BOLD, 16));
            display1.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
            orderListModel = new DefaultListModel<>();
            JList<String> orderList = new JList<>(orderListModel);
            orderList.setFont(new Font("Arial", Font.PLAIN, 13));
            JScrollPane orderScroll = new JScrollPane(orderList);
            orderScroll.setPreferredSize(new Dimension(220, 400));



            /* Left Side for total and order list */
            JPanel sidebarPanel = new JPanel();
            sidebarPanel.setLayout(new BoxLayout(sidebarPanel, BoxLayout.Y_AXIS));
            sidebarPanel.setBorder(BorderFactory.createTitledBorder("Current Order"));
            sidebarPanel.setPreferredSize(new Dimension(230, 0)); // fixed width, height fills
            sidebarPanel.add(display1);
            sidebarPanel.add(orderScroll);

            /* GUI */
            JFrame JFrame = new JFrame();
            JPanel CardPanel = new JPanel();
            CardLayout cardLayout = new CardLayout();
            CardPanel.setLayout(cardLayout);
            JPanel IntroPanel = new JPanel();
            JPanel MenuPanel = new JPanel();
            JPanel DrinkPanel = new JPanel();


            CardPanel.add(IntroPanel, "Intro");
            CardPanel.add(MenuPanel, "Food");
            CardPanel.add(DrinkPanel, "Beverages");
            JFrame.setLayout(new BorderLayout());
            JPanel CategoryButtons = new JPanel();




            /* Introductions */
            JButton IntroButton = createButton("Intro");
            IntroButton.addActionListener(e -> cardLayout.show(CardPanel, "Intro"));
            JButton ShrimpSpringRollsB = createButton("Shrimp Spring Rolls");
            ShrimpSpringRollsB.addActionListener(
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            ShrimpSpringRollsB.setText("Shrimp Spring Rolls");
                            SSR.selectItem(SSR.price);
                            System.out.println("Price was added");
                            totalPrice += SSR.price;
                            orderListModel.addElement("Shrimp Spring Rolls - $ " + String.format("%.2f", SSR.price));
                            display1.setText(String.format("Your total is: %.2f", totalPrice));
                        }
                    });
            JButton PorkEggRollsB = createButton("Pork Egg Rolls");
            PorkEggRollsB.addActionListener(
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            PorkEggRollsB.setText("Pork Egg Rolls");
                            PER.selectItem(PER.price);
                            System.out.println("Price was added");
                            totalPrice += PER.price;
                            orderListModel.addElement("Pork Egg Rolls - $ " + String.format("%.2f", PER.price));
                            display1.setText(String.format("Your total is: %.2f", totalPrice));
                        }
                    });
            JButton VeganEggRollsB = createButton("Vegan Egg Rolls");
            VeganEggRollsB.addActionListener(
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            VeganEggRollsB.setText("Vegan Egg Rolls");
                            VER.selectItem(VER.price);
                            System.out.println("Price was added");
                            totalPrice += VER.price;
                            orderListModel.addElement("Vegan Egg Rolls - $ " + String.format("%.2f", VER.price));
                            display1.setText(String.format("Your total is: %.2f", totalPrice));
                        }
                    });
            JButton PorkSpringRollsB = createButton("Pork Spring Rolls");
            PorkSpringRollsB.addActionListener(
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            PorkSpringRollsB.setText("Pork Spring Rolls");
                            PSR.selectItem(PSR.price);
                            System.out.println("Price was added");
                            totalPrice += PSR.price;
                            orderListModel.addElement("Pork Spring Rolls - $ " + String.format("%.2f", PSR.price));
                            display1.setText(String.format("Your total is: %.2f", totalPrice));
                        }
                    });
            JButton TofuSpringRollsB = createButton("Tofu Spring Rolls");
            TofuSpringRollsB.addActionListener(
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            TofuSpringRollsB.setText("Tofu Spring Rolls");
                            TSR.selectItem(TSR.price);
                            System.out.println("Price was added");
                            totalPrice += TSR.price;
                            orderListModel.addElement("Tofu Spring Rolls - $ " + String.format("%.2f", TSR.price));
                            display1.setText(String.format("Your total is: %.2f", totalPrice));
                        }
                    });
            JButton VietDumplingSoupB = createButton("Viet Dumpling Soup");
            VietDumplingSoupB.addActionListener(
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            VietDumplingSoupB.setText("Viet Dumpling Soup");
                            VD.selectItem(VD.price);
                            System.out.println("Price was added");
                            totalPrice += VD.price;
                            orderListModel.addElement("Viet Dumpling Soup - $ " + String.format("%.2f", VD.price));
                            display1.setText(String.format("Your total is: %.2f", totalPrice));
                        }
                    });


                    /* Food */
            JButton FoodButton = createButton("Food");
            FoodButton.addActionListener(e -> cardLayout.show(CardPanel, "Food"));

            JButton ShakingBeefB = createButton("Shaking Beef");
            ShakingBeefB.addActionListener(
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            ShakingBeefB.setText("Shaking Beef");
                            SB.selectItem(SB.price);
                            System.out.println("Price was added");
                            totalPrice += SB.price;
                            orderListModel.addElement("Shaking Beef - $ " + String.format("%.2f", SB.price));
                            display1.setText(String.format("Your total is: %.2f", totalPrice));
                }});
            JButton ShakingChickenB = createButton("Shaking Chicken");
            ShakingChickenB.addActionListener(
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            ShakingChickenB.setText("Shaking Chicken");
                            SC.selectItem(SC.price);
                            System.out.println("Price was added");
                            totalPrice += SC.price;
                            orderListModel.addElement("Shaking Chicken - $ " + String.format("%.2f", SC.price));
                            display1.setText(String.format("Your total is: %.2f", totalPrice));
                        }});
            JButton ShakingShrimpB = createButton("Shaking Shrimp");
            ShakingShrimpB.addActionListener(
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            ShakingShrimpB.setText("Shaking Shrimp");
                            SS.selectItem(SS.price);
                            System.out.println("Price was added");
                            totalPrice += SS.price;
                            orderListModel.addElement("Shaking Shrimp - $ " + String.format("%.2f", SS.price));
                            display1.setText(String.format("Your total is: %.2f", totalPrice));
                        }});
            JButton BeefPhoB = createButton("Beef Pho");
            BeefPhoB.addActionListener(
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            BeefPhoB.setText("Beef Pho");
                            BP.selectItem(BP.price);
                            System.out.println("Price was added");
                            totalPrice += BP.price;
                            orderListModel.addElement("Beef Pho - $ " + String.format("%.2f", BP.price));
                            display1.setText(String.format("Your total is: %.2f", totalPrice));
                        }});
            JButton ChickenPhoB = createButton("Chicken Pho");
            ChickenPhoB.addActionListener(
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            ChickenPhoB.setText("Chicken Pho");
                            CP.selectItem(CP.price);
                            System.out.println("Price was added");
                            totalPrice += CP.price;
                            orderListModel.addElement("Chicken Pho - $ " + String.format("%.2f", CP.price));
                            display1.setText(String.format("Your total is: %.2f", totalPrice));
                        }});
            JButton ShrimpPhoB = createButton("Shrimp Pho");
            ShrimpPhoB.addActionListener(
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            ShrimpPhoB.setText("Shrimp Pho");
                            SP.selectItem(SP.price);
                            System.out.println("Price was added");
                            totalPrice += SP.price;
                            orderListModel.addElement("Shrimp Pho - $ " + String.format("%.2f", SP.price));
                            display1.setText(String.format("Your total is: %.2f", totalPrice));
                        }});
            JButton BeefVB = createButton("Beef Verminchelli");
            BeefVB.addActionListener(
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            BeefVB.setText("Beef Verminchelli");
                            BV.selectItem(BV.price);
                            System.out.println("Price was added");
                            totalPrice += BV.price;
                            orderListModel.addElement("Beef Verminchelli - $ " + String.format("%.2f", BV.price));
                            display1.setText(String.format("Your total is: %.2f", totalPrice));
                        }});
            JButton ChickenVB = createButton("Chicken Verminchelli");
            ChickenVB.addActionListener(
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            ChickenVB.setText("Chicken Verminchelli");
                            CV.selectItem(CV.price);
                            System.out.println("Price was added");
                            totalPrice += CV.price;
                            orderListModel.addElement("Chicken Verminchelli - $ " + String.format("%.2f", CV.price));
                            display1.setText(String.format("Your total is: %.2f", totalPrice));
                        }});
            JButton ShrimpVB = createButton("Shrimp Verminchelli");
            ShrimpVB.addActionListener(
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            ShrimpVB.setText("Shrimp Verminchelli");
                            SV.selectItem(SV.price);
                            System.out.println("Price was added");
                            totalPrice += SV.price;
                            orderListModel.addElement("Shrimp Verminchelli - $ " + String.format("%.2f", SV.price));
                            display1.setText(String.format("Your total is: %.2f", totalPrice));
                        }});
            JButton TofuVB = createButton("Tofu Verminchelli");
            TofuVB.addActionListener(
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            TofuVB.setText("Tofu Verminchelli");
                            TV.selectItem(TV.price);
                            System.out.println("Price was added");
                            totalPrice += TV.price;
                            orderListModel.addElement("Tofu Verminchelli - $ " + String.format("%.2f", TV.price));
                            display1.setText(String.format("Your total is: %.2f", totalPrice));
                        }});
            JButton VeggiVB = createButton("Vegan Verminchelli");
            VeggiVB.addActionListener(
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            VeggiVB.setText("Vegan Verminchelli");
                            VV.selectItem(VV.price);
                            System.out.println("Price was added");
                            totalPrice += VV.price;
                            orderListModel.addElement("Vegan Verminchelli - $ " + String.format("%.2f", VV.price));
                            display1.setText(String.format("Your total is: %.2f", totalPrice));
                        }});


                /* Drinks */
            JButton BeverageButton = createButton("Beverages");
            BeverageButton.addActionListener(e -> cardLayout.show(CardPanel, "Beverages"));

            JButton fountainDrinkB = createButton("Fountain Drink");
            fountainDrinkB.addActionListener(
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            fountainDrinkB.setText("Fountain Drink");
                            FD.selectItem(FD.price);
                            System.out.println("Price was added");
                            totalPrice += FD.price;
                            orderListModel.addElement("Fountain Drink - $ " + String.format("%.2f", FD.price));
                            display1.setText(String.format("Your total is: %.2f", totalPrice));
                        }
                    });
            JButton icedTeaB = createButton("Iced Tea");
            icedTeaB.addActionListener(
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            IT.selectItem(IT.price);
                            System.out.println("Price was added");
                            totalPrice += IT.price;
                            orderListModel.addElement("Iced Tea - $ " + String.format("%.2f", IT.price));
                            display1.setText(String.format("Your total is: %.2f", totalPrice));
                        }
                    });
            JButton tractorDrinksB = createButton("Tractor Drinks");
            tractorDrinksB.addActionListener(
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            TD.selectItem(TD.price);
                            System.out.println("Price was added");
                            totalPrice += TD.price;
                            orderListModel.addElement("Tractor Drinks - $ " + String.format("%.2f", TD.price));
                            display1.setText(String.format("Your total is: %.2f", totalPrice));
                        }
                    });
            JButton craftTeaB = createButton("Craft Tea");
            craftTeaB.addActionListener(
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            CT.selectItem(CT.price);
                            System.out.println("Price was added");
                            totalPrice += CT.price;
                            orderListModel.addElement("Craft Tea - $ " + String.format("%.2f", CT.price));
                            display1.setText(String.format("Your total is: %.2f", totalPrice));
                        }
                    });


            JButton clearOrderB = createButton("Clear Order");
            clearOrderB.setBackground(Color.RED);
            clearOrderB.setForeground(Color.WHITE);
            clearOrderB.addActionListener(e -> {
                totalPrice = 0.00;
                orderListModel.clear();
                display1.setText("Total: $0.00");
            });

            JButton removeLastB = createButton("Remove Last Item");
            removeLastB.setBackground(Color.ORANGE);
            removeLastB.addActionListener(e -> {
                if (orderListModel.getSize() > 0) {
                    String lastItem = orderListModel.getElementAt(orderListModel.getSize() - 1);
                    // Extract the price from the string (grabs the number after the "$")
                    String priceStr = lastItem.substring(lastItem.indexOf("$") + 1);
                    totalPrice -= Double.parseDouble(priceStr);
                    orderListModel.remove(orderListModel.getSize() - 1);
                    display1.setText(String.format("Total: $%.2f", totalPrice));
                }
            });

            /* Adding Buttons to Panels */
            CategoryButtons.add(IntroButton);
            CategoryButtons.add(FoodButton);
            CategoryButtons.add(BeverageButton);

            IntroPanel.add(ShrimpSpringRollsB);
            IntroPanel.add(PorkSpringRollsB);
            IntroPanel.add(TofuSpringRollsB);
            IntroPanel.add(PorkEggRollsB);
            IntroPanel.add(VeganEggRollsB);
            IntroPanel.add(VietDumplingSoupB);

            MenuPanel.add(ShakingBeefB);
            MenuPanel.add(ShakingChickenB);
            MenuPanel.add(ShakingShrimpB);
            MenuPanel.add(BeefPhoB);
            MenuPanel.add(ChickenPhoB);
            MenuPanel.add(ShrimpPhoB);
            MenuPanel.add(BeefVB);
            MenuPanel.add(ChickenVB);
            MenuPanel.add(ShrimpVB);
            MenuPanel.add(TofuVB);
            MenuPanel.add(VeggiVB);

            DrinkPanel.add(fountainDrinkB);
            DrinkPanel.add(icedTeaB);
            DrinkPanel.add(tractorDrinksB);
            DrinkPanel.add(craftTeaB);

            sidebarPanel.add(removeLastB);
            sidebarPanel.add(clearOrderB);



            JFrame.add(CategoryButtons, BorderLayout.NORTH);
            JFrame.add(CardPanel, BorderLayout.CENTER);
            JFrame.add(sidebarPanel, BorderLayout.EAST);
            JFrame.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
            JFrame.setTitle("POS System");
            JFrame.setVisible(true);


        }
        /* Item Creation Method */
    public static void initializeItems() {
        items Items = new items();
        SSR = Items.createShrimpSpringRolls();
        PSR = Items.createPorkSpringRolls();
        TSR = Items.createTofuSpringRolls();
        PER = Items.createPorkEggRolls();
        VER = Items.createVeganEggRolls();
        VD = Items.createVietDumplingSoup();
        FD = Items.createFountainDrink();
        IT = Items.createIcedTea();
        TD = Items.createTractorDrinks();
        CT = Items.createCraftTea();
        SB = Items.createShakingBeef();
        SC = Items.createShakingChicken();
        SS = Items.createShakingShrimp();
        BP = Items.createBeefPho();
        CP = Items.createChickenPho();
        SP = Items.createShrimpPho();
        BV = Items.createBeefVemichelli();
        CV = Items.createChickenVermichelli();
        SV = Items.createShrimpVermichelli();
        TV = Items.createTofuVermichelli();
        VV = Items.createVeggiVermichelli();
    }
}
