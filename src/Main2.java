import com.sun.source.util.SourcePositions;

import java.sql.SQLOutput;

public class Main2 {
    static int memberVariable = 3;


    public static void main(String[] args) {

        double result = sum(memberVariable, 3.2);
        System.out.println(result * 2);
        System.out.println("Rezultatul este: " + sum(3, 5));

        int result2 = substract(5,4);
        System.out.println(result2);

        System.out.println(result - result2);

        int result3 = multiplication(4,4);
        System.out.println("Rezultatul inmultirii este" + (result3));

        int result4 = division(100,2);
        System.out.println("Rezultatul impartirii este" + (result4));


    }

    public static double sum(int firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int substract(int firstNumber, int secondNumber){
        int result = firstNumber - secondNumber;
        return result;
    }
    public static int multiplication(int firstNumber, int secondNumber){
        int result = firstNumber * secondNumber;
        return result;
    }
    public static int division(int firstNumber, int secondNumber){
        int result = firstNumber / secondNumber;
        return result;
    }



}
