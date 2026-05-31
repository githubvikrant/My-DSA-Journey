import java.util.*;

public class StringConcat {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        String input2 = sc.next();

        input1 = input1 + input2;
        System.out.println(input1);
     }
}