package TP2.exercicio06;

// Verificador de ano Bissexto

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Verificador de ano bissexto");
        System.out.println("Insira o ano que deseja verificar de é bissexto: ");
        int year = sc.nextInt();
        boolean isLeapYear = false;

        String messageIsLeapYear = "É um ano Bissexto!";
        String messageIsNotLeapYear = "Não é um ano Bissexto!";

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            } else {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        }
        System.out.println(isLeapYear ? messageIsLeapYear : messageIsNotLeapYear);
        sc.close();
    }
}
