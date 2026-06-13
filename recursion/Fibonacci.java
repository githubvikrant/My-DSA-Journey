
public class Fibonacci {

    public static void main(String[] args) {
        int nth = 3;
        System.out.println(nthfobonacci(nth));
    }

    public static int nthfobonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int fn1 = nthfobonacci(n - 1);
        int fn2 = nthfobonacci(n - 2);

        int fn = fn1 + fn2;

        return fn;
    }
}
