public class DecToBinUsingString {

    // int num = 5;
    static void decToBin(int num) {
        int modValue;
        StringBuilder sb = new StringBuilder();
        while (num>0) {
            modValue = num % 2; // only two outcomes possible 1 or 0 
            sb.append((char)('0'+modValue)); 
            num /= 2;  
         
        }
        // reverse the string 
        System.out.println(sb.reverse());

     

    }

   /*  static void chekEvenOdd(int num){
        System.out.println(num%2==0?"Even":"Odd"+" "+num%2);
        System.out.println(num%2);
    }
 */
    public static void main(String[] args) {

    decToBin(20);
   

    }
}
