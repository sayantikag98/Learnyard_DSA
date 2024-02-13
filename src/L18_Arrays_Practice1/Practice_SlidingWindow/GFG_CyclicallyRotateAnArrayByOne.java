package L18_Arrays_Practice1.Practice_SlidingWindow;

import java.util.Arrays;

public class GFG_CyclicallyRotateAnArrayByOne {
    //https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        rotate(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void rotate(int[] arr, int n)
    {
        /*
        shift elements to the right -> start iterating from right to left
        shift elements to the left -> start iterating from left to right
        TC=>O(n)
        SC=>O(1)
         */
        int temp = arr[n-1];
        for(int i = n-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
}
