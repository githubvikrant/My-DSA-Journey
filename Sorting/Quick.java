import java.util.*;

public class Quick {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        QuickSort(arr,0,size-1);
        print(arr);
    }

    private static void print(int[] arr){
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    private static void QuickSort(int[] arr, int low, int high){
        if(low<high){
            int pivot = partition(arr,low,high);
            System.out.print(pivot + " ");
            QuickSort(arr,low,pivot-1);
            QuickSort(arr,pivot+1,high);
        }
    }

    private static int partition(int[] arr,int low,int high){

        int pivot = arr[high];
        int i = low-1;

        for(int j=0;j<=high-1;j++){
            if(arr[pivot] > arr[j]){
               i++;
               swap(i,j,arr);
            }
        }
         
        swap(i+1,pivot,arr);
        return i+1;
    }

    private static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}