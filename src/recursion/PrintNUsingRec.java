public class PrintNUsingRec {
    public static void printNum(int n) {
        // BASE-CASE.
       
        if (n==0) {
            return;
        }
        // RECURSIVE CALL.
        printNum(n-1);

         // WORK-DONE.
        System.out.print(n + " ");
    }

    static void printVal(int n) {

        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        // main method calls printNum(n)
        printNum(6);
        // printVal(7);

    }
}
