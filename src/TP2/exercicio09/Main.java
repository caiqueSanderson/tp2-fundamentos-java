package TP2.exercicio09;

// Validador de Senha

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("-- Validador de senha --");
        System.out.print("Cadastre uma senha: ");
        String password = sc.nextLine();
        System.out.println("Senha cadastrada!");

        boolean isValid = false;

        while (isValid == false){
            System.out.print("Repita sua senha: ");
            String repeatPassword = sc.nextLine();

            if (password.equals(repeatPassword)){
                System.out.println("Senha validada!");
                isValid = true;
            }else{
                System.out.println("Senha inválida!");
            }
        }

        sc.close();

    }
}
