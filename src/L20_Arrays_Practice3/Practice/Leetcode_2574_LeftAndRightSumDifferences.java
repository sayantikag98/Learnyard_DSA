package L20_Arrays_Practice3.Practice;

import java.util.Arrays;

public class Leetcode_2574_LeftAndRightSumDifferences {
    //https://leetcode.com/problems/left-and-right-sum-differences/description/
    public static void main(String[] args) {
        System.out.println(Arrays.toString(leftRightDifference(new int[]{10,4,8,3})));
        System.out.println(Arrays.toString(leftRightDifferenceWithoutExtraSpace(new int[]{10,4,8,3})));
    }

    private static int[] leftRightDifferenceWithoutExtraSpace(int[] nums) {
        //TC=>O(n)
        //SC=>O(1)
        int n = nums.length, leftSum = 0, rightSum = 0;
        for(int ele: nums){
            rightSum+=ele;
        }
        for(int i = 0; i<n; i++){
            rightSum-=nums[i];
            int temp = nums[i];
            nums[i] = Math.abs(rightSum - leftSum);
            leftSum+=temp;
        }
        return nums;
    }

    private static int[] leftRightDifference(int[] nums) {
        //TC=>O(n)
        //SC=>O(n)
        int n = nums.length;
        int[] answer = new int[n];
        answer[0] = 0;
        for(int i = 1; i<n; i++){
            answer[i] = answer[i-1]+nums[i-1];
        }
        int sum = nums[n-1];
        for(int i = n-2; i>=0; i--){
            answer[i] = Math.abs(answer[i] - sum);
            sum+=nums[i];
        }
        return answer;
    }
}
