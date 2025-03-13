public class Print1toN {

    public static void print1ToN(int current, int n){

        if(current > n){
            return;
        }
        System.out.println(current);
        print1ToN(current+1, n);
    }
    
    public static void main(String[] args){

        int N=5;
        print1ToN(1, N);
    }
}

// Time Complexity: O(N)
// Space Complexity: O(N) 
