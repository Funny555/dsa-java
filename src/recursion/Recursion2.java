public class Recursion2 {

    /* static void sum(int i,int n,int sum){
        if(i==n){
            sum += i;
            System.out.print(sum+" ");
            return;
        }

        sum +=i;
        sum(i+1,n,sum);

        
    } */

        static void sum(int n){

            int add = 0;
            int i = 1;
            if(n<1){
                add += n;
                System.out.print(add+" ");
                return;
            }
           
            // System.out.print(n+" ");
             sum(n-1);
             add = add + i;

        }
public static void main(String[] args) {
    
    // sum(1, 5, 0);
    sum(5);

}
}
