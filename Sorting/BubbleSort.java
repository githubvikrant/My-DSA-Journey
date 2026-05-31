import java.util.Scanner;


public class BubbleSort {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       int[] arr = new int[n];

       for (int i = 0; i < n; i++) {
              arr[i] = sc.nextInt();
       }  

       Bubble_sort(arr);
       printArr(arr);
   }

   public static void printArr(int arr[]){
    for(int i : arr){
        System.out.print(i+" ");
    }
   }

   public static void Bubble_sort(int arr[]){
    for (int i=0;i<arr.length;i++) {
        for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
   }
	
}
