import calculator.Calculator;
import com.sun.source.util.SourcePositions;

import java.sql.SQLOutput;

public class Main2 {
    static int memberVariable = 3;


    public static void main(String[] args) {

        Calculator calc = new Calculator();

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
        System.out.println("This is my name: " + calc.printMyName());

        //aici afisez calcul 1
        System.out.println("Calcul 1: " + calc.mathOperation(-5,8,6));

        //aici afisez calcul 2
        System.out.println("Restul impartitii este:  " + calc.mathOperation2(55,9,9));

        //aici afisez calcul 3
        System.out.println("Calcul 3: " + calc.mathOperation3(20,-3,5,8));

        //aici afisez calcul 4
        System.out.println("Calcul 4: "+ calc.mathOperation4(5,15,3,2,-8,3));

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
        System.out.println("Temperature in C is: " + calc.convertFahrenheitToCelsius(70));

        //aici afisez Distanta in Metri
        System.out.println("Lenght from inch to meter is: " + calc.convertInchToMeter(52));

        //calcul speed
        calc.speedCalculator(5000, 1,30,1);

    }





}
