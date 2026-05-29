import java.util.*;

public class Test {
    public static void main(String[] args) {
       //bubble sort
       int[] arr = {3,5,1,2,7,8,4,9,0,6};
       System.out.println("before sorting: "+ Arrays.toString(arr));
    //  BubbleSort(arr);
    //  selectionSort(arr);
    //  insertionSort(arr);
    //  QuickSort(arr,0,arr.length-1);
    //  MergeSort(arr);
     heapSort(arr);
       System.out.println("after sorting: " + Arrays.toString(arr));
    }

    static void BubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                  int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
                }
            }
        }
    }

    static void selectionSort(int[] arr){
        //select the min and place it at the correct position
       for(int i=0;i<arr.length;i++){
          int minIdx = i;
          for(int j=i+1;j<arr.length;j++){
            if(arr[minIdx] > arr[j]){
                minIdx = j;
            }
          }
        int temp = arr[minIdx];
        arr[minIdx] = arr[i];
        arr[i] = temp;
       }
    }

    static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int item = arr[i];
            int j = i-1;
            while(j>= 0 && item < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = item;

        }
    }

    static void QuickSort(int[] arr,int low, int high){

        if(low<high){
            int partition = Partition(arr,low,high);
            QuickSort(arr,low,partition-1);
            QuickSort(arr,partition+1,high);
        }
    }

    static int Partition(int[] arr,int low, int high){
       int pivot = arr[high];
       int i = low - 1;

       for(int j=low;j<high;j++){
          if(pivot >= arr[j]){
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
          }
       }
       int temp = arr[i+1];
       arr[i+1] = arr[high];
       arr[high] = temp;

       return i+1;
    }

    static void MergeSort(int[] arr){
        if(arr.length<2){
            return;
        }
        int mid = arr.length/2;
       int[] left = Arrays.copyOfRange(arr, 0, mid);
       int[] right = Arrays.copyOfRange(arr,mid,arr.length);

       MergeSort(left);
       MergeSort(right);
       merge(arr,left,right);
    }

    static void merge(int[] arr, int[] left, int[] right){
        int i=0;
        int j=0;
        int k=0;
         while(i<left.length && j<right.length){
            if(left[i] <= right[j]){
               arr[k++] = left[i++];
            }else{
                arr[k++] = right[j++];
            }
         }

         while(i<left.length){
            arr[k++] = left[i++];
         }
         while(j<right.length){
            arr[k++] = right[j++];
         }
    }

    static void heapSort(int[] arr){
        int n = arr.length;

        for(int i=n/2;i>=0;i--){
            heapify(arr,n,i);
        }

        for(int i=n-1;i>0;i--){
            //swap peak of max heap with last element of the heap
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr,i,0);
        }
    }

    static void heapify(int[] arr, int n, int i){
        int maxIdx = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left<n && arr[maxIdx] < arr[left]){
            maxIdx = left;
        }
        if(right<n && arr[maxIdx] < arr[right]){
            maxIdx = right;
        }

        if(maxIdx != i){
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr,n,maxIdx);
        }
    }
}



