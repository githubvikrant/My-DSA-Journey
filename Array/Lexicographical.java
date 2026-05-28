package src.main.java.Array;

import java.util.Arrays;

public class Lexicographical {
    // Java program to demonstrate
// Arrays.compare() method



    public static void main(String[] args)
    {

        // Get the Array
        int intArr[] = { 10, 9, 15, 22, 35 };

        // Get the second Array
        int intArr1[] = { 10, -15, 22 };

        // To compare both arrays
        System.out.println("Integer Arrays on comparison: "
                           + Arrays.compareUnsigned(intArr, intArr1));
    }
}

