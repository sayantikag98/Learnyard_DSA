package L23_Arrays_Practice6.Class;

import java.util.Arrays;

public class Leetcode_581_ShortestUnsortedContinuousSubarray {
    //https://leetcode.com/problems/shortest-unsorted-continuous-subarray/description/
    public static void main(String[] args) {
        int[] nums = {2,6,4,8,10,9,15};
        System.out.println(findUnsortedSubarrayWithSortedArray(nums));
        System.out.println(findUnsortedSubarrayWithoutSorting(nums));
    }

    private static int findUnsortedSubarrayWithSortedArray(int[] nums) {
        int n = nums.length;
        int[] helper = new int[n];
        System.arraycopy(nums, 0, helper, 0, n);
        Arrays.sort(helper);
        int count = 0, start = -1, end = -1;
        for(int i = 0; i<n; i++){
            if(helper[i] != nums[i]){
                if(start == -1) start = i;
                end = i;
            }
        }
        return end == -1 ? 0 : end-start+1;
    }

    private static int findUnsortedSubarrayWithoutSorting(int[] nums) {
        //TC=>O(n)
        //SC=>O(1)
        int n = nums.length;
        if(n==1) return 0;
        int i = 1; // i represents the first breakpoint from left
        while(i<n && nums[i-1]<=nums[i]) i++;
        if(i == n) return 0;
        int j = n-2; // j represent the second breakpoint from right
        while(j>=0 && nums[j]<=nums[j+1]) j--;
        //find the smallest and largest in the window from i to j
        int min = i, max = i;
        for(int k = i+1; k<=j; k++){
            if(nums[min]>nums[k]){
                min = k;
            }
            if(nums[max]<nums[k]){
                max = k;
            }
        }
        //ideally nums[i-1]<=nums[min] and nums[max]<=nums[j+1]
        while(i-1>=0 && nums[i-1]>nums[min]){
            if(nums[max]<nums[i-1]) max = i-1;
            i--;
        }
        while(j+1<n && nums[max]>nums[j+1]){
            if(nums[min]>nums[j+1]) min = j+1;
            j++;
        }
        while(i-1>=0 && nums[i-1]>nums[min]){
            if(nums[max]<nums[i-1]) max = i-1;
            i--;
        }

        return j-i+1;
    }
}
