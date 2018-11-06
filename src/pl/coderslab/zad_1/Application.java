package pl.coderslab.zad_1;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GuessNumber.play(scanner);
        scanner.close();

    }
}
