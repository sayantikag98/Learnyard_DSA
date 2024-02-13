package L20_Arrays_Practice3.Class;

public class Leetcode_1004_MaxConsecutiveOnesIII {
    //https://leetcode.com/problems/max-consecutive-ones-iii/
    public static void main(String[] args) {
        System.out.println(longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2));
        System.out.println(longestOnesShorterImplementation(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2));
    }

    private static int longestOnes(int[] nums, int k) {
        /*
        VARIABLE SLIDING WINDOW
        ------------------------
        l and r pointer controlling the size of window
        incrementing r pointer and keeping the l pointer at its place increases the size of the window
        incrementing l pointer and keeping the r pointer at its place decreases the size of the window

        concept of valid window here => the window in which the count of zero is atmost k

        Here the approach of the problem is:
        1. At every iteration check whether the number is 1 or 0.
        2. If the number is 1 then simply increase the size of window by incrementing the right pointer
        3. If the number is 0 then check the count of zero encountered so far, if that count is atmost k then it is a valid window,
            then simply increase the size of window by incrementing the right pointer, but if the count of 0 encountered
            so far is greater than k then it becomes an invalid window, so we should decrease the size of window by
            incrementing the left pointer. The left pointer should be increased such that the current window contains exactly
            k 0's i.e. we should increment the left pointer till we get a zero, then increment the left pointer just by one index.
        4. At every valid window get the size of the window and update the maxLength accordingly if it is the maximum.
         */
        int l = 0, r = 0, count = 0, maxLength = 0;
        while(r<nums.length){
            if(nums[r] == 1 || (nums[r] == 0 && count < k)){
                //valid window so update maxLength
                maxLength = Math.max(maxLength, r-l+1);
                if(nums[r] == 0) count++;
            }
            else{
                //increment l pointer till we get a 0
                while(nums[l] == 1) l++;
                l++;
                //now after incrementing l pointer the window becomes valid so update maxLength
                maxLength = Math.max(maxLength, r-l+1);
            }
            r++; //MADE MISTAKE => r pointer should be incremented at every iteration
        }
        return maxLength;
    }

    private static int longestOnesShorterImplementation(int[] nums, int k) {
        //TC=>O(N)
        //SC=>O(1)
        int maxLength = 0;
        for(int l = 0, r = 0; r<nums.length; r++){
            if(nums[r] == 0) k--;
            if(k<0){
                while(nums[l] == 1) l++;
                l++;
                k++;
            }
            maxLength = Math.max(maxLength, r-l+1);
        }
        return maxLength;
    }
}
