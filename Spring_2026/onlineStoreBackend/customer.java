package onlineStoreBackend;

public class customer {
    private String billingInfo;


    public void purchase(){
        System.out.println("Your items have been purchased.");
    }

    customer(String billingInfo){
        this.billingInfo = billingInfo;
    }
}

