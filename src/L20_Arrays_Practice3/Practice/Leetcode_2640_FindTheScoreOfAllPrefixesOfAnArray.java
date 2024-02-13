package L20_Arrays_Practice3.Practice;

import java.util.Arrays;

public class Leetcode_2640_FindTheScoreOfAllPrefixesOfAnArray {
    //https://leetcode.com/problems/find-the-score-of-all-prefixes-of-an-array/description/
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findPrefixScore(new int[]{1,1,2,4,8,16})));
    }
    private static long[] findPrefixScore(int[] nums) {
        //TC=>O(n)
        //SC=>O(n)
        int n = nums.length;
        long[] score = new long [n];
        long maxSoFar = nums[0];
        score[0]= 2*maxSoFar;
        for(int i = 1; i<n; i++){
            maxSoFar = Math.max(maxSoFar, nums[i]);
            score[i] = score[i-1] + maxSoFar + nums[i];
        }
        return score;
    }
}
