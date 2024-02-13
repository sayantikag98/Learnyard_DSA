package L17_ArrayList.Practice;

import java.util.Arrays;

public class Leetcode_2965_FindMissingAndRepeatingValues {
    //https://leetcode.com/problems/find-missing-and-repeated-values/description/
    public static void main(String[] args) {
        int[][] grid = {{9,1,7},{8,9,2},{3,4,6}};
        System.out.println(Arrays.toString(findMissingAndRepeatedValuesUsingXOR(grid)));
        System.out.println(Arrays.toString(findMissingAndRepeatedValuesUsingMathematicalCalculation(grid)));
    }

    private static int[] findMissingAndRepeatedValuesUsingXOR(int[][] grid) {
        //TC=>O(n)
        //SC=>O(1)
        int xor = 0, n = grid.length*grid.length;
        for(int[] arr: grid){
            for(int val: arr){
                xor^=val;
            }
        }
        for(int i = 1; i<=n; i++){
            xor^=i;
        }

        int rightmostBitSet = xor&(-xor);

        int setBitXor = 0, unsetBitXor = 0;
        for(int[] arr: grid){
            for(int val: arr){
                if((val&rightmostBitSet)!=0) setBitXor^=val;
                else unsetBitXor^=val;
            }
        }

        for(int i = 1; i<=n; i++){
            if((i&rightmostBitSet)!=0) setBitXor^=i;
            else unsetBitXor^=i;
        }

        int missingNo = -1, repeatingNo = -1;

        for(int[] arr: grid){
            for(int val: arr){
                if(val == setBitXor){
                    repeatingNo = val;
                    break;
                }
            }
        }

        if(repeatingNo == -1){
            repeatingNo = unsetBitXor;
            missingNo = setBitXor;
        }
        else{
            missingNo = unsetBitXor;
        }

        return new int[]{repeatingNo, missingNo};

    }

    private static int[] findMissingAndRepeatedValuesUsingMathematicalCalculation(int[][] grid) {
        int val1 = 0, val2 = 0, count = 0;
        for(int[] arr: grid){
            for(int val: arr){
                ++count;
                val1+=(val-count);
                val2+=(val*val - count*count);
            }
        }
        int missingNo = (val2 - val1*val1)/(2*val1), repeatingNo = val1 + missingNo;
        return new int[]{repeatingNo, missingNo};
    }
}
