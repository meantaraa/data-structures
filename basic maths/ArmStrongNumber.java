import java.util.Scanner;
import java.lang.Math;

public class ArmStrongNumber {

    public static boolean findArmstrongNumber(int n) {
        
        int k = (int) (Math.log10(n) + 1);
        //int k = String.valueOf(n).length();

        int num = n;

        double sum = 0;

        while(n > 0) {

            int ld = n % 10;

            sum = sum + Math.pow(ld, k);

            n = n / 10;

        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (findArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}

//Time Complexity: O(log10N + 1) 
//Space Complexity: O(1) 