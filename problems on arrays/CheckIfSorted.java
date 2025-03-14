// import java.util.*;

// public class CheckIfSorted {

//     public static int checkIfSorted(int[] arr, int n){

//         for(int i = 0; i < n - 1; i++) {
//             if(arr[i] > arr[i + 1]) {
//                 return 0;
//             }
//         }
//         return 1;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number of elements: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         System.out.print("Enter the elements: ");
//         for(int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         if(checkIfSorted(arr, n) == 1) {
//             System.out.println("The array is sorted.");
//         } else {
//             System.out.println("The array is not sorted.");
//         }

//         sc.close();
//     }
    
// }

/*Time Complexity: O(N^2)

Space Complexity: O(1) */

import java.util.*;

public class CheckIfSorted{

    public static int checkIfSorted(int[] arr, int n){

        for(int i=1; i<n; i++) {
            if(arr[i-1]>arr[i]){
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.print("Enter the elements: ");
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }

        if(checkIfSorted(a, n)==1){
            System.out.println("Array is sorted.");
        }else{
            System.out.println("Array is unsorted.");
        }

    }
}

/*Time Complexity: O(N)

Space Complexity: O(1) */