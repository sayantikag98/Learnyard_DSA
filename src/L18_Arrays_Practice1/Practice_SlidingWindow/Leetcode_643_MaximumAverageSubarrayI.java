package L18_Arrays_Practice1.Practice_SlidingWindow;

public class Leetcode_643_MaximumAverageSubarrayI {
    //https://leetcode.com/problems/maximum-average-subarray-i/description/
    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1,2,3,4}, 2));
    }

    private static double findMaxAverage(int[] nums, int k) {
        //************************** CAUTION ********************************************
        //-Double.MAX_VALUE is the lowest negative number you can represent with a double
        //Double.MIN_VALUE is the least positive value with double so its positive
        //************************** CAUTION ********************************************
        //TC=>O(n)
        //SC=>O(1)
        int i = 0, j = 0;
        double sum = 0, maxSum = -Double.MAX_VALUE; //maxAvg can also be taken as 1e5 because of the constraint given in the question
        while(j<nums.length){
            sum+=nums[j];
            if(j>=k){
                sum-=nums[i];
                i++;
            }
            if(j>=k-1){
                maxSum = Math.max(maxSum, sum);
            }
            j++;
        }
        return maxSum/k;
    }
}
