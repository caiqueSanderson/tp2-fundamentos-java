package exercicio08;

//Classificador de triangulos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Identificador de triângulo");
        System.out.println("Insira o lado A do triângulo: ");
        double sideA = sc.nextDouble();

        System.out.println("Insira o lado B do triângulo: ");
        double sideB = sc.nextDouble();

        System.out.println("Insira o lado C do triângulo: ");
        double sideC = sc.nextDouble();

        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            System.out.println("Lados inválidos!");
        } else if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            System.out.println("Não é um triângulo!");
        } else if (sideA == sideB && sideB == sideC) {
            System.out.println("Este é um triângulo equilátero!");
        } else if (sideA == sideB || sideA == sideC) {
            System.out.println("Este é um triângulo isósceles!");
        } else if (sideA != sideB && sideB != sideC) {
            System.out.println("Este é um triângulo escaleno!");
        } else {
            System.out.println("Opção inválida!");
        }
    }
}
