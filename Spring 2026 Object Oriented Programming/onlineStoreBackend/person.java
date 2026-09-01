package onlineStoreBackend;

public class person {
    private String name;
    private int accID;
    private String address;


    person(String name){
        this.name = name;
    }
    person(String name, int accID){
        this.name = name;
        this.accID = accID;
    }
    person(String name, int accID, String address){
        this.name = name;
        this.accID = accID;
        this.address = address;
    }
}
