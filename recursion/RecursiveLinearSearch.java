import java.util.Scanner;

public class RecursiveLinearSearch {
    // Method to perform recursive linear search
    public static int linearSearch(int[] array, int index, int target) {
        // Base case: if index exceeds array length, target is not found
        if (index >= array.length) {
            return -1;
        }

        // If the target is found at the current index
        if (array[index] == target) {
            return index;
        }

        // Recursive call to search in the remaining array
        return linearSearch(array, index + 1, target);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        // Input the array elements
        System.out.println("Enter " + n + " integers: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the target element to search
        System.out.print("Enter the target element: ");
        int target = scanner.nextInt();

        // Perform recursive linear search
        int result = linearSearch(array, 0, target);

        // Display the result
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        scanner.close();
    }
}
