// import java.util.*;

// public class LeftRotateArray {

//     static int[] leftRotateArray(int[] arr, int n) {
//         int temp[]=new int[n];
//         for (int i = 1; i < n; i++) {
//           temp[i - 1] = arr[i];
//         }
//         temp[n - 1] = arr[0];
//         for (int i = 0; i < n; i++) {
//           System.out.print(temp[i]+" ");
//         }

//       }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the number of elements in the array: ");
//         int n = scanner.nextInt();

//         int[] arr = new int[n];
//         System.out.println("Enter the elements of the array: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = scanner.nextInt();
//         }

//         int[] rotatedArray = leftRotateArray(arr, n);

//         System.out.println("Array after left rotation: ");
//         for (int i = 0; i < n; i++) {
//             System.out.print(rotatedArray[i] + " ");
//         }
//     }
// }

/* Time Complexity: O(n) 
   Space Complexity: O(N)
*/

import java.util.*;

public class LeftRotateArray {

    public static int[] leftRotateArray(int[] arr, int n) {

        int temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[n - 1] = temp; 
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] rotatedArray = leftRotateArray(arr, n);

        System.out.println("Array after left rotation: ");
        for (int i = 0; i < n; i++) {
            System.out.print(rotatedArray[i] + " ");
        }
    }
}