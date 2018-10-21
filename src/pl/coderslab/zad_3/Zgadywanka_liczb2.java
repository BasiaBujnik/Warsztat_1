package pl.coderslab.zad_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zgadywanka_liczb2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        myGuess(scanner);
        scanner.close();
    }

    private static void myGuess(Scanner scanner) {
        int min = 0;
        int max = 1000;
        int counter = 0;
        System.out.println("Pomyśl liczbę od "+min+" do "+max+", a ja ją zgadnę w maksymalnie 10 próbach");


        while (true) {
            int guess = ((max-min)/2)+min;
            System.out.println("Zgaduję "+guess);
            counter ++;
            System.out.println("Za mało? (wybierz 1),   Za dużo? (wybierz 2),    Trafiłam? (wybierz 3)");

            try {
                int userChoise = scanner.nextInt();

                if (userChoise == 1) {
                    System.out.println("Za mało");
                    min = guess;
                } else if (userChoise == 2) {
                    System.out.println("Za dużo");
                    max = guess;
                } else if (userChoise == 3) {
                    System.out.println("Wygrałam!");
                    break;
                } else {
                    System.out.println("Nie oszukuj!");
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Wybierz 1, 2 lub 3");
                break;
            }
        }
    }
        //counter++;
        //System.out.println("Odgadłam liczbę po "+counter+" próbach.");


}

