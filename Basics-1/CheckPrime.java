public class CheckPrime {
   public static void main(String[] args) {
    
       
       primesInRange(10,50);
   }

   public static boolean isPrime(int n){//O(root(n))
      for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i == 0){
            return false;
        }
      }
      return true;
   }

   public static void primesInRange(int x, int y){
    for(int i = x;i<=y;i++){
         if(isPrime(i)){
            System.out.print(" " + i);
         }
    }
   }
}
 