class Solution {
    public int myAtoi(String s) {
        if(s == null || s.length() == 0) return 0;
        boolean neg = false;
        boolean pos = false;
        long num = 0;
        StringBuilder sb = new StringBuilder("");
        int i=0;
       while(i<s.length() && s.charAt(i) == ' '){
          i++;
       }
       if(i<s.length() && s.charAt(i) == '-'){
         neg = true;
         i++;
       } 
       if(i<s.length() && s.charAt(i) == '+'){
          pos = true;
          i++;
       } 
       while(i<s.length() && s.charAt(i) == '0'){
          i++;
       }

       if(neg && pos) return 0;

       
       for(;i<s.length();i++){
         if(num>Integer.MAX_VALUE) break;
        char c = s.charAt(i);
          if(Character.isDigit(c)){
            num = num*10 + (c-'0');

          }else{
            break;
          }
       }
       if(neg){
         if(num>Integer.MAX_VALUE) return Integer.MIN_VALUE;
         return -(int)num;
       }else{
         if(num>Integer.MAX_VALUE) return Integer.MAX_VALUE;
         
         return (int)num;
       }
    }
}