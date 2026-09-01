package springFinalProject;

public class itemFood extends item{
        public String name = "Food";
        public Double price;
        public String type = "Food";
        public String description;

        public itemFood(Double price, String description) {
            this.price = price;
            this.description = description;
        }
}
