package TP2.exercicio07;

// Calculadora de Imposto de renda
// [(salário – dependentes – pensão alimentícia – INSS) x alíquota IR] – parcela dedutível

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Simulador Imposto de Renda");
        System.out.print("Insira seu sálario bruto anual:");
        double salary = sc.nextDouble();

        System.out.print("Insira a quantidade de dependentes: ");
        int numberDependents = sc.nextInt();

        System.out.print("Insira o valor pago de pensão alimentícia: ");
        double valuePension = sc.nextDouble();

        System.out.print("Insira o valor pago ao INSS: ");
        double valueInss = sc.nextDouble();

        double valueForDependents = 189.50;
        double baseValue = (((salary - (numberDependents * valueForDependents)) - valuePension) - valueInss);
        double tax = 0;

        if (baseValue <= 2112.00) {
            tax = 0;
        } else if (baseValue <= 2826.65) {
            tax = (baseValue * 0.075) - 158.40;
        } else if (baseValue <= 3751.05) {
            tax = (baseValue * 0.15) - 370.40;
        } else if (baseValue <= 4664.68) {
            tax = (baseValue * 0.225) - 651.73;
        } else {
            tax = (baseValue * 0.275) - 884.96;
        }

        double netSalary = salary - tax;

        System.out.println("\nResultado da simulação!");
        System.out.printf("Base de cálculo: R$ %.2f%n", baseValue);
        System.out.printf("Imposto devido: R$ %.2f%n", tax);
        System.out.printf("Salário líquido anual: R$ %.2f%n", netSalary);

        sc.close();
    }
}
