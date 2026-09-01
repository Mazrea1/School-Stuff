package assignmentInheritance;

public class laptop_with_Attributes extends computer_with_Attributes {
    public String size = "18 inches";
    public Boolean isTouchscreen = true;

    laptop_with_Attributes(String memory, String storage, String processor) {
        this.memory = memory;
        this.storage = storage;
        this.processor = processor;
        this.size = "18 inches";
        this.isTouchscreen = true;
    }
}
