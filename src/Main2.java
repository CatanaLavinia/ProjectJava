public class Main2 {
    public static void main(String[] args) {

        double result = sum(2, 3);
        System.out.println(result * 2);
        System.out.println("Rezultatul este: " + sum(3, 5));

    }

    public static double sum(int firstNumber, double secondNumber) {
        double x = firstNumber + secondNumber;
        return x;

    }



}
