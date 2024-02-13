package L20_Arrays_Practice3.Practice;

public class Leetcode_2765_LongestAlternatingSubarray {
    //https://leetcode.com/problems/longest-alternating-subarray/description/
    public static void main(String[] args) {
        System.out.println(alternatingSubarray(new int[]{64,65,64,65,64,65,66,65,66,65}));
    }

    private static int alternatingSubarray(int[] nums) {
        //sliding window
        //TC=>O(n)
        //SC=>O(1)
        int maxLen = -1, diff = 1, i = 0, j = 1;
        while(j<nums.length){
            //if the difference is not 1 or -1 then just increment j and i with i = j-1
            // and skip the rest part and start with the next iteration
            if(nums[j] - nums[j-1] != -1 && nums[j] - nums[j-1] != 1){
                i=j++; //MADE MISTAKE at the start of any probable subarray i should always be j-1
                continue;
            }

            //i represents the start of the subarray and j represents next to the end of subarray
            /*
            conditions for breaking out of this while loop
            1. j is out of bound
            2. nums[j] - nums[j-1] is equal 1 and diff is -1 => in this case start with the new subarray
                with j kept at its place and i = j-1 and diff = 1
            3. nums[j] - nums[j-1] is equal -1 and diff is 1 => in this case just increment j till
                nums[j] - nums[j-1] is equal 1
             */
            while(j<nums.length && nums[j] - nums[j-1] == diff){
                j++;
                diff*=-1;
            }

            //whenever updating maxLen keep this check of j-1>1
            if(j-i>1) maxLen = Math.max(maxLen, j-i); //MADE MISTAKE


            //when nums[j] - nums[j-1] is equal -1 and diff is 1 just increment j till nums[j] - nums[j-1] is equal 1
            while(j<nums.length && nums[j] - nums[j-1] == -1 && diff == 1){
                j++;
            }

            //consider a new subarray
            //nums[j] - nums[j-1] is equal 1 but diff is -1 or nums[j] - nums[j-1] is equal 1 and also diff is 1
            i= j-1; //MADE MISTAKE at the start of any probable subarray i should always be j-1
            diff=1; //update diff to 1 at the start of any probable subarray
        }
        return maxLen;
    }
}
