package L20_Arrays_Practice3.Class;

public class Leetcode_53_MaximumSubarray_KadaneAlgo {
    //https://leetcode.com/problems/maximum-subarray/
    public static void main(String[] args) {
        System.out.println(maxSubArrayBruteForce(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(maxSubArrayAnotherBruteForce(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(maxSubArrayKadaneAlgo(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    private static int maxSubArrayKadaneAlgo(int[] nums) {
        //TC => O(n)
        //SC => O(1)
        int maxSum = Integer.MIN_VALUE, sum = 0;
        for(int ele: nums){
            sum+=ele;
            maxSum = Math.max(maxSum, sum);
            if(sum<0) sum = 0;
        }
        return maxSum;
    }

    private static int maxSubArrayAnotherBruteForce(int[] nums) {
        //TC => O(n^2)
        //SC => O(1)
        int maxSum = Integer.MIN_VALUE, n = nums.length;
        for(int i = 0; i<n; i++){
            int sum = 0;
            for(int j = i; j<n; j++){
                sum+=nums[j];
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }

    private static int maxSubArrayBruteForce(int[] nums) {
        //TC => O(n^3)
        //SC => O(1)
        int maxSum = Integer.MIN_VALUE, n = nums.length;
        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
                int sum = 0;
                for(int k = i; k<=j; k++){
                    sum+=nums[k];
                }
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }

}
