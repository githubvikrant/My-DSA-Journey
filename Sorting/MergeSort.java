import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

    // Main function that sorts an array using Merge Sort
    public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return; // Base case: array with 0 or 1 element is already sorted
        }

        // Find the middle point and divide the array into two halves
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid); // Left half
        int[] right = Arrays.copyOfRange(array, mid, array.length); // Right half

        // Recursively sort the two halves
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves
        merge(array, left, right);
    }

    // Merges two sorted subarrays into one sorted array
    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Merge the elements from left and right into the original array
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Copy any remaining elements from the left subarray
        while (i < left.length) {
            array[k++] = left[i++];
        }

        // Copy any remaining elements from the right subarray
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    // Main method to test the mergeSort function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking the user to input the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Creating an array of the given size
        int[] array = new int[n];

        // Asking the user to input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(array));

        mergeSort(array); // Sorting the array

        System.out.println("Sorted Array: " + Arrays.toString(array));

        scanner.close(); // Closing the scanner
    }
}

// Output
// Enter the number of elements in the array: 5
// Enter the elements of the array:
// 12
// 5
// 3
// 9
// 8
// Original Array: [12, 5, 3, 9, 8]
// Sorted Array: [3, 5, 8, 9, 12]
