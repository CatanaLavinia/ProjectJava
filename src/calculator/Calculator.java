package calculator;

public class Calculator {

    public double sum(int firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public int substract(int firstNumber, int secondNumber){
        int result = firstNumber - secondNumber;
        return result;
    }
    public int multiplication(int firstNumber, int secondNumber){
        int result = firstNumber * secondNumber;
        return result;
    }
    public int division(int firstNumber, int secondNumber){
        int result = firstNumber / secondNumber;
        return result;
    }
    public  String printMyName (){
        String myName = "Lavinia";
        return myName;
    }
    public int mathOperation (int a, int b, int c){
        return (a + b * c);
    }

    public  int mathOperation2 (int a, int b, int c){
        return ((a + b) % c);
    }

    public static int mathOperation3 (int a, int b, int c, int d){
        return (a + b * c / d);
    }

    public  int mathOperation4 (int a, int b, int c, int d, int e, int f){
        return (a + b / c * d - e % f);
    }

    public double convertFahrenheitToCelsius (double fahrenheitTemp){
        return ((double)5/9 * (fahrenheitTemp - 32));
    }

    public double convertInchToMeter (double lenghtInInch){
        return (0.0254 * lenghtInInch);
    }

    public void speedCalculator (int distanceInMeter, int hours, int minutes, int seconds){
        int timeInSec;

        timeInSec = hours * 3600 + minutes * 60 + seconds;
        System.out.println("Speed in m / s " + ((double)distanceInMeter/timeInSec));
        System.out.println("Speed in km / h " + (((double)distanceInMeter/1000)/((double)timeInSec/3600)));
        System.out.println("Speed in mile / h " + (((double)distanceInMeter/1609)/((double)timeInSec/3600)));
    }

    public int squareNumber (int number){
        return number * number;
    }
}
