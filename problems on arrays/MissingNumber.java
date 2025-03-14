// import java.util.*;

// public class MissingNumber {

//     public static int missingNumber(int[] a, int n) {
//         for (int i = 1; i <= n; i++) {
//             int flag = 0;
//             for (int j = 0; j < n - 1; j++) {
//                 if (a[j] == i) {
//                     flag = 1;
//                     break;
//                 }
//             }
//             if (flag == 0) return i;
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter the size of the array (n): ");
//         int n = scanner.nextInt();

//         int[] a = new int[n - 1];
//         System.out.println("Enter " + (n - 1) + " elements of the array: ");
//         for (int i = 0; i < n - 1; i++) {
//             a[i] = scanner.nextInt();
//         }

//         int missingNumber = missingNumber(a, n);
//         System.out.println("The missing number is: " + missingNumber);
//     }
// }
 /*Time Complexity: O(N) + O(N) ~ O(2*N)
   Space Complexity: O(N)
  */

  import java.util.Scanner;

public class MissingNumber {

    public static int missingNumber(int[] a, int N) {
        int xor1 = 0, xor2 = 0;

        for (int i = 0; i < N - 1; i++) {
            xor2 = xor2 ^ a[i];
            xor1 = xor1 ^ (i + 1);
        }

        xor1 = xor1 ^ N;

        return (xor1 ^ xor2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        int a[] = new int[N - 1];

        System.out.println("Enter " + (N - 1) + " numbers (from 1 to " + N + " with one missing):");
        for (int i = 0; i < N - 1; i++) {
            a[i] = sc.nextInt();
        }

        sc.close();

        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
    }
}

/*Time Complexity: O(N)
  Space Complexity: O(1)
 */