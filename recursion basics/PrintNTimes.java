import java.util.Scanner;

public class PrintNTimes {

    public static void printNTimes(int num, int count) {
        if (count == 0) {
            return;
        } else {
            System.out.println(num);
        }
        printNTimes(num, count - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number to print: ");
        int number = scanner.nextInt();

        System.out.print("Enter the number of times to print: ");
        int times = scanner.nextInt();

        printNTimes(number, times);
        scanner.close();
    }
}

//Time Complexity: O(N) 
// Space Complexity: O(N)
