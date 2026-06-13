
public class BinaryString {

    public static void main(String[] args) {
        int n = 3;
        printBinary(n, 0,new StringBuilder());
    }

    static void printBinary(int n, int prev, StringBuilder str) {

        if (n == 0) {
            System.out.println(str);
            return;
        }

        if (prev == 0) {
            printBinary(n - 1, 0, str.append("0"));
            str.deleteCharAt(str.length() - 1);
            printBinary(n - 1, 1, str.append("1"));
            str.deleteCharAt(str.length() - 1);

        } else {
            printBinary(n - 1, 0, str.append("0"));
            str.deleteCharAt(str.length() - 1);

        }

    }
}
