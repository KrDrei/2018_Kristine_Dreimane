package lv.javaguru.lesson2;

public class PlayWithIfStatements {

    public static void main(String[] args) {

        boolean isBlack = true;
        int appleCount = 5;
        int peachCount = 6;

//        if (isBlack) {
//            System.out.println("Is black");
//        } else {
//            System.out.println("Is NOT black");
//        }
//
//
//        if (appleCount > peachCount) {
//            System.out.println("There are more apples");
//        } else {
//            System.out.println("There are more peaches");
//        }

//        if (!isBlack)
//            System.out.println("Is black");
//
//        if (appleCount > peachCount)
//            System.out.println("There are more apples");

        playWithIfElseIf(5, 6);
        playWithIfElseIf(6, 5);
        playWithIfElseIf(5, 5);
        playWithIfElseIf(10, 10);

        int VAT = calculateVAT(2018);
        System.out.println("VAT: " + VAT);
        System.out.println("Compact VAT: " + calculateVATCompact(2018));
    }

    private static int calculateVATCompact(int year) {
        return year > 2009 ? 21 : 18;
    }

    private static int calculateVAT(int year) {
        if (year > 2009) {
            return 21;
        } else {
            return 18;
        }
    }

    private static void playWithIfElseIf(int appleCount, int peachCount) {

        if (appleCount > peachCount) {
            System.out.println("There are more apples");
        } else if (appleCount < peachCount) {
            System.out.println("There are more peaches");
        } else if (appleCount == 5) {
            System.out.println("There are five apples");
        } else {
            System.out.println("Apples and peaches count is the same");
        }

    }

}
