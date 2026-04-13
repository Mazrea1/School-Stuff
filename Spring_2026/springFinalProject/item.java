package springFinalProject;

public class item extends total{
    public String name;
    public double price;
    public int quantity;
    public String type;

    public void selectItem() {
        quantity -= 1;

    }
}
