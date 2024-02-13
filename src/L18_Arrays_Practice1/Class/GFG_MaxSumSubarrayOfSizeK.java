package L18_Arrays_Practice1.Class;
import java.util.ArrayList;
import java.util.List;

public class GFG_MaxSumSubarrayOfSizeK {
    //https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
    public static void main(String[] args) {
        System.out.println(maximumSumSubarray(2, new ArrayList<>(List.of(4,3,2,1)), 4));
    }

    private static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){

        //sliding window approach
        //TC=>O(N)
        //SC=>O(1)
        int i = 0, j = 0;
        long sum = 0;

        //sum of first window
        while(j<N && j-i<K){
            sum+=Arr.get(j++);
        }

        long maxSum = sum;

        //every time the window moves add the last element of the new window and subtract the first element of the last window
        //and check whether the running sum of the window is maximum or not
        while(j<N){
            sum+=Arr.get(j++)-Arr.get(i++);
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
