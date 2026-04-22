package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        // Creation of an array.
        int[] array = new int[5];
        int[] arr = {10,1,5,3,1};
        // Arrays.sort(arr);
    
        
        System.out.println("Size of arr : "+arr.length);
        // Outer Loop
       for (int i = 0; i <= arr.length-1; i++) {

        // sorting logic [Selection Sort]
        // Inner Loop for pointing element at index i+1 = 1
        for(int j = i+1;j<arr.length;j++){
            // Checking elements
            int temp = 0;

            if (arr[j] < arr[i]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
            // System.out.println();
        }

      
     
        System.out.print(arr[i]+" ");
       }
















        // taking user input as values of array.
      /*   Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements : ");
        for (int i = 0; i < array.length; i++) {
            try{
                array[i] = sc.nextInt();
            }catch(Exception e){
                e.printStackTrace();
                System.out.println("type mismatch");
            }
        }
        for (int i : array) {
            System.out.print(i+" ");
        } */

      /* array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5; */

        /*
         * System.out.println(array);
         * System.out.println(array.getClass().hashCode()); //Prints hashcode.
         * System.out.println(array.getClass().getName()); //Prints data-type in case of
         * primitives otherwise prints class-name
         * System.out.println(array.length); //Prints the length(size) of an array
         * System.out.println(array[0]);
         */

        // Accessing values from an array using indexes.
      /*   for (int i : array) {
            if (i < array.length) {
                System.out.print(i + ",");

            } else {
                System.out.print(i);
            }
        } */

    
    }
}
