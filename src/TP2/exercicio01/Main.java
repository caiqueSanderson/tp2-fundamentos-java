package TP2.exercicio01;

import java.util.Scanner;

// Cadastro de Usuário Completo

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira seu nome completo: ");
        String name = sc.nextLine();

        System.out.println("Insira sua idade: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Insira o nome de sua mãe: ");
        String nameMother = sc.nextLine();

        System.out.println("Insira o nome de seu pai: ");
        String nameFather = sc.nextLine();

        System.out.println("Dados do Usuário");
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        System.out.println("Nome da mãe: " + nameMother);
        System.out.println("Nome do pai: " + nameFather);

        if (name.length() > nameMother.length() && name.length() > nameFather.length()) {
            System.out.println("Seu nome é maior que o de seus pais");
        } else if (name.length() > nameMother.length()) {
            System.out.println("Seu nome é maior que o de sua mãe");
        } else if (name.length() > nameFather.length()) {
            System.out.println("Seu nome é maior que o de seu pai");
        } else {
            System.out.println("Seu nome é menor do que o de seus pais");
        }

        sc.close();
    }
}
