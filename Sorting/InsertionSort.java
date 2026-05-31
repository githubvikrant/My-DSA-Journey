import java.util.*;
public class InsertionSort {

    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();

       int[] arr = new int[size];

       for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
       }

        insertionSort(arr);
        printArr(arr);
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    public static void insertionSort(int arr[]) {
        System.out.println("inside sorting function");
        for (int i = 1; i < arr.length; i++) {

            int item = arr[i];
            int j = i-1;

            while (j >= 0 && item < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = item;
        }
    }

}
