package L17_ArrayList.Practice;

import java.util.Arrays;
import java.util.HashSet;

public class GFG_FindMissingAndRepeating {
    //https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1

    public static void main(String[] args) {
        int[] nums = {13, 33, 43, 16, 25, 19, 23, 31, 29, 35, 10, 2, 32, 11, 47, 15, 34, 46, 30, 26, 41, 30, 5, 17, 37, 39, 6, 4, 20, 27, 9, 3, 8, 40, 24, 44, 14, 36, 7, 38, 21, 1, 42, 12, 28, 22, 45};
        System.out.println(Arrays.toString(findTwoElementUsingArray(nums, nums.length)));
        System.out.println(Arrays.toString(findTwoElementUsingHashSet(nums, nums.length)));
        System.out.println(Arrays.toString(findTwoElementInPlace(nums, nums.length)));
        System.out.println(Arrays.toString(findTwoElementUsingMathematicalFormula(nums, nums.length)));
        System.out.println(Arrays.toString(findTwoElementUsingXOR(nums, nums.length)));
    }

    private static int[] findTwoElementUsingArray(int[] nums, int n) {
        //TC => O(n)
        //SC => O(n)
        boolean[] isPresent = new boolean[n];
        int missingNo = -1, repeatingNo = -1;
        for(int ele: nums){
            if(isPresent[ele-1]) repeatingNo = ele;
            isPresent[ele-1] = true;
        }
        for(int i = 0; i<n; i++){
            if(!isPresent[i]){
                missingNo = i+1;
                break;
            }
        }
        return new int[]{repeatingNo, missingNo};
    }

    private static int[] findTwoElementUsingHashSet(int[] nums, int n) {
        //TC => O(n)
        //SC => O(n)
        HashSet<Integer> hs = new HashSet<>();
        int missingNo = -1, repeatingNo = -1;
        for(int ele: nums){
            if(hs.contains(ele)) repeatingNo = ele;
            hs.add(ele);
        }
        for(int i = 1; i<=n; i++){
            if(!hs.contains(i)){
                missingNo = i;
                break;
            }
        }
        return new int[]{repeatingNo, missingNo};
    }

    private static int[] findTwoElementInPlace(int[] nums, int n){
        //TC => O(n)
        //SC => O(1)
        /*
        Traverse through the array and at each index i, go to index Math.abs(nums[i])-1 and make to negative if not negative.
        If there is already a negative number at that index then it is the repeating element
        Again traverse the array and find the positive number which would be the missing element.
         */
        int missingNo = -1, repeatingNo = -1;
        for(int i = 0; i<n; i++){
            int idx = Math.abs(nums[i]) - 1;
            if(nums[idx]<0){
                repeatingNo = idx + 1;
            }
            else{
                nums[idx] *= -1;
            }
        }
        for(int i = 0; i<n; i++){
            if(nums[i]>0){
                missingNo = i+1;
            }
            else{
                nums[i] *= -1;
            }
        }
        return new int[]{repeatingNo, missingNo};
    }

    private static int[] findTwoElementUsingMathematicalFormula(int[] nums, int n) {
        //TC => O(n)
        //SC => O(1)
        /*
        a+c+2b - a-b-c-d = val1
        => b-d = val1 ------- eq1

        a^2+2b^2+c^2-a^2-b^2-c^2-d^2
        =>b^2-d^2 = val2
        =>(b+d)(b-d) = val2
        =>b+d = val2/val1 ------- eq2

        Solving eq1 and eq2,
        b = repeating no = (val2 + val1^2)/2*val1
        d = missing no = (val2 - val1^2)/2*val1

        ************* THIS APPROACH HAS A BIGGER PROBLEM OF OVERFLOW. SO CODE CAREFULLY **************


        ************* PLEASE AVOID THIS METHOD IN INTERVIEW ********************
         */

        long val1 = 0, val2 = 0;
        for(int i = 1; i<=n; i++){
            val1+=(nums[i-1]-i);
            val2+=((long)nums[i-1]*nums[i-1] - (long)i*i);
        }
        int missingNo = (int)((val2 - val1*val1)/(2*val1)), repeatingNo = (int)val1 + missingNo;
        return new int[]{repeatingNo, missingNo};

//        long sumOfN = 0, sumOfSquaresOfN = 0;
//
//        for(int i = 0; i<n; i++){
//            sumOfN+=nums[i];
//            sumOfSquaresOfN+=(long)nums[i]*nums[i];
//        }
//
//        long sumOfFirstNNaturalNo = (long)n*(n+1)/2,
//                sumOfSquaresOfFirstNNaturalNo = (long)n*(n+1)*((long)2*n+1)/6,
//                val1 = sumOfN - sumOfFirstNNaturalNo,
//                val2 = sumOfSquaresOfN - sumOfSquaresOfFirstNNaturalNo;
//
//        int missingNo = (int)((val2 - val1 * val1)/(2*val1)),
//                repeatingNo = (int)(missingNo + val1);
//
//        return new int[]{repeatingNo, missingNo};
    }

    private static int[] findTwoElementUsingXOR(int[] nums, int n){
        //TC=>O(n)
        //SC=>O(1)

        int xor = 0;

        //finding xor of all elements of the array and the numbers from 1 to n
        //this will give the xor of missing and repeating element
        for(int i = 1; i<=n; i++){
            xor^=nums[i-1]^i;
        }

        //num&(~(num-1)) => will generate the number with only the rightmost bit as set
        //~(num-1) = -num because negative no is represented in 2's complement
        //num&(~(num-1)) can be simplified as num&(-num)
        int setBitPos = xor&(-xor);

        //divide all the numbers of the array and the numbers from 1 to n in two groups based on the rightmost set bit as set or unset
        //take xor of all those numbers in the two groups

        int bitSet = 0, bitUnset = 0;
        for(int i = 1; i<=n; i++){
            if((nums[i-1] & setBitPos) != 0) bitSet^=nums[i-1];
            else bitUnset^=nums[i-1];
            if((i & setBitPos) != 0) bitSet^=i;
            else bitUnset^=i;
        }

        //iterate in the array to find which xor value is repeating and which is missing

        int missingNo = -1, repeatingNo = -1;

        for(int i = 0; i<n; i++){
            if(nums[i] == bitSet){
                repeatingNo = nums[i];
                break;
            }
        }
        if(repeatingNo == -1){
            missingNo = bitSet;
            repeatingNo = bitUnset;
        }
        else{
            missingNo = bitUnset;
        }
        return new int[]{repeatingNo, missingNo};
    }
}
