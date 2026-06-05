
abstract class Car {
    String name;
    static {
        System.out.print("1");
    }
    public Car(String name) {
        this.name = name;
        // super();
        System.out.print("2");
    }

    {
        System.out.print("3");
    }
}


public class BlueCar extends Car {
    {
        System.out.print("4");

    }
    public BlueCar() {
        super("blue");
        System.out.println("5");
    }

    public static void main(String[] args) {
        BlueCar bc = new BlueCar();
        System.out.println(bc.name);
    }
}

// Static block of Car → runs once at class load (1).
// Car instance block → runs before Car constructor (3).
// Car constructor → runs next (2).
// BlueCar instance block → runs before BlueCar constructor (4).
// BlueCar constructor → runs last (5).

// 13245
