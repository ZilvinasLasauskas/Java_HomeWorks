package lt.bit.hw;
/*
Parašykite programą, kuri rušiuoja String tipo masyvą.
 */

import java.util.Arrays;

public class op020 {
    public static void main(String args[]) {
        String[] myArray = {"Mazda", "Opel", "BMW", "_Mazda", "Toyota", "KIA", "Mercedes", "ZAZ", "_Mazda_",
                "VW", "Dacia", "Opel22", "Rover", "merCEdes", "MazDa", "Crysler", "BMW-7"};
        int size = myArray.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (myArray[i].compareTo(myArray[j]) > 0) {
                    String temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(myArray));

        // sort the array, using the sort method of the Arrays class
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}

