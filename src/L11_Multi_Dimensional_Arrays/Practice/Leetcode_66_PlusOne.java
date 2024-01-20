package L11_Multi_Dimensional_Arrays.Practice;
import java.util.Arrays;

public class Leetcode_66_PlusOne {
    //https://leetcode.com/problems/plus-one/description/
    public static void main(String[] args) {
        int[] digits = {9,6,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    private static int[] plusOne(int[] digits) {
        /*
        1. for every ith place digit check if it's less than 9, if it is then increment
            that digit and return and if it is equal to 9 then make that place digit as zero
        2.  Eventually if the digits is not returned then all will be zero in the array then
            create a new array of length one more than digits and place one in the 0th index
         */
        for(int i = digits.length - 1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] ans = new int[digits.length+1];
        ans[0] = 1;
        return ans;
    }
}
