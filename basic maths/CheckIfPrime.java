// import java.util.*;

// public class CheckIfPrime {

//     public static boolean isPrime(int n){

//         if(n<=1){
//             return false;
//         }

//         for(int i=2; i<n; i++){
//             if(n%i == 0){
//                 return false;
//             }
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();
//         sc.close();

//         if(isPrime(number)){
//             System.out.println(number + " is a prime number.");
//         } else {
//             System.out.println(number + " is not a prime number.");
//         }
//     }
// }

/*
Time Complexity: O(n)
Auxiliary Space: O(1)
*/


import java.util.*;

public class CheckIfPrime {

    public static boolean isPrime(int n){

        if(n<=1){
            return false;
        }

        for(int i=2; i<Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        if(isPrime(number)){
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}

  /*
Time Complexity: O(sqrt(n))
Auxiliary Space: O(1)
   */