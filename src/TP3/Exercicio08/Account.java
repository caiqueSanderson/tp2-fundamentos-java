package TP3.Exercicio08;

public class Account {
    String holder;
    int number;
    String agency;
    double balance;
    String openingDate;

    public void withdraw(double amount){
        if(amount > 0 && balance >= amount){
            balance -= amount;
        }else {
            System.out.println("Valor de saque inválido!");
        }
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    public double calculateRevenue(){
        return balance * 0.1;
    }
}
