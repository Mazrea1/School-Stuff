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


        public static void main(String[] args) {
            /* Item Creation */

            initializeItems();
            display1 = new JLabel("Subtotal: $0.00");
            display1.setFont(new Font("Arial", Font.BOLD, 14));
            display1.setBorder(BorderFactory.createEmptyBorder(8, 8, 4, 8));

            JLabel taxLabel = new JLabel("Tax (8.25%): $0.00");
            taxLabel.setFont(new Font("Arial", Font.PLAIN, 13));
            taxLabel.setBorder(BorderFactory.createEmptyBorder(4, 8, 4, 8));

            JLabel totalLabel = new JLabel("Total: $0.00");
            totalLabel.setFont(new Font("Arial", Font.BOLD, 16));
            totalLabel.setBorder(BorderFactory.createEmptyBorder(4, 8, 8, 8));




            orderListModel = new DefaultListModel<>();
            JList<String> orderList = new JList<>(orderListModel);
            orderList.setFont(new Font("Arial", Font.PLAIN, 13));
            JScrollPane orderScroll = new JScrollPane(orderList);
            orderScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            orderScroll.setPreferredSize(new Dimension(210, 400));
            JPanel sidebarPanel = new JPanel();
            sidebarPanel.setLayout(new BoxLayout(sidebarPanel, BoxLayout.Y_AXIS));
            sidebarPanel.setBorder(BorderFactory.createTitledBorder("Current Order"));
            sidebarPanel.setPreferredSize(new Dimension(230, 0));


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
                            updateTotals(display1, taxLabel, totalLabel);
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
                            updateTotals(display1, taxLabel, totalLabel);
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
                            updateTotals(display1, taxLabel, totalLabel);
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
                            updateTotals(display1, taxLabel, totalLabel);
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
                            updateTotals(display1, taxLabel, totalLabel);
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
                            updateTotals(display1, taxLabel, totalLabel);
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
                            updateTotals(display1, taxLabel, totalLabel);
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
                            updateTotals(display1, taxLabel, totalLabel);
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
                            updateTotals(display1, taxLabel, totalLabel);
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
                            updateTotals(display1, taxLabel, totalLabel);
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
                            updateTotals(display1, taxLabel, totalLabel);
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
                            updateTotals(display1, taxLabel, totalLabel);
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
                            updateTotals(display1, taxLabel, totalLabel);
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
                            updateTotals(display1, taxLabel, totalLabel);
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
                            updateTotals(display1, taxLabel, totalLabel);
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
                            updateTotals(display1, taxLabel, totalLabel);
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
                            updateTotals(display1, taxLabel, totalLabel);
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
                            updateTotals(display1, taxLabel, totalLabel);
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
                            updateTotals(display1, taxLabel, totalLabel);
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
                            updateTotals(display1, taxLabel, totalLabel);
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
                            updateTotals(display1, taxLabel, totalLabel);
                        }
                    });


            /* Order Management Buttons */
            JButton clearOrderB = createButton("Clear Order");
            clearOrderB.setBackground(Color.RED);
            clearOrderB.setForeground(Color.WHITE);
            clearOrderB.addActionListener(e -> {
                totalPrice = 0.00;
                orderListModel.clear();
                updateTotals(display1, taxLabel, totalLabel);
            });

            JButton removeLastB = createButton("Remove Last Item");
            removeLastB.setBackground(Color.ORANGE);
            removeLastB.addActionListener(e -> {
                if (orderListModel.getSize() > 0) {
                    String lastItem = orderListModel.getElementAt(orderListModel.getSize() - 1);
                    String priceStr = lastItem.substring(lastItem.indexOf("$") + 1);
                    totalPrice -= Double.parseDouble(priceStr);
                    orderListModel.remove(orderListModel.getSize() - 1);
                    updateTotals(display1, taxLabel, totalLabel);
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
            sidebarPanel.add(orderScroll);      // items list in the middle
            sidebarPanel.add(display1);         // subtotal below the list
            sidebarPanel.add(taxLabel);         // tax below subtotal
            sidebarPanel.add(totalLabel);       // final total at the bottom

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
    public static void updateTotals(JLabel subtotalLbl, JLabel taxLbl, JLabel totalLbl) {
        double tax = totalPrice * TAX_RATE;
        double grandTotal = totalPrice + tax;
        subtotalLbl.setText(String.format("Subtotal: $%.2f", totalPrice));
        taxLbl.setText(String.format("Tax (8.25%%): $%.2f", tax));
        totalLbl.setText(String.format("Total: $%.2f", grandTotal));
    }
    public static JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setPreferredSize(new Dimension(220, 80));
        button.setFont(new Font("Arial", Font.BOLD, 14));
        return button;
    }
}
