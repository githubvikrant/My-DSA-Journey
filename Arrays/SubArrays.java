public class SubArrays {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        printSubArrays(arr);
    }

    public static void printSubArrays(int arr[]){
        int l = arr.length;
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<l-i;j++){
                for(int k=j;k<j+i+1;k++){
                  System.out.print(arr[k]);
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
