package calculator;

public class Main5 {
    public static void main(String[] args) {
        LogicalOperations op = new LogicalOperations();
        int[] myArray = op.populateArrayToNumber(100);

//        op.printArray(myArray);
        //ex. 4- Lab. 13
        int[] testArray = {12,3,6765,123,6,856};
        int sum = myArray[0];
        sum = sum + myArray[1];
        sum = sum + myArray[2];
        sum = sum + myArray[3];
        sum = sum + myArray[4];

//        System.out.println(op.getAverageFromArray(myArray));
//        System.out.println(op.getAverageFromArray(testArray));
        //Even Numer - pct. 3
//        int[] evenArray = new int[50];
//        op.populateArrayEvenNumber(evenArray);
//        op.printArray(evenArray);

        //ex. 5 si 6 Lab. 13Creati o metoda care sa primeasca un parametru de tip array de string-uri,
        // populat cu valori, si un parametru de tip String. Metoda sa verifice daca valoarea string-ului
        // primit se regaseste in array-ul primit, iar daca da sa returneze true iar daca nu, sa returneze false.
//        String[] stringArray = {"A","B","C","D"};
//        String checkString = "C";
//        System.out.println(op.verifyStringInArray(stringArray,checkString));

        //ex.7
//        String[] stringArray = new String[10];
//        op.populateStringArray("-", stringArray);
//        op.displayArrayOfGivenStrings(stringArray);

        //ex.8 Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru
        // de tip numar. Metoda sa verifice daca numarul exista in array, si daca da, sa returneze array-ul primit, fara acel numar.
//        int[] givenArray = {5,10,12,17,19,21,25,28,30};
//        int searchedNumber = 11;
//        op.displayArrayWithoutSearchedNumber(givenArray, searchedNumber);

        //ex.9 Creati o metoda care sa primeasca doi parametrii: un array populat cu valori, si un array gol. Metoda sa copieze toate
        // valorile din primul array, parcurgandu-l, in cel de-al doilea.
        int[] arrayA = {5,10,12,17,19,21,25,28,30};
        int[] arrayB = new int[arrayA.length];
        op.printArray(op.copyArrayToArray(arrayA,arrayB));
    }

}
