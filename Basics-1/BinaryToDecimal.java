public class BinaryToDecimal {
    public static void main(String[] args) {
        ToDecimal(101010);
        
    }

    public static void ToDecimal(int bigNum){
        int pow = 0;
        int decNum = 0;
        while(bigNum > 0){
            int lastDigit = bigNum%10;
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
            pow++;
            bigNum /= 10;
        }
        System.out.println("decimal of " + bigNum + " is " + decNum);
    }
}
