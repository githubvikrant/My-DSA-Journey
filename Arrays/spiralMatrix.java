

public class spiralMatrix {
    public static void main(String[] args) {
          int matrix[][] = {{10,11,12},{19,20,13},{18,21,14},{17,16,15}};
          printMatrix(matrix);
          System.out.println("spiral below: ");
          printSpiral(matrix);
    }

    public static void printMatrix(int matrix[][]){

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public static void printSpiral(int matrix[][]){
        int srtRow = 0;
        int srtCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while(srtRow <= endRow && srtCol <= endCol){
            for(int j=srtCol;j<=endCol;j++){
                System.out.print(matrix[srtRow][j]+" ");
            }

            for(int i=srtRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }

            for(int j=endCol-1;j>=srtCol;j--){
                System.out.print(matrix[endRow][j]+" ");
            }

            for(int i=endRow-1;i>=srtRow+1;i--){
                System.out.print(matrix[i][srtCol]+" ");
            }

            srtRow++;
            endRow--;
            srtCol++;
            endCol--;
        }
         
    }

}
   



