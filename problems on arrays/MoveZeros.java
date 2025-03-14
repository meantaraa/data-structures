// import java.util.*;

// public class MoveZeros {
//     public static void moveZeros(int[] arr, int n){

//         int[] temp = new int[n];

//         int j=0;

//         for(int i=0; i<n; i++){
//             if(arr[i] != 0){
//                 temp[j++]=arr[i];
//             }
//         }

//         while(j<n)
//         temp[j++]=0;

//         for(int i=0; i<n; i++)
//         arr[i] = temp[i];
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

//         moveZeros(arr, n);

//         System.out.println("Array after moving zeros to the end:");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         sc.close();
//     }
// }

/*Time complexity: O(n) 
 Space Complexity: O(n)
*/

import java.util.*;

public class MoveZeros{

    public static int moveZeros(int[] arr, int n) {

        int count = 0;

        for(int i = 0; i<n; i++){

            if(arr[i] != 0){

                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                count++;
            }
        }

        return count;
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

        moveZeros(arr, n);

        System.out.println("Array after moving zeros to the end:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}

/*Time Complexity: O(n), 
Auxiliary Space: O(1) */