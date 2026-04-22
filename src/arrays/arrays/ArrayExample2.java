package arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArrayExample2 {

    public static void main(String[] args) {
        int[] arr = {1,3,0,2,44,12}; //Declaration and Initializaton.

        // Arrays.sort(arr); //Sorts in ascending order.
        // Arrays.sort(arr,Collections.reverseOrder()); // Sorts in descending order but work on Wrapper Classes.


           for (int i = 0; i <= arr.length-1; i++) {

        // sorting logic [Selection Sort]
        // Inner Loop for pointing element at index i+1 = 1
        for(int j = i+1;j<arr.length;j++){
            // Checking elements
            int temp = 0;

            if (arr[j] > arr[i]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
            // System.out.println();
        }

      
     
        // System.out.print(arr[i]+" ");
       }

        for (int i : arr) {
            System.out.print(i+" ");
        }

    }
}
