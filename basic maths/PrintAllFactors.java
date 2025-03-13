// import java.util.*;
// public class PrintAllFactors {
//     public static void printDivisors(int n) {
//         for (int i = 1; i <= n; i++) {
//             if (n % i == 0) {
//                 System.out.println(i + " ");
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();
//         System.out.println("The divisors of " + number + " are: ");
//         printDivisors(number);
//         scanner.close();
//     }
// }

/*Time Complexity : O(n) 
Auxiliary Space : O(1) */

import java.util.Scanner;

public class PrintAllFactors {
    public static void printDivisors(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.println(i + " ");
                } else {
                    System.out.println(i + " " + n / i + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("The divisors of " + number + " are: ");
        printDivisors(number);
        scanner.close();
    }
}

/*Time Complexity: O(sqrt(n))
Auxiliary Space: O(1 */