package L22_Arrays_Practice5.Practice;

public class Leetcode_2256_MinimumAverageDifference {
    //https://leetcode.com/problems/minimum-average-difference/description/
    public static void main(String[] args) {
        System.out.println(minimumAverageDifference(new int[]{2,5,3,9,5,3}));
    }

    private static int minimumAverageDifference(int[] nums) {
        /*
        1. In case of division, do check if it is getting divided by zero
        2. prefixSum and suffixSum overflows for int in the given constraint, so take long
         */

        //TC=>O(n)
        //SC=>O(1)
        int n = nums.length;
        if(n == 1) return 0; //MADE MISTAKE
        int minAvgDiffIdx = 0;
        long minAvgDiff, prefixSum = nums[0], suffixSum = 0;
        for(int i = n-1; i>0; i--){
            suffixSum+=nums[i];
        }
        minAvgDiff = Math.abs(prefixSum - suffixSum/(n-1)); //MADE MISTAKE
        for(int i = 1; i<n; i++){
            prefixSum+=nums[i];
            suffixSum-=nums[i];
            long avgDiff = prefixSum/(i+1); //MADE MISTAKE
            if(i!=n-1) avgDiff = Math.abs(avgDiff - suffixSum/(n-i-1)); //MADE MISTAKE
            if(minAvgDiff>avgDiff){
                minAvgDiff = avgDiff;
                minAvgDiffIdx = i;
            }
        }
        return minAvgDiffIdx;
    }
}
