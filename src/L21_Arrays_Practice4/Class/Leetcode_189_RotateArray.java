package L21_Arrays_Practice4.Class;

import java.util.Arrays;

public class Leetcode_189_RotateArray {
    //https://leetcode.com/problems/rotate-array/description/
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 8;
//        rotateBruteForce(nums, k);
        rotateByReverse(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    private static void rotateByReverse(int[] nums, int k) {
        int n = nums.length;
        k%=n;
        if(k<0) k+=n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }

    private static void reverse(int[] nums, int i, int j){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    private static void rotateBruteForce(int[] nums, int k) {
        int n = nums.length;
        k%=n;
        if(k<0) k+=n;
        while(k-->0){
            int temp = nums[n-1];
            for(int i = n-2; i>=0; i--){
                nums[i+1] = nums[i];
            }
            nums[0] = temp;
        }
    }
}
