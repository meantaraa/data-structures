// import java.util.*;

// public class GCDandLCM {

//     public static int findGCD(int a, int b){

//         int gcd=1;

//         for(int i=1; i<Math.min(a,b); i++) {

//             if(a%i == 0 && b%i == 0 ){

//                 gcd = i;

//             }
//         }

//         return gcd;
//     }

//     public static int findLCM(int a, int b) {
//         int gcd = findGCD(a, b);
//         return (a * b) / gcd;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter the first number: ");
//         int n1 = sc.nextInt();

//         System.out.println("Enter the second number: ");
//         int n2 = sc.nextInt();

//         System.out.println("The GCD is: " + findGCD(n1, n2));

//         System.out.println("The LCM is: " + findLCM(n1, n2));


//         sc.close();
//     }

// }

//Time Complexity: O(min(N1, N2)) 
//Space Complexity: O(1)

import java.util.Scanner;

public class GCDandLCM {

    public static int findGCD(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return (a == 0) ? b : a;
    }

    public static int findLCM(int a, int b) {
        int gcd = findGCD(a, b);
        return (a * b) / gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int n1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int n2 = sc.nextInt();

        System.out.println("The GCD is: " + findGCD(n1, n2));
        System.out.println("The LCM is: " + findLCM(n1, n2));

        sc.close();
    }
}

//Time Complexity: O(min(N1, N2)) 
//Space Complexity: O(1)
