package constructors.bank;

public class BankAccount {
    // Create two instance vars: accountNo, balance
    private double balance;
    private String accountNo;



    public BankAccount() {
        this("Unknown",0);
//        this.accountNo = "unknown";
//        this.balance = 0;
    }

    public BankAccount(String accountNo) {
        this(accountNo,0);
//        this.accountNo = accountNo;
//        this.balance = 0;
    }

    public BankAccount(double balance) {
        this("Unknown",balance);
//        this.balance = balance;
//        this.accountNo = "Unknown";
    }

    public BankAccount(String accountNo, double balance) {
        if (balance < 0) {
            System.out.println("Balance cant be below zero");
            this.balance = 0;
            this.accountNo = accountNo;
        } else {
            this.balance = balance;
            this.accountNo = accountNo;
        }
    }



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
