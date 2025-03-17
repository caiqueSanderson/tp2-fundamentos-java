package TP2.exercicio05;

// Calculadora de descontos progressivos

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculador de desconto: ");
        double fullPrice = sc.nextDouble();
        double endPrice = 0;
        double discount = 0;

        //Calcular o desconto
        if (fullPrice < 500) {
            endPrice = fullPrice;
        } else if (fullPrice >= 500 && fullPrice <= 1000) {
            discount = fullPrice * 0.05;
            endPrice = fullPrice - discount;
        } else if (fullPrice > 1000) {
            discount = fullPrice * 0.10;
            endPrice = fullPrice - discount;
        } else {
            System.out.println("Opção inválida!");
        }

        //Exibição de dados
        System.out.println("\nValor da compra: " + fullPrice + "\n Valor Final: " + endPrice + "\n Desconto: -" + discount);
        sc.close();
    }
}
