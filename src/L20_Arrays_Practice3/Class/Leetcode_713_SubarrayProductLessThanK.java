package L20_Arrays_Practice3.Class;

public class Leetcode_713_SubarrayProductLessThanK {
    //https://leetcode.com/problems/subarray-product-less-than-k/description/
    public static void main(String[] args) {
        System.out.println(numSubarrayProductLessThanK(new int[]{1,2,3}, 1));
    }

    private static int numSubarrayProductLessThanK(int[] nums, int k) {
        /*
        The idea is always keep a max-product-window less than K
        Every time shift window by adding a new number on the right(j),
        if the product is greater than k, then try to reduce numbers on the left(i),
        until the subarray product fit less than k again, (subarray could be empty);
        Each step introduces x new subarrays, where x is the size of the current window (j + 1 - i);

        For eg: Say the existing subarray of the previous window was {1,2,3} and now we add {4} into it.
        So the current window subarray becomes {1,2,3,4} and the size of the window becomes 4.
        The subarrays which has already been added was {1}, {2}, {3}, {1,2}, {2,3}, {1,2,3}. Now because of 4
        the number of new subarrays which would be added are {4}, {3,4}, {2,3,4}, {1,2,3,4} which is equal to
        the size of the window => right-left+1 => 3-0+1 => 4

        Similarly, if we remove 1 from the window 1,2,3,4 the number of new subarrays ({2,3,4}, {3,4}, {4})
        which would be added would be 3 which is again the size of the window (right-left+1) => 3-1+1 => 3
         */

        int noOfSubarray = 0, pdt = 1;
        //valid window => window having product strictly less than k
        for(int left=0, right=0; right<nums.length; right++){
            pdt*=nums[right];
            while(left<=right && pdt>=k){
                pdt/=nums[left];
                left++;
            }
            noOfSubarray+=right-left+1;
        }
        return noOfSubarray;
    }
}
