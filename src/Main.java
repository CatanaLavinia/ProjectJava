public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world");
        System.out.println("Hello\nLavinia");

        //pct 2 de la tema - Lab 9
        int var1=2;
        int var2=5;
        System.out.println("Rezultatul sumei a doua numere este: " + (var1+var2));

        //pct 3 de la tema - Lab 9
        double var3=10;
        double var4=3;
        double rezImpartirii;
        rezImpartirii = var3/var4;
        System.out.println("Rezultatul impartirii este (mod 1): " + (var3/var4));
        System.out.println("Rezultatul impartirii este (mod 2): " + rezImpartirii);

        //pct 4 de la tema - Lab 9 - Rezultat calcule
        System.out.println("calcul a: " + (-5 + 8 * 6));
        System.out.println("calcul b - restul impartirii: " + ((55+9) % 9));
        System.out.println("calcul c: " + (20 + -3*5 / 8));
        System.out.println("calcul d: " + (5 + 15 / 3 * 2 - 8 % 3));
    }
}
