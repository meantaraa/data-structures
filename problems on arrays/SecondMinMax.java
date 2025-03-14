// import java.util.*;

// public class SecondMinMax {

//     public static int[] findMinMax(int[] arr, int n) {
           
//         if(n<2){
//             System.out.println("Not enough elements");
//         }

//         Arrays.sort(arr);
//         return new int[]{arr[1], arr[n-2]};
//     }
    

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the no. of elements.");
//         int n = sc.nextInt();
//         int[] a = new int[n];

//         System.out.print("Enter the elements: ");
//         for(int i =0; i<n; i++) {
//             a[i] = sc.nextInt();
//         }

//         int[] result = findMinMax(a, n);

//         System.out.print("Second smallest element is: " + result[0]);
//         System.out.print("Second largest element is: " + result[1]);

//     }
// }

//Time Complexity: O(NlogN)
//Space Complexity: O(1)

import java.util.Scanner;

public class SecondMinMax {
    public static int[] findMinMax(int[] arr, int n) {
        if (n < 2) {
            return new int[]{-1, -1};
        }

        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            // Finding the second smallest
            if (arr[i] < small) {
                second_small = small;
                small = arr[i];
            } else if (arr[i] < second_small && arr[i] != small) {
                second_small = arr[i];
            }

            // Finding the second largest
            if (arr[i] > large) {
                second_large = large;
                large = arr[i];
            } else if (arr[i] > second_large && arr[i] != large) {
                second_large = arr[i];
            }
        }
        return new int[]{second_small, second_large};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int[] result = findMinMax(arr, n);
        System.out.println("Second smallest element: " + result[0]);
        System.out.println("Second largest element: " + result[1]);
        
        scanner.close();
    }
}