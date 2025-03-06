package exercicio04;

// Calculadora de Idade em Dias

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de Idade");
        System.out.println("Insira o dia de nascimento: ");
        int day = sc.nextInt();

        System.out.println("Insira o mês de nascimento: ");
        int month = sc.nextInt();

        System.out.println("Insira o ano de nascimento: ");
        int year = sc.nextInt();

        LocalDate dateNow = LocalDate.now();
        LocalDate birthdate = LocalDate.of(year,month,day);

        System.out.println(birthdate);

//        long ageInDays = ChronoUnit.DAYS.between(birthdate, dateNow);
        sc.close();
    }
}
