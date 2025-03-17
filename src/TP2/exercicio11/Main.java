package TP2.exercicio11;

// Sequencia numerica personalizada

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Programa de sequência númerica");
        System.out.print("Insira o valor inicial do número: ");
        int initialValue = sc.nextInt();

        System.out.print("Insira o valor do incremento: ");
        int incrementValue = sc.nextInt();

        if (incrementValue <= 0){
            System.out.println("O incremento deve ser um número positivo!");
        }else {
            System.out.print("Sequência: ");
            int number = initialValue;
            boolean first = true;

            while (number < 100){
                if (!first){
                    System.out.print(", ");
                }
                System.out.print(number);
                number += incrementValue;
                first = false;
            }
        }
        sc.close();
    }
}
