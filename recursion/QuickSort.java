
public class QuickSort {

    public static void main(String[] args) {
        int[] array = {2, 5, 1, 3, 9, 4, 9, 6, 8};
        printArray(array);

        quicksort(array,0,array.length-1);

        printArray(array);
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    static void quicksort(int[] arr,int si, int ei){
        if(si>=ei){
            return;
        }

        int pIdx = partition(arr,si,ei);
        quicksort(arr, si, pIdx-1);
        quicksort(arr, pIdx+1, ei);
    }

    static int partition(int[] arr, int si,int ei){
          int pivot = arr[ei];
          int i = si-1;
          int temp;
          
          for(int j=si;j<ei;j++){
            if(pivot>=arr[j]){
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
          }

          i++;
          arr[ei] = arr[i];
          arr[i] = pivot;

          return i;
    }


}
