package examples.classes.bank;

public class BankAccount {
    double balance;
    String owner;
    String accountNo;

    public BankAccount() {
        System.out.println("In constructor");
    }

    public BankAccount(String owner, String accountNo) {
        this.owner = owner;
        this.accountNo = accountNo;
    }

    public void debit(double amount) {
        if (balance < amount) {
            System.out.println("Du har ikke dækning");
            return;
        }
        balance -= amount;
    }

    public void credit(double amount) {
        balance += amount;
    }

    public String toString() {
        return "BankAccount{owner=" + this.owner +", accountNo="+ this.accountNo  + ", balance="+ this.balance + "}";
    }

}
