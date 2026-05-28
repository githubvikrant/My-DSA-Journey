package src.main.java.Array;

// import java.util.*;
// import java.util.stream.*;
import java.util.Arrays;

class ArrayStream {
    public static void main(String[] args) {

        // create a String array
        // String[] arr = { "Geeks", "for", "Geeks" };

        // Get the Array
        int intArr[] = { 10, 20, 15, 22, 35 };
        
        // Calling method from Geeks class
        Geeks.runIt(intArr);

        // Optional: convert string array into stream
        // Stream<String> st = Arrays.stream(arr);
        // st.forEach(s -> System.out.print(s + " "));
    }
}

// Removed 'public' so it can live in the same file
class Geeks {
    public static void runIt(int intArr[]) {
        // To get the Stream from the array
        System.out.println("Integer Array: " + Arrays.toString(intArr));
    }
}

