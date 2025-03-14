// import java.util.*;

// import java.util.*;

// public class RemoveDuplicate {

//     public static int removeDuplicates(int[] arr, int n) {

//         HashSet <Integer> set = new HashSet <> ();
//         for(int i = 0; i<n; i++){
//             set.add(arr[i]);
//         }

//         int k = set.size();
//         int j =0;
//         for(int x: set){
//             arr[j++] = x;
//         }
//         return k;
//     }
    
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter the no. of elements: ");
//         int n = sc.nextInt();
//         int[] a = new int[n];

//         System.out.println("Enter the elements: ");
//         for(int i=0; i<n; i++){
//             a[i] = sc.nextInt();
//         }
        
//         int newLength = removeDuplicates(a, n);

//         System.out.println("The array after removing duplicates: ");
//         for(int i=0; i<newLength; i++){
//             System.out.println(a[i] + " ");
//         }

//     }
// }

/*Time complexity: O(n*log(n))+O(n)

Space Complexity: O(n)  */

import java.util.*;

public class RemoveDuplicate{

    static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {  
                arr[++j] = arr[i];  
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

  
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int k = removeDuplicates(arr);


        System.out.println("Unique count: " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}