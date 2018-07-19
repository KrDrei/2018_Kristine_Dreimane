package lv.javaguru.lesson2;

import java.util.Scanner;

public class VowelChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet burtu");

        String character = scanner.next();
        char enteredChar = character.charAt(0);

        System.out.println("Ievadītais burts ir " + isVowel(enteredChar));
    }

    private static String isVowel(char enteredChar) {
        switch (enteredChar) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                return "patskanis";
            default:
                return "līdzskanis";
        }
    }

}
