import java.util.Scanner;


class Hello{
    public static void main(String args[]){
       //take input from the user
        System.out.println("Enter your name: ");
       try (Scanner input = new Scanner(System.in)) {
            String name = input.nextLine();
            System.out.println("Hello " + name);
       } catch (Exception e) {
         System.out.println(e);
       }
      
      
      
      
    }

}