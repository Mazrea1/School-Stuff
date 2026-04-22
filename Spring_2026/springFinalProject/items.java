package springFinalProject;

public class items {
    /* Drinks */
    public itemDrink  createFountainDrink() {
        itemDrink FountainDrink = new itemDrink(1.99, "fountain drink");
        return FountainDrink;
    }
    public itemDrink createIcedTea() {
        itemDrink IcedTea = new itemDrink(2.99, "iced tea");
        return IcedTea;
    }
    public itemDrink createTractorDrinks() {
        itemDrink TractorDrinks = new itemDrink(2.99, "Juices");
        return TractorDrinks;
    }
    public itemDrink createCraftTea() {
        itemDrink CraftTea = new itemDrink(2.99, "Craft Tea: Jasmine, Oolong, or Pina Colada White");
        return CraftTea;
    }



    /* Food */
    public itemFood createShakingBeef() {
        itemFood ShakingBeef = new itemFood(16.50, "Shaking Beef");
        return ShakingBeef;
    }
    public itemFood createPho() {
        itemFood BeefPho = new itemFood(14.50, "Beef Pho");
        return BeefPho;
    }
    public itemFood createBeefVemichelli() {
       itemFood BeefVermichelli = new itemFood(16.00, "Verminchelli noodles with salad and Beef");
       return BeefVermichelli;
    }

}
