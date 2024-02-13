package L18_Arrays_Practice1.Class;

public class Leetcode_485_MaxConsecutiveOnes {
    //https://leetcode.com/problems/max-consecutive-ones/description/
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,0,0,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
        System.out.println(findMaxConsecutiveOnesAnotherImplementation(nums));
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        //TC=O(n)
        //SC=O(1)
        int maxLength = 0, i = 0, j = 0, n = nums.length;
        while(j<=n){
            if(j<n && nums[j] == 1){
                j++;
            }
            else{
                maxLength = Math.max(maxLength, j-i);
                j++;
                i = j;
            }
        }
        return maxLength;
    }

    private static int findMaxConsecutiveOnesAnotherImplementation(int[] nums) {
        //TC=O(n)
        //SC=O(1)
        int maxLength = 0, i = 0, j = 0, n = nums.length;
        while(j<=n){
            while(j<n && nums[j] == 1){
                j++;
            }
            maxLength = Math.max(maxLength, j-i);
            j++;
            i = j;
        }
        return maxLength;
    }
}
