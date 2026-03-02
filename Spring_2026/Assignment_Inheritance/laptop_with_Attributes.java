package Assignment_Inheritance;

public class laptop_with_Attributes extends computer_with_Attributes {
    public String size = "15 inches";
    public Boolean isTouchscreen = true;

    laptop_with_Attributes(String memory, String storage, String processor) {
        this.memory = memory;
        this.storage = storage;
        this.processor = processor;
        this.size = "15 inches";
        this.isTouchscreen = true;
    }
}
