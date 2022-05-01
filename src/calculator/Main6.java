package calculator;

import java.util.List;

public class Main6 {

    public static void main(String[] args) {

        //ex.2 Scrieti o metoda Java, care sa primeasca doi parametrii:
        // un parametru sa fie o lista de numere, si celalalt un numar
        // (real sau intreg). Metoda sa adauge numarul primit ca si parametru la final de lista.

//        LogicalOperations op = new LogicalOperations();
//        List<Integer> myList = op.createListFromGivenNumber(30);
//        op.addNewElementToList(myList, 65);

        //ex.4 Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand,
        // toate valorile din lista, dar invers(de la capat la inceput).

//        LogicalOperations op = new LogicalOperations();
//        List<Integer> myList = op.createListFromGivenNumber(20);
//        op.displayListReverseOrder(myList);

        //ex.5 Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri,
        // unul de tip intreg, si unul de tip String. Metoda sa adauge parametrul de tip String in lista primita,
        // iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.

//        LogicalOperations op = new LogicalOperations();
//        List<String> myStringList = op.createListOfStrings(25);
//        op.replaceListElement(myStringList,10,"elev nou");

        //ex.6 Scrieti o metoda Java, care sa primeasca doi parametrii. Primul dintre ei va fi o Lista, iar metoda sa ia
        // al doilea parametru si sa il adauge pe prima pozitie din lista.
//        LogicalOperations op = new LogicalOperations();
//        List<Integer> myList = op.createListFromGivenNumber(10);
//        op.addElementonFirstPosition(myList, 55);

        //ex.7 Scrieti o metoda Java care sa primeasca parametru o Lista, si sa afiseze ce valori are lista, si ce pe ce pozitie.
        // (Ex: “Pe pozitia 1 valoare este 4”).
//        LogicalOperations op = new LogicalOperations();
//        List<Integer> myList = op.createListFromGivenNumber(5);
//        op.printPositionElementInList(myList);

        //ex.8 Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.
        LogicalOperations op = new LogicalOperations();
        List<Integer> myList = op.createListFromGivenNumber(10);
        myList.add(3,78); // Add new element, for extra validatio
        System.out.println(op.printBiggestNumber(myList));
    }
}
