package lv.javaguru.lesson1;

import java.util.Scanner;

public class TriangleAreaCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter triangle height");
        double height = scanner.nextDouble();

        System.out.println("Please enter triangle width");
        double width = scanner.nextDouble();

        double area = area(height, width);
        System.out.println("Triangle are is: " + area);
    }

    private static double area(double height, double width) {
        return height * width / 2;
    }

}
