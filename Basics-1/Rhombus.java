public class Rhombus {
    public static void main(String[] args) {
        int row = 6;
        printRhombus(row);
    }

    public static void printRhombus(int row){
        int col = 2*row-1;
        for(int i=0;i<row;i++){
            for(int j=0;j<(col-i);j++){

                if(j<(row-i-1)){
                    System.out.print("   ");
                }
                else{
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
