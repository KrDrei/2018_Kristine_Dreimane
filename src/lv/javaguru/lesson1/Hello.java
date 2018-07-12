package lv.javaguru.lesson1;

public class Hello {


    public static void main(String[] args) {
        playWithArithmeticOperators();
        playWithPrimitiveTypes();
        playWithUnaryOperators();

        trickyUnaryOperations();
    }

    private static void trickyUnaryOperations() {
        int hundred = 100;
        int number2, number3;

        number2 = ++hundred; //hundred = 101; number2 = 101
        number3 = number2++ + ++hundred; // don't do this

        System.out.println("hundred: " + hundred);
        System.out.println("number2: " + number2);
        System.out.println("number3: " + number3);
    }

    private static void playWithUnaryOperators() {
        int number = 5;
        System.out.println(number);
        number++;
        System.out.println(number);
        ++number;
        System.out.println(number);
    }

    private static void playWithPrimitiveTypes() {
        int someNumber = 12;
        System.out.println("Hello");
        System.out.println(someNumber);

        byte smallArgument = 100;
        System.out.println((byte)200);

        double myDouble = 4.9;
        float myFloat = 2.9f;

        float myDouble2;
        int iNt = 5;

        System.out.println(iNt);

        boolean hasValue = true;
        System.out.println(!hasValue);

        char namesFirstLetter = 'm';
        System.out.println(namesFirstLetter);
        System.out.println((int)namesFirstLetter);
        System.out.println((char)77);
    }

    private static void playWithArithmeticOperators() {
        int firstNumber, secondNumber, result;

        firstNumber = 5;
        secondNumber = 8;

        result = firstNumber + secondNumber;
        System.out.println(result);

        System.out.println(10%3);
    }

}
