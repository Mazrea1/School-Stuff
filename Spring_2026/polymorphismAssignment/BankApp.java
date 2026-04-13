package polymorphismAssignment;


public class BankApp {
    public Acc createAcc(String type) {
        if (type.equals("checking")) {
            return new CheckingAcc();
        } else if (type.equals("savings")) {
            return new SavingsAcc();
        } else {
            return null;
        }
    }
    Double calculateInterest(BankAcc account) {
        return account.getInterest();
    }


    public static void main(String[] args) {
        BankApp app = new BankApp();
        Acc acc = app.createAcc("checking");
        Acc acc1 = app.createAcc("savings");
        CheckingAcc acc2 = (CheckingAcc) acc;
        SavingsAcc acc3 = (SavingsAcc) acc1;
        System.out.println("Interest rate of the Checking Account: " + app.calculateInterest((BankAcc) acc2));
        System.out.println("Interest rate of the Savings Account: " + app.calculateInterest((BankAcc) acc3));


    }
}
