package calculator;

public class LogicalOperations {

    public int getMax(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public String verifyTextFastTrack(String text) {
        if (text.equals("FastTrack")) {
            return "learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    public String verifyTextAndNumber(String text, int number) {
        if (text.equals("FastTrack") && number <= 3) {
            return text + number;
        } else if (!text.equals("FastTrack") && number >= 4) {
            return number + text;
        } else {
            return "";
        }
    }

    public int verifyNumber(int number) {
        if (number >= 2 && number <= 8) {
            return number;
        } else {
            return -1;
        }
    }

    public String verifyNumber2(int number2) {
        if (number2 > 8 || number2 == 6) {
            return "The amount of snow this winter was(cm):";
        } else {
            return "The forecast snow is(cm):";
        }
    }

    public String verifyNumber3(int number) {
        if (number > 3 && number != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (number == 4) {
            return "The number is equal to 4";
        } else if (number < 3) {
            return "The number is lower than 3";
        } else {
            return "";
        }
    }

    public void displayNumberPressed(int readNumber) {
        switch (readNumber) {
            case 0:
                System.out.println("you pressed 0");
                break;
            case 1:
                System.out.println("you pressed 1");
                break;
            case 2:
                System.out.println("you pressed 2");
                break;
            case 3:
                System.out.println("you pressed 3");
                break;
            case 4:
                System.out.println("you pressed 4");
                break;
            case 5:
                System.out.println("you pressed 5");
                break;
            case 6:
                System.out.println("you pressed 6");
                break;
            case 7:
                System.out.println("you pressed 7");
                break;
            case 8:
                System.out.println("you pressed 8");
                break;
            case 9:
                System.out.println("you pressed 9");
                break;
            default:
                System.out.println("Not allowed");
        }
    }

    public String verifyEvenNumber(int readNumber) {
        if (readNumber % 2 == 0) {
            return readNumber + " is an even number";
        } else {
            return readNumber + " is not an even number";
        }
    }

    public String verifyIfPersonIsEligibleForVote(int age) {
        if (age >= 18) {
            return "This person is eligible to vote";
        } else {
            return "This person isn`t eligible to vote";
        }
    }

    public int returnBiggestNumber(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber >= secondNumber) {
            if (firstNumber >= thirdNumber) {
                return firstNumber;
            } else {
                return thirdNumber;
            }
        } else if (secondNumber >= thirdNumber) {
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }

    public void displayNumbersFromGivenNumbersTo100(int givenNumber) {
        if (givenNumber <= 100) {
            for (int i = givenNumber; i <= 100; i++)
                System.out.println(i);
        }
    }


    public void displayNumbersFromGivenNumbers2ToNeg100(int givenNumber2) {
        if (givenNumber2 >= -100) {
            for (int i = givenNumber2; i >= -100; i--)
                System.out.println(i);
        }
    }

    public void firstNumberToSecondNumber(int first, int second) {
        for (int i = first; i <= second; i++) {
            System.out.println(i);
        }
    }

    public void lowerToHigher(int first, int second) {
        if (first < second) {
            for (int i = first; i <= second; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = second; i <= first; i++) {
                System.out.println(i);
            }
        }
    }

    public void biggestToSmallest(int biggest, int smallest) {
        for (int i = biggest; i >= smallest; i--) {
            System.out.println(i);
        }
    }

    public void displayEvenNumbers(int x, int y) {
        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void displayOddNumbers(int x, int y) {
        for (int i = x; i <= y; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public int sumOfConsecutiveNumbers(int x) {
        int sum = 0;
        for (int i = x; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public double averageOfConsecutiveNumbers(int x) {
        double sum = 0;
        int counter = 0;
        double average;
        for (int i = x; i <= 100; i++) {
            sum = sum + i;
            counter++;
        }
        return sum / counter;
    }

    public void displayModel(int numberOfSymbols) {
        int localNumberOfSymbols = numberOfSymbols;
        for (int i = 1; i <= numberOfSymbols; i++) {
            for (int j = 1; j <= localNumberOfSymbols; j++) {
                System.out.print("*");
            }
            System.out.println("");
            localNumberOfSymbols--;
        }
    }

    public void displayNumbersFromGivenNumbersTo100WithWhileLoop(int givenNumber) {
        int i = givenNumber;
        if (i <= 100) {
            while (i <= 100) {
                System.out.println(i);
                i++;
            }
        }
    }

    public void displayNumbersFromGivenNumbersToNeg100WithWhileLoop(int givenNumber) {
        int i = givenNumber;
        if (i >= -100) {
            while (i >= -100) {
                System.out.println(i);
                i--;
            }
        }
    }

    public void firstNumberToSecondNumberWithWhileLoop(int first, int second) {
        while (first <= second) {
            System.out.println(first);
            first++;
        }
    }

    public void lowerToHigherWithWhileLoop(int first, int second) {
        if (first < second) {
            while (first <= second) {
                System.out.println(first);
                first++;
            }
        } else {
            while (first >= second) {
                System.out.println(second);
                second++;
            }
        }
    }

    public void displayEvenNumbersWithWhileLoop(int x, int y) {
        while (x <= y) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
            x++;
        }
    }

    public void displayOddNumbersWithWhileLoop(int x, int y) {
        while (x <= y) {
            if (x % 2 != 0) {
                System.out.println(x);
            }
            x++;
        }
    }

    public void sumAndAverageForGivenInterval(int x, int y) {
        int sum = 0;
        int counter = 0;
        double average;
        while (x <= y) {
            sum = sum + x;
            counter++;
            x++;
        }
        average = (float) sum / counter;
        System.out.println("Suma este: " + sum);
        System.out.println("Media este: " + average);
    }

    public double displayAverageForNumbersDivisibleBy7(int x, int y) {
        int sum = 0;
        int counter = 0;
        double average = 0;
        while (x <= y) {
            if (x % 7 == 0) {
                sum = sum + x;
                counter++;
            }
            x++;
        }
        average = (float) sum / counter;
        return average;
    }

    public int[] populateArrayToNumber(int max) {
        int[] myArray = new int[max];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        }
        return myArray;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public double sumOfArray(int[] array) {
        float sumArray = array[0];
        for (int i = 1; i < array.length; i++) {
            sumArray = sumArray + array[i];
        }
        return sumArray;
    }

    public double getAverageFromArray(int[] array) {
        return sumOfArray(array) / array.length;
    }

    public void populateArrayEvenNumber(int[] array) {
        int pos = 0;
        for (int i = 1; i <= array.length * 2; i++) {
            if (i % 2 == 0) {
                array[pos] = i;
                pos++;
            }
        }
    }

    public boolean verifyStringInArray (String[] array, String givenString){
        for (int i = 0; i < array.length; i++){
            if (givenString == array[i]){
                System.out.println("pozitia stringului gasit este: " + i);
                return true;
            }
        }
        return false;
    }

    public String[] populateStringArray (String givenString, String[] arrayString){
        for (int i = 0; i <arrayString.length; i++){
            arrayString [i] = "-";
            }
        return arrayString;
    }

    public void displayArrayOfGivenStrings (String[] expectedArray){
        for (int i = 1; i <= expectedArray.length; i++){
            for (int j = 0; j < expectedArray.length; j++){
                System.out.print(expectedArray[j]);
            }
            System.out.println();
        }
    }

    public void displayArrayWithoutSearchedNumber (int[] givenArray, int searchedNumber){
        for (int i=0; i< givenArray.length; i++){
            if (searchedNumber != givenArray[i]){
                System.out.print(givenArray[i] + " ");
            }
        }
    }

    public int[] copyArrayToArray (int[] inputArray, int[] outputArray){
        for (int i=0; i< inputArray.length; i++){
            outputArray[i] = inputArray[i];
        }
        return outputArray;
    }

}
