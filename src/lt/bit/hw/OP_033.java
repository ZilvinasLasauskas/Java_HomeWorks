package lt.bit.hw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class OP_033 {

    public static void main(String[] args) throws Exception {

        BufferedReader bufread = null;
        try {
            bufread = new BufferedReader(new FileReader("input.txt"));
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        System.out.println("Enter the string you search:");
        Scanner scan = new Scanner(System.in);
        String Word = scan.next();
        int count = 0;

        String line = bufread.readLine();
        String str[];
        do {
            str = line.split(" ");
            for (String abc : str) {
                if (abc.equals(Word))
                    count++;
            }

            line = bufread.readLine();

        } while (line != null);
        System.out.println("Number of the cases = " + count);
    }
}
