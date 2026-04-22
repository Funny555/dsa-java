public class factorialOfN {
    public static long factorialOfN(int n){
        // base-case
        if (n==1||n==0) {
            return 1;
            
        }
        long res = n * factorialOfN(n-1);
        return res;
    }
public static void main(String[] args) {
    
    // calling static fun factorialOfN
    System.out.println(factorialOfN(5));
}
}
