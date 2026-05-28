package src.main.java.Array;

// Using Comparator Interface
import java.util.*;

// Define the Student class
class Student {
    int rollno;
    String name;

  	// Constructor
    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

  	// Method to print Student
  	// details in main()
    @Override
    public String toString() {
        return rollno + ": " + name;
    }
}

// Helper class implementing Comparator interface
class SortbyRoll implements Comparator<Student> 
{    
  	// Compare by roll number in ascending order
    public int compare(Student a, Student b) {
        return a.rollno - b.rollno;
    }
}

// Driver Class
public class CheckComparator
{
    public static void main(String[] args) 
    {
      	// List of Students
        List<Student> students = new ArrayList<>();
        
      	// Add Elements in List
      	students.add(new Student(111, "Mayank"));
        students.add(new Student(131, "Anshul"));
        students.add(new Student(121, "Solanki"));
        students.add(new Student(101, "Aggarwal"));

        // Sort students by roll number
      	// using SortbyRoll comparator
        Collections.sort(students, new SortbyRoll());

      	System.out.println("Sorted by Roll Number ");

        // Iterating over entries to print them
        for (int i = 0; i < students.size(); i++)
            System.out.println(students.get(i));
      	
    }
}