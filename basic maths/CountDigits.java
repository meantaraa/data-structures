// import java.util.*;

// public class CountDigits {

//     public static int countDigits(int n) {
//         int cnt = 0;
//         while (n > 0) {
//             cnt++;
//             n = n / 10;
//         }
//         return cnt;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         int result = countDigits(n);
//         System.out.println("The number of digits in n are: " + result);
//     }
// }

//Time Complexity: O(log10n+1)
//Space Complexity : O(1) 

import java.util.Scanner;

public class CountDigits {

    public static int countDigits(int n) {
        int cnt = (int) (Math.log10(n) + 1);
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = countDigits(n);
        System.out.println("The number of digits in n are: " + result);
    }
}

//Time Complexity:O(1)
//Space Complexity : O(1)

