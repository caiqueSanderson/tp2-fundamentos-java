package TP3.Exercicio09;

public class TestAccount {
    public static void main(String[] args){
        Account myAccount = new Account();
        myAccount.holder = "Fulano";
        myAccount.number = 111222333;
        myAccount.agency = "Banco do Brasil";
        myAccount.balance = 12000;
        myAccount.openingDate = "01/03/2024";

        myAccount.withdraw(6000);
        myAccount.deposit(20000);
        myAccount.calculateRevenue();
    }
}
