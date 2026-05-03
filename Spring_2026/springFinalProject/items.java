package springFinalProject;

public class items {


    /* Introductions */
    public itemIntro createShrimpSpringRolls() {
        itemIntro SpringRolls = new itemIntro(5.50, "Shrimp Spring Rolls");
        return SpringRolls;
    }
    public itemIntro createPorkSpringRolls() {
        itemIntro PorkSpringRolls = new itemIntro(5.50, "Pork Spring Rolls");
        return PorkSpringRolls;
    }
    public itemIntro createTofuSpringRolls() {
        itemIntro TofuSpringRolls = new itemIntro(5.50, "Tofu Spring Rolls");
        return TofuSpringRolls;
    }
    public itemIntro createPorkEggRolls() {
        itemIntro PorkEggRolls = new itemIntro(5.50, "Pork Egg Rolls");
        return PorkEggRolls;
    }
    public itemIntro createVeganEggRolls() {
        itemIntro VeganEggRolls = new itemIntro(6.50, "Vegan Egg Rolls");
        return VeganEggRolls;
    }
    public itemIntro createVietDumplingSoup() {
        itemIntro DumplingSoup = new itemIntro(5.50, "Viet Dumpling Soup");
        return DumplingSoup;
    }


    /* Food */
    public itemFood createShakingBeef() {
        itemFood ShakingBeef = new itemFood(16.50, "Shaking Beef");
        return ShakingBeef;
    }
    public itemFood createShakingChicken() {
        itemFood ShakingChicken = new itemFood(16.50, "Shaking Chicken");
        return ShakingChicken;
    }
    public itemFood createShakingShrimp() {
        itemFood ShakingShrimp = new itemFood(16.50, "Shaking Shrimp");
        return ShakingShrimp;
    }
    public itemFood createBeefPho() {
        itemFood BeefPho = new itemFood(14.50, "Beef Pho");
        return BeefPho;
    }
    public itemFood createChickenPho() {
        itemFood ChickenPho = new itemFood(14.50, "Chicken Pho");
        return ChickenPho;
    }
    public itemFood createShrimpPho() {
        itemFood ShrimpPho = new itemFood(14.50, "Shrimp Pho");
        return ShrimpPho;
    }
    public itemFood createBeefVemichelli() {
        itemFood BeefVermichelli = new itemFood(16.00, "Verminchelli noodles with salad and Beef");
        return BeefVermichelli;
    }
    public itemFood createChickenVermichelli() {
        itemFood ChickenVermichelli = new itemFood(16.00, "Verminchelli noodles with salad and Chicken");
        return ChickenVermichelli;
    }
    public itemFood createShrimpVermichelli() {
        itemFood ShrimpVermichelli = new itemFood(16.00, "Verminchelli noodles with salad and Shrimp");
        return ShrimpVermichelli;
    }
    public itemFood createTofuVermichelli() {
        itemFood TofuVermichelli = new itemFood(16.00, "Verminchelli noodles with salad and Tofu");
        return TofuVermichelli;
    }
    public itemFood createVeggiVermichelli() {
        itemFood VeggiVermichelli = new itemFood(16.00, "Verminchelli noodles with salad and extra veggies");
        return VeggiVermichelli;
    }


    /* Drinks */
    public itemDrink createFountainDrink() {
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



}
