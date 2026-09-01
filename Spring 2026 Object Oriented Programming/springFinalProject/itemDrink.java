package springFinalProject;

public class itemDrink extends item {
    public String name = "drink";
    public Double price;
    public String type = "Drink";
    public String description;

    public itemDrink(Double price, String description) {
        this.price = price;
        this.description = description;
    }


}

