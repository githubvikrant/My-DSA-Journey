import java.util.*;

public class QuickSort {

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Choose the last element as the pivot
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(i,j,array);
            }
        }

        swap(i+1,high,array);

        return i + 1; // Return the partition index
    }

    private static void swap(int i,int j,int[] array){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
    }

    public static void main(String[] args) {

        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        quickSort(array, 0, array.length - 1); // Sorting the array

        System.out.println("Sorted Array: " + Arrays.toString(array));

        scanner.close(); // Closing the scanner
    }
}


