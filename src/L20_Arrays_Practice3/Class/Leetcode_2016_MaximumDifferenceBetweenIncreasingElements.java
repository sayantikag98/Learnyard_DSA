package L20_Arrays_Practice3.Class;

public class Leetcode_2016_MaximumDifferenceBetweenIncreasingElements {
    //https://leetcode.com/problems/maximum-difference-between-increasing-elements/description/

    public static void main(String[] args) {
        int[] nums = {9,4,3,1};
        System.out.println(maximumDifference(nums));
        System.out.println(maximumDifferenceSpaceOptimized(nums));
    }

    private static int maximumDifferenceSpaceOptimized(int[] nums) {
        //TC=>O(n)
        //SC=>O(1)
        int n = nums.length, maxDiff = -1, maxSoFar = nums[n-1];

        for(int i = n-2; i>=0; i--){

            //if nums[i] becomes maxSoFar then maxDiff should not change else update maxDiff
            if(nums[i]>=maxSoFar){
                maxSoFar = nums[i];
            }
            else{
                maxDiff = Math.max(maxDiff, maxSoFar-nums[i]);
            }
        }

        return maxDiff;
    }

    private static int maximumDifference(int[] nums) {
        //TC=>O(n)
        //SC=>O(n)

        /*
        1. Compute the next greater element for every element
        2. find max of nge[i]-nums[i]
         */
        int n = nums.length;
        int[] nge = new int[n];

        //last element's next greater element is -1
        nge[n-1] = -1;
        int maxSoFar = nums[n-1];

        for(int i = nums.length-2; i>=0; i--){
            //check whether the current element is strictly less than maxSoFar then next greater element is maxSoFar
            if(nums[i]<maxSoFar) nge[i] = maxSoFar;
            else{
                nge[i] = -1;
                maxSoFar = Math.max(maxSoFar, nums[i]);
            }
        }
        int maxDiff = -1;
        for(int i = 0; i<nums.length; i++){
            maxDiff = Math.max(maxDiff, nge[i] - nums[i]);
        }
        return maxDiff;
    }
}
