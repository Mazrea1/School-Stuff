package springFinalProject;

public class items {
    public item createFountainDrink() {
        itemDrink fountainDrink = new itemDrink("fountain drink", 1.99);
        return fountainDrink;
    }
    public item createIcedTea() {
        itemDrink icedTea = new itemDrink("iced tea", 2.99);
        return icedTea;
    }
}
