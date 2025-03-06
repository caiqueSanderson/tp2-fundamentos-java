package exercicio12;

// Contagem de palavras

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Contador de palavras");
        System.out.print("Insira a frase que você deseja contar: ");
        String phrase = sc.nextLine().trim();

        if (phrase.isEmpty()){
            System.out.println("A frase está vazia!");
        }else {
            String[] words = phrase.split("\\s+");

            int wordCount = 0;
            for (int i = 0; i < words.length; i++){
                wordCount++;
            }

            System.out.println("Número de palavras que a frase contém: " + wordCount);
        }

    }
}
