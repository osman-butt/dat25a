package encapsulation.bank;

public class BankAccount {
    // Create two instance vars: accountNo, balance
    private double balance;
    private String accountNo;
    // Show encapsulation getters and setters (with validation)

    public double getBalance() {
        return balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

//    public void setBalance(double balance) {
//        this.balance = balance;
//    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Amount must be positive");
            return;
        }
        if (amount > balance) {
            System.out.println("Not sufficient balance");
            return;
        }
        balance -= amount;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Amount must be positive");
            return;
        }
        balance += amount;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }


    // Create toString() method
    public String toString() {
        return "BankAccount{accountNo="+accountNo + ", balance=" + balance + "}";
    }
}
