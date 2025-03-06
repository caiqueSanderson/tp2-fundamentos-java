package exercicio10;

// Jogo de adivinhação

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int randomNumber = rand.nextInt(100) + 1;

        System.out.println("Jogo da adivinhação!");
        System.out.println("Tente adivinhar um número entre 1 e 100");

        boolean isRight = false;

        while (!isRight){
            System.out.println("Insira seu palpite: ");
            int guess = sc.nextInt();

            if (guess <= 1 || guess >= 100) {
                System.out.println("Número fora do intervalo! Escolha entre 1 e 100.");
                continue;
            }

            if (randomNumber == guess){
                System.out.println("Parabéns! Você acertou o número! O número é " + randomNumber + "!");
                isRight = true;
            }else{
                if (guess > randomNumber){
                    System.out.println("O palpite foi alto! Insira um número menor que " + guess);
                }else{
                    System.out.println("O palpite foi baixo! Insira um número maior que " + guess);
                }
            }
        }

    }
}
