package TP2.exercicio03;

// Conversor de Moedas

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double dollarCoin = 5.75;
        double euroCoin = 6.03;
        double libraCoin = 7.26;

        System.out.println("Insira o valor que deseja converter: ");
        double value = sc.nextDouble();

        System.out.println("\nEscolha para qual moeda deseja converter:");
        System.out.println("1. Dólar");
        System.out.println("2. Euro");
        System.out.println("3. Libra");
        int option = sc.nextInt();

        switch (option){
            case 1:
                double convertedToDollar = value / dollarCoin;
                System.out.printf("Nesta cotação, %.2f reais convertido em dólar é $%.2f\n", value, convertedToDollar);
                break;
            case 2:
                double convertedToEuro = value / euroCoin;
                System.out.printf("Nesta cotação, %.2f reais convertido em euro é $%.2f",value, convertedToEuro);
                break;
            case 3:
                double convertedToLibra = value / libraCoin;
                System.out.printf("Nesta cotação, %.2f reais convertido em euro é $%.2f", value, convertedToLibra);
                break;
            default:
                System.out.println("Error");
                return;
        }
        sc.close();
    }
}
