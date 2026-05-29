

class Pair {
    int a, b;
}

public class Swapping {
    static void innerSwapping(Pair p) {
        int temp = p.a;
        p.a = p.b;
        p.b = temp;
    }

    public static void main(String[] args) {
        Pair p = new Pair();
        p.a = Integer.parseInt(args[0]);
        p.b = Integer.parseInt(args[1]);

        System.out.println("Before: a = " + p.a + ", b = " + p.b);
        innerSwapping(p);
        System.out.println("After: a = " + p.a + ", b = " + p.b);
    }
}
