import com.sun.source.util.SourcePositions;

import java.sql.SQLOutput;

public class Main2 {
    static int memberVariable = 3;


    public static void main(String[] args) {

//        double result = sum(memberVariable, 3.2);
//        System.out.println(result * 2);
//        System.out.println("Rezultatul este: " + sum(3, 5));
//
//        int result2 = substract(5,4);
//        System.out.println(result2);
//
//        System.out.println(result - result2);
//
//        int result3 = multiplication(4,4);
//        System.out.println("Rezultatul inmultirii este " + (result3));
//
//        int result4 = division(100,2);
//        System.out.println("Rezultatul impartirii este " + (result4));

       //aici afisez numele meu
        System.out.println("This is my name: " + printMyName());

        //aici afisez calcul 1
        System.out.println("Calcul 1: " + mathOperation(-5,8,6));

        //aici afisez calcul 2
        System.out.println("Restul impartitii este:  " + mathOperation2(55,9,9));

        //aici afisez calcul 3
        System.out.println("Calcul 3: " + mathOperation3(20,-3,5,8));

        //aici afisez calcul 4
        System.out.println("Calcul 4: "+ mathOperation4(5,15,3,2,-8,3));

        System.out.println("    J    a   v      v   a");
        System.out.println("    J   a a   v    v   a a ");
        System.out.println("J   J  aaaaa   v  v   aaaaa");
        System.out.println(" JJ   a     a    v   a     a");

        System.out.println("  +\"\"\"\"\"+ ");
        System.out.println("[ | O O | ]");
        System.out.println("  |  ^  | ");
        System.out.println("  | `-` | ");
        System.out.println("  +-----+ ");

        //aici afisez Temperatura
        System.out.println("Temperature in C is: " + convertFahrenheitToCelsius(70));

        //aici afisez Distanta in Metri
        System.out.println("Lenght from inch to meter is: " + convertInchToMeter(52));

        //calcul speed
        speedCalculator(5000, 1,30,1);

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
    public static String printMyName (){
        String myName = "Lavinia";
        return myName;
    }
    public static int mathOperation (int a, int b, int c){
        return (a + b * c);
    }

    public static int mathOperation2 (int a, int b, int c){
        return ((a + b) % c);
    }

    public static int mathOperation3 (int a, int b, int c, int d){
        return (a + b * c / d);
    }

    public static int mathOperation4 (int a, int b, int c, int d, int e, int f){
        return (a + b / c * d - e % f);
    }

    public static double convertFahrenheitToCelsius (double fahrenheitTemp){
        return ((double)5/9 * (fahrenheitTemp - 32));
    }

    public static double convertInchToMeter (double lenghtInInch){
        return (0.0254 * lenghtInInch);
    }

    public static void speedCalculator (int distanceInMeter, int hours, int minutes, int seconds){
        int timeInSec;

        timeInSec = hours * 3600 + minutes * 60 + seconds;
        System.out.println("Speed in m / s " + ((double)distanceInMeter/timeInSec));
        System.out.println("Speed in km / h " + (((double)distanceInMeter/1000)/((double)timeInSec/3600)));
        System.out.println("Speed in mile / h " + (((double)distanceInMeter/1609)/((double)timeInSec/3600)));
        }



}
