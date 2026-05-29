
public class MultiDiamond {

    public static void main(String[] args) {
        int diamonds = 5;
        int rows = 4;
        System.out.println("This is multi diamond structurre:");
        Multi_Diamond(diamonds,rows);
    }

    public static void Multi_Diamond(int diamonds,int rows) {
        int row = 7;
        int col = 7;
        int midCol = col / 2;

        while(rows>0){

        for (int i = 0; i <row; i++) {
            int k = diamonds;
            while (k > 0) {
                for (int j = 0; j < col; j++) {
                    if (j == (midCol - i) || j == (midCol + i) || j == (i - midCol) || j == (row - (i - midCol) - 1)) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }
                k--;
            }
            System.out.println();

        }
        rows--;
    }

      

    }
}
