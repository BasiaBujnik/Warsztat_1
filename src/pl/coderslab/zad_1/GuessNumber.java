package pl.coderslab.zad_1;


import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        play(scanner);
//        scanner.close();
//
//    }

    protected static void play (Scanner scanner) {
        // komputer losuje liczbę z zakresu 1-100:
        int number = 1;
        Random random = new Random();
        number = random.nextInt(101);

        System.out.println("Witaj w grze! Komputer losuje liczbę z zakresu 1-100. Zgadnij tę liczbę:");

        while (true) {
            while (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("To nie jest liczba. Spróbuj jeszcze raz!");
            }
            int guess = scanner.nextInt();
            int min = 1;
            int max = 100;

            if (guess >= min && guess <= max) {
                if (guess < number) {
                    System.out.println("Za mało! Spróbuj jeszcze raz:");
                } else if (guess > number) {
                    System.out.println("Za dużo! Spróbuj jeszcze raz:");
                } else {
                    System.out.println("Zgadłeś!!!");
                }
            } else {
                System.out.println("Liczba spoza zakresu 1-100");
                break;
            }
        }
    }
}

