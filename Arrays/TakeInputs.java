import java.util.*;
public class TakeInputs{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] myarr = new int[n];

        for(int i=0;i<n;i++){
            myarr[i] = sc.nextInt();
        }
        sc.close();

        for(int i : myarr){
            System.out.print(i+" ");
        }

    }
}