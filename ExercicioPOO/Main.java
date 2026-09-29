package ExercicioPOO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount bank = new BankAccount();

        System.out.print("Titular: ");
        bank.holder = sc.nextLine();

        System.out.print("Saldo: ");
        bank.balance = sc.nextDouble();

        System.out.print("Valor para depositar: ");
        Double amount = sc.nextDouble();
        bank.deposit(amount);

        System.out.print("valor para saque: ");
        amount = sc.nextDouble();
        bank.withdraw(amount);

        System.out.println("Titular: " + bank.holder);
        System.out.println("Slado Final: " + bank.getBalance());
        System.out.println("Possui Slado? " + bank.hasBalance());

        sc.close();
    }
}
