package L19_Arrays_Practice2.Class;

import java.util.Arrays;

public class Leetcode_1480_RunningSumOf1DArray {
    //https://leetcode.com/problems/running-sum-of-1d-array/
    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSumBruteForce(new int[] {1,2,3})));
        System.out.println(Arrays.toString(runningSum(new int[] {1,2,3})));
    }

    private static int[] runningSumBruteForce(int[] nums) {
        //TC=>O(n^2)
        //SC=>O(n)
        int[] ans = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            int sum = 0;
            for(int j = 0; j<=i; j++){
                sum+=nums[j];
            }
            ans[i] = sum;
        }
        return ans;
    }

    private static int[] runningSum(int[] nums) {
        //TC=>O(n)
        //SC=>O(1)
        for(int i = 1; i<nums.length; i++){
            nums[i]+=nums[i-1];
        }
        return nums;
    }
}
