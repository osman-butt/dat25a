package encapsulation.bank;

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
//        acc1.setBalance(1000);
        acc1.setAccountNo("DKOSNB123");
        System.out.println(acc1);
        acc1.deposit(1000);
        System.out.println(acc1);
        acc1.withdraw(210);
        System.out.println(acc1);
    }
}
