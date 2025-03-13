import java.util.*;

public class CheckPalindrome {

    public static boolean checkPalindrome(int n) {
        int revNum = 0;
        int num = n;

        while (n > 0) {

            int ld = n % 10;

            revNum = (revNum * 10) + ld;
            
            n = n / 10;
        }

        return revNum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (checkPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        sc.close();
    }
}

//Time Complexity: O(log10N + 1) 
//Space Complexity: O(1) 
