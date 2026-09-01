package springFinalProject;

public class item extends total{
    public String name;
    public double price;
    public String type;

    public Double selectItem(Double price){
        totalPrice += price;
        return totalPrice;
    }
}
