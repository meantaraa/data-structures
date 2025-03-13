public class PrintNum{

    public static int cnt=0;
    static void print(){

        if(cnt==3){
            return;
        }else{
        System.out.println(cnt);
        }

        cnt++;
        
        print();
    }

    public static void main(String[] args) {
        print();
    }

    
}

// Time Complexity: O(n)
// Space Complexity: O(n) 
