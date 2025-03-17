package TP3.Exercicio09;

public class Account {
    String holder;
    int number;
    String agency;
    double balance;
    String openingDate;

    public void withdraw(double amount){
        System.out.println("Saldo atual: " + balance);
        if(amount > 0 && balance >= amount){
            balance -= amount;
        }else {
            System.out.println("Valor de saque inválido!");
        }
        System.out.println("Saldo após operação de saque: " + balance);
    }

    public void deposit(double amount){
        System.out.println("Saldo atual: " + balance);
        if(amount > 0){
            balance += amount;
        }else {
            System.out.println("Valor de depósito inválido!");
        }
        System.out.println("Saldo após operação de depósito: " + balance);
    }

    public void calculateRevenue(){
        double revenue = balance * 0.1;
        System.out.println("Rendimento do mês: " + revenue);
    }
}
