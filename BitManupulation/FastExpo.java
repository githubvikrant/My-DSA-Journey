

public class FastExpo {
    public static void main(String[] args) {
        System.out.println(fastexp(3,5));
    }

    public static int fastexp(int base , int pow){
        int ans = 1;
        while(pow>0){
            if((pow & 1 ) != 0){
                ans = ans * base;
            }
            base = base*base;
            pow = pow>>1;
    }
    return ans;

    }
}
