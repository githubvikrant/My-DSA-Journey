

public class Palindrome {
    public static void main(String[] args) {
       String str = "bcdcb";
    //    System.out.println(str+" is palindrome : "+isPalindrome(str));

       //using stringBuilder for clean code
       System.out.println(str+" is palindrome : "+ checkPalindrome(str));

    }

    public static boolean isPalindrome(String str){

        int i,j;
        i=0;
        j=str.length()-1;
        
        while(i <= j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


    public static boolean checkPalindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        return str.equals(sb.reverse().toString());
    }
}
