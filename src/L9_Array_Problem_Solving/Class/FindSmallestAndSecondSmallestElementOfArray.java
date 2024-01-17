package L9_Array_Problem_Solving.Class;

import java.util.*;
public class FindSmallestAndSecondSmallestElementOfArray {
    //https://www.geeksforgeeks.org/problems/find-the-smallest-and-second-smallest-element-in-an-array3226/1
    public static void main(String[] args) {
        //whatever input is coming that will have 2 distinct elements
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] arr = new long[(int)n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextLong();
        }
        System.out.println(Arrays.toString(findSmallest(arr, n)));
    }

    private static long[] findSmallest(long[] arr, long n){
        // s => smallest, ss => second smallest
        long s = Long.MAX_VALUE, ss = Long.MAX_VALUE;
        long[] ans = new long[2];
        for(int i = 0; i<n; i++){
            /*
            If there is a candidate which is smaller than s,
            then value of s may be a possible candidate for second smallest and
            then update smallest element
             */
            if(arr[i]<s){
                ss = s;
                s = arr[i];
            }
            /*
            this is a very imp condition to check
            if the current element is greater than smallest and smaller than second smallest
            then update second smallest

            if this condition is not checked
             - will have second smallest as Long.MAX_VALUE only, and it will not update when the minimum element is the first element itself
             - so then the ans would be [-1, -1] which will be wrong

            if(arr[i]>s) is not checked here
                - then smallest and second smallest will be the same element when arr = [1,1,1,1,1]
                - and this answer is wrong
             */
            else if(arr[i]>s && arr[i]<ss){
                ss = arr[i];
            }
        }
        if(ss == Long.MAX_VALUE){
            ans[0] = -1;
            ans[1] = -1;
        }
        else{
            ans[0] = s;
            ans[1] = ss;
        }
        return ans;
    }
}
