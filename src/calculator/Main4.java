package calculator;

public class Main4 {
    public static void main(String[] args) {

        LogicalOperations logicalOperations = new LogicalOperations();

        // ex.1 Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
        // Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100,
        // pornind de la numarul primit ca si parametru;
//        int givenNumber = 5;
//        logicalOperations.displayNumbersFromGivenNumbersTo100(givenNumber);

        // ex.2 Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
        // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100,
        // pornind de la numarul primit ca si parametru
//        int givenNumber2 = 10;
//        logicalOperations.displayNumbersFromGivenNumbers2ToNeg100(givenNumber2);

        //ex.3 Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
        // Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit,
        // pana la cel de-al doilea
//        int x= 10;
//        int y= 30;
//        logicalOperations.firstNumberToSecondNumber(x,y);

        //ex.4 Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar. Metoda trebuie
        // sa verifice care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel
        // mai mic la cel mai mare
//        int x = 5;
//        int y = 10;
//        logicalOperations.lowerToHigher(x,y);

        //ex.5 Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
//        int x= 1;
//        int y = 100;
//        logicalOperations.displayEvenNumbers(x,y);

        //ex.6 Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
//        int x=5;
//        int y=50;
//        logicalOperations.displayOddNumbers(x,y);

        //ex.7 Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
        // Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
        // iar la final sa returneze rezultatul.
//        int x=8;
//        System.out.println(logicalOperations.sumOfConsecutiveNumbers(x));


        //ex.8 Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
        // Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru, si sa calculeze media numerelor.
//        int x = 10;
//        System.out.println(logicalOperations.averageOfConsecutiveNumbers(x));


        // Creat o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:
        //*******
        //******
        //*****
        //****
        //***
        //**
        //*
//        int x = 7;
//        logicalOperations.displayModel(x);

        //Bucle while ex.1 Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru. Metoda sa verifice numrul primit,
        // si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru.
//        int x = 5;
//        logicalOperations.displayNumbersFromGivenNumbersTo100WithWhileLoop(x);

        //Bucle while ex.2. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru. Metoda sa verifice numrul primit,
        // si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru.
//        int x = 2;
//        logicalOperations.displayNumbersFromGivenNumbersToNeg100WithWhileLoop(x);

        //Bucle while ex.3 Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar. Metoda sa afiseze o numaratoare
        // intre cele doua numere primite, pornind de la primul parametru primit, pana la cel de-al doilea
//            int x = 4;
//            int y = 10;
//            logicalOperations.firstNumberToSecondNumberWithWhileLoop(x, y);

        //Bucle while ex.4 Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar. Metoda trebuie sa verifice
        // care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare
//            int x = 15;
//            int y = 10;
//            logicalOperations.lowerToHigherWithWhileLoop(x, y);

        //Bucle while ex.5 Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100
//        int x = 1;
//        int y = 100;
//        logicalOperations.displayEvenNumbersWithWhileLoop(x , y);

        //Bucle while ex.6 Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
//        int x = 1;
//        int y = 100;
//        logicalOperations.displayOddNumbersWithWhileLoop(x, y);

        //Bucle while ex.7 Creati o metoda care sa adune toate numerele din intervalul 111 si 8899. Sa se afiseze
        // suma totala, iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval. Introduceti
        // o variabila int count in metoda, pentru a numara toate numerele din interval.
//        logicalOperations.sumAndAverageForGivenInterval(111,8899);


        //Bucle while ex.8 Creati o metoda care sa primeasca doi parametrii de tip numar, si sa returneze media numerelor divizibile
        // cu 7, din acel interval. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
        System.out.println("Media este:" + logicalOperations.displayAverageForNumbersDivisibleBy7(1,49));

    }




}
