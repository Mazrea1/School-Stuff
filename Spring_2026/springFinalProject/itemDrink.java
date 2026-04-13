package springFinalProject;

public class itemDrink extends item {
    public String name = "drink";
    public Double price;
    public int quantity = 99;
    public String type = "Drink";

    public itemDrink(String name, Double price){
        this.name = name;
        this.price = price;
    }
    public void selectItem(){
        totalPrice += price;
    }

}

