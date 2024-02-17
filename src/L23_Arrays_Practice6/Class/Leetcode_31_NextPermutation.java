package L23_Arrays_Practice6.Class;

import java.util.Arrays;

public class Leetcode_31_NextPermutation {
    //https://leetcode.com/problems/next-permutation/description/
    public static void main(String[] args) {
        int[] nums = {3,3,4,1};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
    private static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2;
        //find the first element from right which is smaller than its next element
        while(i>=0 && nums[i]>=nums[i+1]) i--;
        if(i == -1){
            reverse(nums, 0, n-1);
            return;
        }
        int j = n-1;
        //find the first element from the right which is strictly greater than the element found above
        while(j>i && nums[i]>=nums[j]) j--;
        swap(nums, i, j);
        reverse(nums, i+1, n-1);
    }

    private static void reverse(int[] nums, int i, int j){
        while(i<j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
