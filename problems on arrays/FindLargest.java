// public class FindLargest {

//     public static int findLargest(int[] arr, int n) {

//         if (n < 2) {
//             System.out.println("Not enough elements.");
//             return Integer.MIN_VALUE; // Return a minimum value to indicate error
//         }

//         Arrays.sort(arr);
//         return arr[n - 1];
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of elements in the array:");
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         System.out.print("Enter the elements of the array:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int largest = findLargest(arr, n);
//         System.out.println("The largest element is: " + largest);

//         sc.close();
//     }
// }

/*Time Complexity: O(N*log(N))

Space Complexity: O(n)*/ 

import java.util.Scanner;
import java.util.*;

public class FindLargest {

    public static int findLargest(int[] arr, int n) {

        int max = arr[0];

        if (n < 2) {
            System.out.println("Not enough elements.");
        } else {
            for (int i = 0; i < n; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = findLargest(arr, n);
        System.out.println("The largest element is: " + largest);

        sc.close();
    }
}

//Time Complexity: O(N)

// Space Complexity: O(1)