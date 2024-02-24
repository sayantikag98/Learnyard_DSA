package L23_Arrays_Practice6.Practice;

public class Leetcode_45_JumpGameII {
    //https://leetcode.com/problems/jump-game-ii/
    public static void main(String[] args) {
        System.out.println(jump(new int[]{2,3,0,1,4}));
    }

    private static int jump(int[] nums) {
        //TC=>O(n^2)
        //SC=>O(1) //input array modified

        /*
        for every index in nums store the minimum ways to reach the end
        for any index i to get the minimum ways
            we iterate from i+1 to i+nums[i] and get the minimum value if nums[i] is not zero
            with the minimum value add 1 and store it in nums[i]
            if nums[i] is zero then store nums[i] with Integer.MAX_VALUE for calculating minimum for previous index
         */
        int n = nums.length;
        nums[n-1] = 0;
        for(int i = n-2; i>=0; i--){
            int min = Integer.MAX_VALUE;
            for(int j = 1; j<=nums[i] && i+j<n; j++){
                min = Math.min(min, nums[i+j]);
            }
            if(min != Integer.MAX_VALUE) nums[i] = min+1;
            else nums[i] = min;
        }
        return nums[0];
    }

}
