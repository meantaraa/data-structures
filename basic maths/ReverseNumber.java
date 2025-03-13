import java.util.*;

public class ReverseNumber {

    public static int reverseNumber(int n){
        int revNum=0;
        while(n>0){
            int ld = n%10;
            revNum = (revNum*10) + ld;
            n=n/10;
        }
        return revNum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reversed = reverseNumber(num);
        System.out.println("Reversed number: " + reversed);
    }
}

//Time Complexity: O(log10N + 1) 
//Space Complexity: O(1) 

