package L20_Arrays_Practice3.Practice;

import java.util.Arrays;

public class Leetcode_2149_RearrangeArrayElementsBySign {
    //https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }

    private static int[] rearrangeArray(int[] nums) {
        //TC=>O(n)
        //SC=>O(n)
        int n = nums.length;
        int[] ans = new int[n];
        for(int k = 0, i = 0, j = 0; k<n; k+=2){
            //moving the ith pointer till it reaches a positive number
            while(nums[i]<0) i++;
            //moving the jth pointer till it reaches a negative number
            while(nums[j]>=0) j++;
            ans[k] = nums[i++];
            ans[k+1] = nums[j++];
        }
        return ans;
    }
}
