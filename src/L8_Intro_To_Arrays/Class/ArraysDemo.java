package L8_Intro_To_Arrays.Class;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {

        //default value for integer array is zero
        int[] arr;
        arr = new int[10];

        int[] arr1 = new int [20];

        int[] arr2 = {4,3,2,1};


        System.out.println(arr2); // prints base location

        //different ways to print array

        // using normal for loop
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        // using for each loop
        for(int i: arr1){
            System.out.print(i+" ");
        }

        System.out.println();

        // print array without loop
        System.out.println(Arrays.toString(arr2));

        // sort array
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr2));


        // fill the array with same element
        Arrays.fill(arr2, 5);

        System.out.println(Arrays.toString(arr2));


        // Comparing 2 arrays
        int[] arr10 = {1,2,3};
        int[] arr11 = {1,2,3};
        System.out.println(arr10 == arr11); //false
        System.out.println(Arrays.equals(arr10, arr11)); //true

        // shallow copy
        int[] arr12 = {1,2,3};
        int[] arr13 = arr12;
        arr13[0] = 10;
        System.out.println(Arrays.toString(arr12));
        System.out.println(Arrays.toString(arr13));

        // deep copy
        int[] arr14 = Arrays.copyOf(arr12, arr12.length);
        arr14[2] = 100;
        System.out.println(Arrays.toString(arr12));
        System.out.println(Arrays.toString(arr13));
        System.out.println(Arrays.toString(arr14));

        int[] arr15 = {1,2, 'a'};
        System.out.println(Arrays.toString(arr15));


    }
}
