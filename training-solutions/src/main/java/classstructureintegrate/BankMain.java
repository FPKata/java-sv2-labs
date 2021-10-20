package classstructureintegrate;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your bank account?");
        String accountNumber = scanner.nextLine();
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("How much money do you have?");
        int balance = scanner.nextInt();

        BankAccount account = new BankAccount(accountNumber, name, balance);
        account.deposit(1000);
        System.out.println("Your money after deposit: " + account.getBalance());
        account.withdraw(2000);
        System.out.println("Your money after withdrawal: " + account.getBalance());
        System.out.println(account.getInfo(accountNumber, name, balance));
    }
}
