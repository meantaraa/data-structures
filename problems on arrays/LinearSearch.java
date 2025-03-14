import java.util.*;

public class LinearSearch {

    public static int linearSearch(int[] arr, int n, int num) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
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

        System.out.print("Enter the number to search: ");
        int num = scanner.nextInt();

        int result = linearSearch(arr, n, num);
        if (result == -1) {
            System.out.println("Number not found in the array.");
        } else {
            System.out.println("Number found at index: " + result);
        }

        scanner.close();
    }
}

/*Time Complexity: O(n)
Space Complexity: O(1) */