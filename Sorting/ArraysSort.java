import java.util.*;

public class ArraysSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements at once separated by space :");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Sorted array : ");
        System.out.print(Arrays.toString(arr));
    }
}