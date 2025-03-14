// import java.util.*;

// public class FindUnion {

//     public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2, int n, int m) {
//         HashSet<Integer> s = new HashSet<>();
//         ArrayList<Integer> Union = new ArrayList<>();
//         for (int i = 0; i < n; i++)
//             s.add(arr1[i]);
//         for (int i = 0; i < m; i++)
//             s.add(arr2[i]);
//         for (int it : s)
//             Union.add(it);
//         return Union;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number of elements in the first array:");
//         int n = sc.nextInt();
//         int[] arr1 = new int[n];
//         System.out.println("Enter the elements of the first array:");
//         for (int i = 0; i < n; i++) {
//             arr1[i] = sc.nextInt();
//         }

//         System.out.println("Enter the number of elements in the second array:");
//         int m = sc.nextInt();
//         int[] arr2 = new int[m];
//         System.out.println("Enter the elements of the second array:");
//         for (int i = 0; i < m; i++) {
//             arr2[i] = sc.nextInt();
//         }

//         ArrayList<Integer> union = findUnion(arr1, arr2, n, m);
//         System.out.println("The union of the two arrays is:");
//         for (int num : union) {
//             System.out.print(num + " ");
//         }
//     }
// }

/*Time Complexity: O(m+n) log(m+n)
  Space Complexity: O(m+n) 
 */

import java.util.*;

public class FindUnion {
    static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
        int i = 0, j = 0;
        ArrayList<Integer> Union = new ArrayList<>();
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            } else {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            }
        }
        while (i < n) {
            if (Union.get(Union.size() - 1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }
        while (j < m) { 
            if (Union.get(Union.size() - 1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }
        return Union;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the first array:");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the number of elements in the second array:");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        ArrayList<Integer> union = FindUnion(arr1, arr2, n, m);
        System.out.println("The union of the two arrays is:");
        for (int num : union) {
            System.out.print(num + " ");
        }
    }
}

/*
Time Complexity: O(m+n)
Space Complexity : O(m+n)
 */