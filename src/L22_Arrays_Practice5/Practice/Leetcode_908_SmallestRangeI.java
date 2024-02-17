package L22_Arrays_Practice5.Practice;

public class Leetcode_908_SmallestRangeI {
    //https://leetcode.com/problems/smallest-range-i/description/
    public static void main(String[] args) {
        System.out.println(smallestRangeI(new int[]{7,3,5}, 3));
    }

    private static int smallestRangeI(int[] nums, int k) {
        //TC=>O(n)
        //SC=>O(1)
        int max = nums[0], min = nums[0];
        for(int i = 1; i<nums.length; i++){
            if(max<nums[i]) max = nums[i];
            if(min>nums[i]) min = nums[i];
        }
        return Math.max(0, max-min-2*k);
    }
}
