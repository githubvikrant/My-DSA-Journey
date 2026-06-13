
import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number : ");
    //     int num = sc.nextInt();
    //     System.out.println("Square of " + num + " : " + num * num);
        



        int age = sc.nextInt();
        // sc.nextLine(); // fix newline issue
        String name = sc.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        sc.close();

}
}
