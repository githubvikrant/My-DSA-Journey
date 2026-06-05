

public class ClassAbstract {
    public static void main(String[] args) {
        Horse H1 = new Horse();
        
        System.out.println(H1.name);
    }
}

abstract class Animal{
    String name;
   Animal(){
    this.name = "Animal";
    System.out.println(name+" animal contructor called...");
   }
}

abstract class Mammal extends Animal{
   
     Mammal(){
      
      System.out.println(name+" mammal contructor called...");
   }
}

class Horse extends Mammal{
      Horse(){
     
      System.out.println(" Horse contructor called...");
   }
}

