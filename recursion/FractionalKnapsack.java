import java.util.Arrays;
import java.util.Scanner;

class Item {
    int value, weight;
    double ratio;

    // Constructor to initialize an item
    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
        this.ratio = (double) value / weight;
    }
}

public class FractionalKnapsack {

    // Function to solve the fractional knapsack problem
    public static double fractionalKnapsack(int capacity, Item[] items) {
        // Sort items by their value-to-weight ratio in descending order
        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));

        double totalValue = 0; // Total value accumulated
        int currentWeight = 0; // Current weight in the knapsack

        for (Item item : items) {
            if (currentWeight + item.weight <= capacity) {
                // If the entire item can fit in the knapsack, take it all
                currentWeight += item.weight;
                totalValue += item.value;
            } else {
                // Take the fractional part of the item
                int remainingWeight = capacity - currentWeight;
                totalValue += item.ratio * remainingWeight;
                break;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of items
        System.out.print("Enter the number of items: ");
        int n = scanner.nextInt();

        // Input capacity of the knapsack
        System.out.print("Enter the capacity of the knapsack: ");
        int capacity = scanner.nextInt();

        // Create an array to store items
        Item[] items = new Item[n];

        // Input the value and weight of each item
        System.out.println("Enter the value and weight of each item:");
        for (int i = 0; i < n; i++) {
            System.out.print("Item " + (i + 1) + " - Value: ");
            int value = scanner.nextInt();
            System.out.print("Item " + (i + 1) + " - Weight: ");
            int weight = scanner.nextInt();
            items[i] = new Item(value, weight);
        }

        // Solve the fractional knapsack problem
        double maxValue = fractionalKnapsack(capacity, items);

        System.out.println("Maximum value in the knapsack = " + maxValue);

        scanner.close();
    }
}

// output
// Enter the number of items: 3
// Enter the capacity of the knapsack: 50
// Enter the value and weight of each item:
// Item 1 - Value: 60
// Item 1 - Weight: 10
// Item 2 - Value: 100
// Item 2 - Weight: 20
// Item 3 - Value: 120
// Item 3 - Weight: 30
// Maximum value in the knapsack = 240.0
