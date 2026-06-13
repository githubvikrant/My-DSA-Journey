package src.main.java;
import java.util.Scanner;

public class ScannerExample {
    // Taking multiple user input using Scanner Class


    public static void main(String[] args)
    {
        // Scanner definition
        Scanner scn = new Scanner(System.in);

        // input is a string(one word)
        System.out.print("Enter a word: ");
        String str1 = scn.nextLine();
        System.out.println("Entered String str1: " + str1);

        // input is a string(complete sentence)
        System.out.print("Enter a sentence: ");
        String str2 = scn.nextLine();
        System.out.println("Entered String str2: " + str2);

        // input is an integer
        System.out.print("Enter an integer: ");
        int x = Integer.parseInt(scn.nextLine());
        System.out.println("Entered Integer: " + x);

        // input is a float value
        System.out.print("Enter a float value: ");
        float f = Float.parseFloat(scn.nextLine());
        System.out.println("Entered FloatValue: " + f);

        scn.close();
    }
}
