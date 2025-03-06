package exercicio02;

// Calculadora de Média de Notas

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora - Média");

        System.out.println("Insira a primeira nota: ");
        double firstGrade = sc.nextDouble();

        System.out.println("Insira a segunda nota: ");
        double secondGrade = sc.nextDouble();

        System.out.println("Insira a terceira nota: ");
        double thirdGrade = sc.nextDouble();

        System.out.println("Insira a quarta nota: ");
        double fourthGrade = sc.nextDouble();

        double average = (firstGrade + secondGrade + thirdGrade + fourthGrade) / 4;
        System.out.println("Sua média é: " + average);

        if (average >= 7) {
            System.out.println("Aprovado!");
        } else if (average <= 6.9 && average >= 5) {
            System.out.println("Em recuperação!");
        } else if (average < 5) {
            System.out.println("Reprovado!");
        } else {
            System.out.println("Error");
        }

        sc.close();

    }
}
