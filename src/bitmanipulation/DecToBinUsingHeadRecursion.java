public class DecToBinUsingHeadRecursion {

    // factorial using loop
    static long factUsingLoop(int num){
        int fact = 1;
        int res;
        for (int i = 1; i < num; i++) {
          res = fact * i;
          fact  += res;           
        }
   
        return fact;
    }

    //  fact using recursion
    static long factUsingRec(int num){
        int fact = 1;
        // base-case
        if(num == 0 || num == 1){
            return 0;
        }else{
           
            return num * factUsingLoop(num-1);    
        }
        
    }

    public static void main(String[] args) {
      System.out.println("Factorial using loop : "+factUsingLoop(5));
      System.out.println("Factorial using recursion : "+factUsingRec(5));
    }
}
