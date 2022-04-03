package calculator;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        LogicalOperations logOperations = new LogicalOperations();

        Calculator calc = new Calculator();

//        System.out.println(logOperations.getMax(12,41));
//        System.out.println(logOperations.verifyTextFastTrack("FastTrack"));


//        String text = "FastTrack";
//        int number = 6;

//        System.out.println(logOperations.verifyTextAndNumber(text,number));

        // Lab 11 pct 3
//        System.out.println(logOperations.verifyNumber(number));

        // Lab 11 pct 5
//          System.out.println(logOperations.verifyNumber2(7));

        // Lab 11 pct 6
//        System.out.println(logOperations.verifyNumber3(2));

        // Lab 11 pct 7
        // Displaying the number
//        System.out.println("The number entered by user: "+ getNumberFromKeyboard());

//        logOperations.displayNumberPressed(getNumberFromKeyboard());

        // Lab 11 pct 8
//        System.out.println(logOperations.verifyEvenNumber(getNumberFromKeyboard()));

        // Lab 11 pct 9
//        System.out.println(logOperations.verifyIfPersonIsEligibleForVote(getNumberFromKeyboard()));

        // Lab 11 pct 10
//        System.out.println(logOperations.returnBiggestNumber(87,87,7));

        // Lab 11 pct. 11
//        System.out.println("Squared number is: " + calc.squareNumber(getNumberFromKeyboard()));

    }
    public static int getNumberFromKeyboard () {

        Scanner scan = new Scanner(System.in);

        System.out.print("Give me a number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        return num;
    }

}

