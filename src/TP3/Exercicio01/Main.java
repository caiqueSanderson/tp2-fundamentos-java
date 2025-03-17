package TP3.Exercicio01;

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Fulano", 12345, 12000.10);
        myAccount.displayAccountInfo();
        myAccount.deposit(1.99);
        myAccount.debit(0.50);
    }
}
