

public class SelectionSort {
    public static void main(String[] args) {
       int arr[] = {4,2,1,8};
       selectionSort(arr);
       printArr(arr);
   }

   public static void printArr(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(" "+arr[i]);
    }
   }

   public static void selectionSort(int arr[]){
       
       for(int i=0;i<arr.length;i++){
        int minIdx = i;
        for(int j=i;j<arr.length;j++){
            if(arr[minIdx]>arr[j]){
                minIdx = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[minIdx];
        arr[minIdx] = temp;
       }
   }
}
