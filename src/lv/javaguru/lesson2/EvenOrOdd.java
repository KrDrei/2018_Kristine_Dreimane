package lv.javaguru.lesson2;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet veselu skaitli robežās no 1 līdz 100");
        int enteredNumber = scanner.nextInt();

        if (hasInInterval(enteredNumber)) {
            System.out.println(
                    "Ievadītais skaitlis ir "
                            + (isEven(enteredNumber) ? "pāra" : "nepāra"));
        } else {
            System.out.println("Slikts lietotājs :@");
        }

    }

    private static boolean hasInInterval(int enteredNumber) {
        return enteredNumber > 1 && enteredNumber < 100;
    }

    private static boolean isEven(long enteredNumber) {
        return enteredNumber % 2 == 0;
    }

}
