package pl.coderslab.zad_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Lotto {

    // zadanie nieskończone

    public static void lotto() {
        Scanner scanner = new Scanner(System.in);


        int min = 1;
        int max = 49;
        int amountNumbersToCompare = 6;

        Integer[] arr = new Integer[max];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        // System.out.println(Arrays.toString(arr)); // tablica liczb od 1 do 49
        Collections.shuffle(Arrays.asList(arr));  // miesza liczby
        // System.out.println(Arrays.toString(arr)); // tablica z pomieszanymi liczbami

        // trzeba wylosować 6, które potem porównać z wyboranymi przez użytkownika (amountNumberToCompare)
        Random rand = new Random();
        int tabRand[] = new int[amountNumbersToCompare];
        for (int j = 0; j < tabRand.length; j++) {
            tabRand[j] = rand.nextInt(max+1) + min; // randomowe liczby z zakresu 1-49 (max=49)
        }
        // System.out.println(Arrays.toString(tabRand)); // tablica wylosowanych 6 liczb


        System.out.println("Witaj w losowaniu Lotto. Musisz wytypować "+amountNumbersToCompare+" liczb");
        System.out.println("Wytypuj liczby z zakresu "+min+" - "+max+" do losowania: ");
        getNumber(scanner);

//
//        System.out.println("Dziękujemy! Sprawdźmy czy wygrana jest Twoja");

        scanner.close();

        // spr czy 3,4,5,6 podanych liczb jest takich samych jak wylosowane, true -> wygrana

    }

    // metoda na pobranie liczb od użytkownika
    public static void getNumber(Scanner scanner) {

        int min = 1;
        int max = 49;

        int amountNumbersToCompare = 6;

        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Musisz podać liczbę. Spróbuj jeszcze raz!");
        }

        int choice = scanner.nextInt();
        if (choice < min && choice > max) {
            System.out.println("Podałeś liczbe spoza zakresu "+min+" - "+max+". Spróbuj ponownie");
        } else {
            // tu instrukcje na sprawdzenie czy podana liczba się nie powtórzyła
            // podane przez uzytkownika liczby zapisane do tabeli
            for (int i = 0; i < amountNumbersToCompare; i++) {
                int [] choiceTab = new int[amountNumbersToCompare];

/*
pomyśleć nad tym, nie tak
                    if (choice != choiceTab[i]) {
                    choiceTab [i] = scanner.nextInt();
                    scanner.nextLine();
                }
                System.out.println(Arrays.toString(choiceTab));
*/
            }
        }

    }


}
