package lt.bit.hw;
/*Parašykite programą, kuri randa didžiausią String tipo masyvo elementą.
 */

public class op022 {
    public static void main(String[] args) {
        String[] myArray = {"Mazda", "Opel", "BMW", "_Mazda", "Toyota", "KIA", "Mercedes", "ZAZ", "_Mazda_",
                "VW", "Dacia", "Opel22", "--------Rover0000", "merCEdes", " ... ", "MazDgyftdrsea", "Crysler", "BMW-7"};

        String longestString = "";
        int maxLength = 0;

        for (int i = 0; myArray.length > i; i++){
            if (myArray[i].length() > maxLength) {
                maxLength = myArray[i].length();
                longestString = myArray[i];
            }
        }
        System.out.println(longestString);
    }
}