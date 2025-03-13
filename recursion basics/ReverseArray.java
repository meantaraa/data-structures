import java.util.Scanner;

public class ReverseArray {
    public static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        } else {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArray(arr, start + 1, end - 1);
        }
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

        System.out.println("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        reverseArray(arr, 0, arr.length - 1);

        System.out.print("\nReversed Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

// Time Complexity: O(n)
// Space Complexity: O(n) 