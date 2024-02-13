package L18_Arrays_Practice1.Practice_TwoPointer;

import java.util.Arrays;

public class Leetcode_977_SquaresOfASortedArray {
    //https://leetcode.com/problems/squares-of-a-sorted-array/description/
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -2, 2, 5})));
    }

    /*
    However, it is not always a good idea to overwrite inputs.
    Remember that because we passed it by reference, the original
    is actually lost. Often functions like this are a part of an API,
    and in a lot of cases, nobody wants an API that clobbers their input.

    I think it's best to ask your interviewer if they want something
    done in-place or not. It is a common misconception that we should
    always be trying to do things in-place, overwriting the inputs.

    So, is this O(1) space or O(n) space? Arguments can be made either
    way, sometimes people say to count the output data stucture in the
    calculation, and sometimes they don't. If we're talking about
    auxillary space, we generally don't count the output data structure,
    which would make it O(1). I think this is a more accurate way of
    putting it -- we are trying to measure what the algorithm itself
    is using, not just what the inevitable size of the output is. But
    it's important to be clear in interviews what you are and aren't counting.
     */

    private static int[] sortedSquares(int[] nums) {
        //TC=>O(n)
        //SC=>O(n)
        int n = nums.length, i = 0, j = n-1;
        int[] sqArr = new int[n];
        for(int k = n-1; k>=0; k--){
            if(Math.abs(nums[j]) >= Math.abs(nums[i])){
                sqArr[k] = nums[j] * nums[j--];
            }
            else{
                sqArr[k] = nums[i] * nums[i++];
            }
        }
        return sqArr;
    }
}
