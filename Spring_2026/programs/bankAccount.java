package programs;

public class bankAccount {
    private String accountNumber;
    private double balance;

    public bankAccount(String accountNumber, double balance) {
        accountNumber = accountNumber;
        balance = balance;
    }
    public void setAccountNumber(String accountNumber) {
        accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
        balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public String withdraw() {
        balance -= 100;
        String response = "Your new balance is: " + balance;
        return response;
    }
    public String deposit() {
        balance += 100;
        String response = "Your new balance is: " + balance;
        return response;
    }
    public String checkBalance() {
        String response = "Your current balance is: " + balance;
        return response;
    }


}
