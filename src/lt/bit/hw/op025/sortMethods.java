package lt.bit.hw.op025;

import java.util.Arrays;

public class sortMethods {
    int[] myArray = new int[10001];

    public void generateArray() {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 777);
        }
        System.out.println("The array of 10001 before sorting: " + Arrays.toString(myArray));
    }

    public void bubbleSort() {
        int size = myArray.length;
        int temp = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < (size - i); j++) {
                if (myArray[j - 1] > myArray[j]) {
                    temp = myArray[j - 1];
                    myArray[j - 1] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        System.out.println("Sorting by method bubbleSort:      " + (Arrays.toString(myArray)));
    }

    public void insertionSort() {
        int i, yPosition, j;
        for (i = 1; i < myArray.length; i++) {
            yPosition = myArray[i];
            j = i - 1;

            while (j >= 0 && myArray[j] > yPosition) {
                myArray[j + 1] = myArray[j];
                j = j - 1;
            }
            myArray[j + 1] = yPosition;
        }
        System.out.println("Sorting by method insertionSort:   " + (Arrays.toString(myArray)));
    }

    public void sortArray() {
        Arrays.sort(myArray);
        System.out.println("Sorting by method of Arrays class: " + (Arrays.toString(myArray)));
    }
}
