package TP3.Exercicio01;

// Declaracao da classe BankAccount
public class BankAccount {
    // Atributos da Classe
    private String holder;
    private int numberAccount;
    private double balance;

    public BankAccount(String holder, int numberAccount, double balance){
        this.holder = holder;
        this.numberAccount = numberAccount;
        this.balance = balance;
    }

    // Metodos
    public void debit(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Débito realizado com sucesso. Novo saldo: " + balance);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Depósito realizado com sucesso. Novo saldo: " + balance);
        }
    }

    public void displayAccountInfo(){
        System.out.println("Titular: " + holder);
        System.out.println("Número da conta: " + numberAccount);
        System.out.println("Saldo: R$" + balance);
    }
}
