import java.util.Scanner;

public class FibonacciRecursion {
    
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static void printFibonacciSeries(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        scanner.close();
        
        System.out.println("Fibonacci Series up to " + n + " terms:");
        printFibonacciSeries(n);
    }
}

// Time Complexity: O(2^n)
// Space Complexity: O(n)
