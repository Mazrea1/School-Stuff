package Assignment_Inheritance;

import javax.swing.*;

public class computer_with_Attributes {
    public String memory = "32gb";
    public String storage = "1tb";
    public String processor = "i9";

    public void getDetails(){
        String details = "Details of device are Memory: " + memory + ", Storage: " + storage + ", Processor: " + processor;
        System.out.println(details);
    }
}

