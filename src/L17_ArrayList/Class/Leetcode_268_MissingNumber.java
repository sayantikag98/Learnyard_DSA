package L17_ArrayList.Class;
import java.util.Arrays;

public class Leetcode_268_MissingNumber {
    //https://leetcode.com/problems/missing-number/
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumberUsingXOR(nums));
        System.out.println(missingNumberUsingSum(nums));
        System.out.println(missingNumberUsingArray(nums));
        System.out.println(missingNumberUsingNestedLoop(nums));
        System.out.println(missingNumberUsingSorting(nums));
        System.out.println(missingNumberWithoutExtraSpace(nums));
    }

    private static int missingNumberUsingXOR(int[] nums){
        /*
        Properties:
        A^0 = A
        A^A = 0
        A^A^B^B^C^D^D = 0^0^C^0 = C

        Approach: Take xor of all elements in the given array and xor it with the xor of all indices from 0 to length of array.
                  This would be the missing element.

         */
        int ans = nums.length;
        for(int i = 0; i<nums.length; i++){
            ans^=nums[i]^i;
        }
        return ans;
    }

    private static int missingNumberUsingSum(int[] nums){
        /*
        1. Take the sum of all elements of the array (s1)
        2. Take the sum of first n natural numbers where n is the length of the array (s2)
        3. Missing element = s2-s1
         */
        int sum = 0, n = nums.length;
        for(int val: nums){
            sum+=val;
        }
        return (n*(n+1))/2 - sum;
    }

    private static int missingNumberWithoutExtraSpace(int[] nums){
        //TC =>O(n)
        //SC =>O(1)
        int lastEle = 1;
        for(int val: nums){
            int index = val<0 ? Math.abs(val)-1 : val;
            if(index == nums.length){
                lastEle = (lastEle+1)*-1;
            }
            else{
                nums[index] = (nums[index]+1)*-1;
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>=0) return i;
        }
        return nums.length;
    }

    private static int missingNumberUsingSorting(int[] nums){
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != i) return i;
        }
        return nums.length;
    }


    private static int missingNumberUsingArray(int[] nums) {
        //TC => O(n)
        //SC => O(n)
        boolean[] isPresent = new boolean [nums.length+1];
        for(int val: nums){
            isPresent[val]= true;
        }
        for(int i = 0; i<isPresent.length; i++){
            if(!isPresent[i]) return i;
        }
        return -1;
    }

    private static int missingNumberUsingNestedLoop(int[] nums){
        //TC => O(n^2)
        //SC => O(1)
        int n = nums.length;
        for(int i = 0; i<=n; i++){
            boolean isFound = false;
            for(int val: nums){
                if(val == i){
                    isFound = true;
                    break;
                }
            }
            if(!isFound) return i;
        }
        return -1;
    }
}
