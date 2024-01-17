package L9_Array_Problem_Solving.Practice;

import java.util.Scanner;
import java.util.Arrays;
public class GFG_FindSmallestAndSecondSmallest {
    //https://www.geeksforgeeks.org/problems/find-the-smallest-and-second-smallest-element-in-an-array3226/1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] arr = new long[(int)n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextLong();
        }

        System.out.println(Arrays.toString(minAnd2ndMin(arr, n)));

    }

    public static long[] minAnd2ndMin(long[] arr, long n)
    {
        long smallest = Long.MAX_VALUE, secondSmallest = Long.MAX_VALUE;
        for(int i = 0; i<n; i++){
            if(arr[i]<smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i]>smallest && arr[i]<secondSmallest){
                secondSmallest = arr[i];
            }
        }
        if(secondSmallest == Long.MAX_VALUE){
            return new long[]{-1, -1};
        }
        else{
            return new long[]{smallest, secondSmallest};
        }
    }
}
