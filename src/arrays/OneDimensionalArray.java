

public class OneDimensionalArray {

    /*
     * int[] numbers;
     * int size;
     * int capacity;
     * public OneDimensionalArray(int capacity) {
     * this.capacity = capacity;
     * this.numbers = new int[capacity];
     * this.size = 0;
     * }
     */

    public static void main(String[] args) {
        int[] numbers = new int[5]; // declaration and instantiation
        numbers[0] = 10; // initialization
        int[] moreNumbers = { 10, 20, 30, 40, 50 }; // array literal

        /* // 1st way to iterate :
        for (int i : numbers) {
            System.out.print(i + ",");
        } */

        // 2nd way to iterate :
        /*
         * int i = 0;
         * 
         * while(i != moreNumbers.length){
         * System.out.println(moreNumbers[i]);
         * i++;
         * }
         */
        // System.out.println(moreNumbers.length); // prints number of elements

        // 3rd way to iterate :
        for (int i = 0; i < moreNumbers.length; i++) {
            System.out.print(moreNumbers[i]+",");
        }

    }
}
