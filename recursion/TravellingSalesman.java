import java.util.Scanner;

public class TravellingSalesman {

    private static int V; // Number of cities
    private static int[][] graph; // Adjacency matrix for distances
    private static int[] visited; // Tracks visited cities
    private static int minCost = Integer.MAX_VALUE; // Stores the minimum cost

    // Function to calculate TSP using backtracking
    public static void tsp(int currentCity, int count, int cost, int start) {
        // If all cities are visited and there's a return path to the starting city
        if (count == V && graph[currentCity][start] > 0) {
            minCost = Math.min(minCost, cost + graph[currentCity][start]);
            return;
        }

        // Try to visit all unvisited cities
        for (int i = 0; i < V; i++) {
            if (visited[i] == 0 && graph[currentCity][i] > 0) {
                // Mark the city as visited
                visited[i] = 1;
                // Recur for the next city
                tsp(i, count + 1, cost + graph[currentCity][i], start);
                // Backtrack
                visited[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of cities
        System.out.print("Enter the number of cities: ");
        V = scanner.nextInt();

        // Initialize the graph (adjacency matrix)
        graph = new int[V][V];
        visited = new int[V];

        // Input the distances between cities
        System.out.println("Enter the adjacency matrix for distances (enter 0 if no direct path):");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }

        // Mark the starting city as visited
        visited[0] = 1;

        // Call the TSP function starting from city 0
        tsp(0, 1, 0, 0);

        System.out.println("Minimum cost of the tour: " + minCost);

        scanner.close();
    }
}

// output
// Enter the number of cities: 4
// Enter the adjacency matrix for distances:
// 0 10 15 20
// 10 0 35 25
// 15 35 0 30
// 20 25 30 0
