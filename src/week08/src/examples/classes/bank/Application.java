package examples.classes.bank;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.balance = 1000;
        account.owner = "Osman";
        account.accountNo = "OS123456";

        System.out.println("The balance is " + account.balance);

        account.credit(100);

        System.out.println("The balance is now " + account.balance);

        account.debit(990);

        System.out.println("The balance is now " + account.balance);

        account.debit(1000);

        System.out.println("The balance is now " + account.balance);

        BankAccount account2 = new BankAccount("Osman" , "2");

        System.out.println("The balance of account2 is " + account2.balance);
        System.out.println("The owner is " + account2.owner);
        System.out.println("The accountno is " + account2.accountNo);

        account2.owner = "John";

        String str = account.toString();

        System.out.println(str);
        System.out.println(account);

    }
}
