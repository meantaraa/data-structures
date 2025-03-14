// import java.util.*;

// public class RotateByd {

//     public static int[] rotateArray(int[] arr, int d, int n){

//         for(int i=0; i<d; i++){

//             int temp = arr[0];
//             for (int j=0; j<n-1; j++){
//                 arr[j] = arr[j+1];
//             }
//             arr[n-1] = temp;
//         }
//         return arr;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         try {
//             System.out.println("Enter the number of elements in the array:");
//             int n = sc.nextInt();
//             int[] arr = new int[n];
//             System.out.println("Enter the elements of the array:");
//             for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//             }
//             System.out.println("Enter the number of rotations:");
//             int d = sc.nextInt();
//             arr = rotateArray(arr, d, n);
//             System.out.println("Rotated array:");
//             for (int i : arr) {
//             System.out.print(i + " ");
//             }
//         } finally {
//             sc.close();
//         }
//     }
    
// }

/*Time Complexity: O(n*d)
  Space Complexity: O(1)
 */

// import java.util.*;

// public class RotateByd {

//     public static int[] rotateByd(int[] arr, int d, int n) {

//         d = d % n;

//         int[] temp = new int[n];

//         for (int i = 0; i < n - d; i++) {
//             temp[i] = arr[d + i];
//         }

//         for (int i = 0; i < d; i++) {
//             temp[n - d + i] = arr[i];
//         }

//         for (int i = 0; i < n; i++) {
//             arr[i] = temp[i];
//         }

//         return arr;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number of elements in the array:");
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Enter the number of rotations:");
//         int d = sc.nextInt();

//         arr = rotateByd(arr, d, n);

//         System.out.println("Rotated array:");
//         for (int i : arr) {
//             System.out.print(i + " ");
//         }
//         sc.close();
//     }
// }

/*Time Complexity: O(n) 
  Space Complexity: O(n)
*/

import java.util.Scanner;

public class RotateByd {

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateByd(int[] arr, int n, int d) {
        d %= n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number of rotations:");
        int d = sc.nextInt();

        rotateByd(arr, n, d);

        System.out.println("Rotated array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}

/*Time Complexity: O(n) 
  Space Complexity: O(1)
*/
