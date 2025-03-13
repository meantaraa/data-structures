public class PrintNto1 {

    public static void func(int i, int n){

        if(i<1){
            return;
        }else{
            System.out.println(i);
        }

        func(i-1, n);
    }

    public static void main(String[] args) {
        
        int n = 4;
        func(n, n);
    }
    
}

// Time Complexity: O(n)
// Space Complexity: O(n)
