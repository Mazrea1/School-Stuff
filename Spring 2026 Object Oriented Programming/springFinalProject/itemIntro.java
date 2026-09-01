package springFinalProject;

public class itemIntro extends item{
    public String name = "Introduction";
    public Double price;
    public String type = "Introduction";
    public String description;

    public itemIntro(Double price, String description) {
        this.price = price;
        this.description = description;
    }
}
