import java.util.*;
class Main
{
public static void main(String[] args)
{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of square matrix");
        int n=sc.nextInt();
        sc.nextLine();
      
        int[][] arr = new int[n][n];

        for(int i=0;i<n;i++){
                String s = sc.nextLine().trim();
                String[] inputArr = s.split("\\s+");
                for(int j=0;j<n;j++){
                        arr[i][j] = Integer.parseInt(inputArr[j]);
                }
        }

        System.out.println();

        for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                        System.out.print(arr[i][j]+" ");
                }
                System.out.println();
        }
        
      
}
}
