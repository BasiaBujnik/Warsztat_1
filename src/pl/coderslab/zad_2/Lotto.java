package pl.coderslab.zad_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Lotto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        lotto(scanner);
        scanner.close();

    }

    private static void lotto(Scanner scanner) {

        Integer[] arr = new	Integer[49];
        for	(int i = 0;	i <	arr.length;	i++)	{
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr)); // tablica liczb od 1 do 49
        Collections.shuffle(Arrays.asList(arr));  // miesza liczby
        System.out.println(Arrays.toString(arr)); // tablica z pomieszanymi liczbami

        // trzeba wylosować 6, które potem porównać z wyboranymi przez użytkownika
        Random rand = new Random();
        int tabRand []= new int [6];
        for (int j=0; j<tabRand.length; j++) {
            tabRand [j] = rand.nextInt(49);
        }
        System.out.println(Arrays.toString(tabRand)); // ??

        while (true) {
            System.out.println("Wytypuj pierwszą liczbę z zakresu 1-49 do losowania Lotto: ");

        }
        int choice = scanner.nextInt();
        if (choice >= 1 && choice <= 49) {
            // tu instrukcje na sprawdzenie czy podana liczba się nie powtórzyła

        } else {
            System.out.println("Podałeś liczbe nie z zakresu 1-49. Spróbuj ponownie");
        }



    }
}
