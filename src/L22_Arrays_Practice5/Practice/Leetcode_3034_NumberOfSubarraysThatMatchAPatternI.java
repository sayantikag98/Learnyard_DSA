package L22_Arrays_Practice5.Practice;

public class Leetcode_3034_NumberOfSubarraysThatMatchAPatternI {
    //https://leetcode.com/problems/number-of-subarrays-that-match-a-pattern-i/description/
    public static void main(String[] args) {
        int[] nums = {1,4,4,1,3,5,5,3}, pattern = {1,0,-1};
        System.out.println(countMatchingSubarrays(nums, pattern));
        System.out.println(countMatchingSubarrays(nums, pattern));
    }
    private static int countMatchingSubarrays(int[] nums, int[] pattern) {
        //TC=>O(n^2)
        //SC=>O(1)
        int n = nums.length, p = pattern.length, count = 0;
        int i = 0, j = p;
        //maintain the window size of p+1
        while(j<n){
            int idx = 0;
            boolean subArrayMatched = true;

            //traverse each subarray
            for(int k = i+1; k<=j; k++){
                if(pattern[idx] == 1){
                    if(nums[k]<=nums[k-1]){
                        subArrayMatched = false;
                        break;
                    }
                }
                else if(pattern[idx] == 0){
                    if(nums[k]!=nums[k-1]){
                        subArrayMatched = false;
                        break;
                    }
                }
                else{
                    if(nums[k]>=nums[k-1]){
                        subArrayMatched = false;
                        break;
                    }
                }
                idx++;
            }
            if(subArrayMatched) count++;
            i++;
            j++;
        }
        return count;
    }
    public int countMatchingSubarraysAnotherImplementation(int[] nums, int[] pattern) {
        int count = 0;
        //maintain the window size of p+1
        for(int i = 0, j = pattern.length; j<nums.length; i++, j++){
            boolean subArrayMatched = true;
            //traverse each subarray
            for(int k = i+1, idx = 0; k<=j; k++, idx++){
                if(pattern[idx] == 1 && nums[k]<=nums[k-1]){
                    subArrayMatched = false;
                    break;
                }
                else if(pattern[idx] == 0 && nums[k]!=nums[k-1]){
                    subArrayMatched = false;
                    break;
                }
                else if(pattern[idx] == -1 && nums[k]>=nums[k-1]){
                    subArrayMatched = false;
                    break;
                }
            }
            if(subArrayMatched) count++;
        }
        return count;
    }
}
