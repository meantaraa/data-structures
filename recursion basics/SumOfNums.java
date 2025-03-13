public class SumOfNums {
    
    public static int solve(int n) {
        if (n == 0) {
            return 0;
        } else {
            int sum = n * (n + 1) / 2;
            System.out.println("The sum of the first " + n + " numbers is " + sum);
            return sum;
        }
    }

    public static void main(String[] args) {
        int result = solve(5);
        System.out.println("Result: " + result);
    }
}

// Space Complexity: O(1) 
// Time Complexity: O(1)
