package polymorphismAssignment;

abstract class BankAcc implements Acc{
    public Double balance;



    public abstract Double getInterest();
    @Override public Double checkBalance() {
        return balance;
    }
    @Override public String withdraw(Double amount) {
        if (amount > balance) {
            return "Insufficient funds";
        } else {
            balance -= amount;
            return "Withdrawal successful. New balance: " + balance;
        }
    }
    @Override public String deposit(Double amount) {
        balance += amount;
        return "Deposit successful. New balance: " + balance;
    }
}
