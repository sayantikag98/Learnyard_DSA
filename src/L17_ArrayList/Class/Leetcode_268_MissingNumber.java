package L17_ArrayList.Class;
import java.util.Arrays;

public class Leetcode_268_MissingNumber {
    //https://leetcode.com/problems/missing-number/
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumberUsingArray(nums));
        System.out.println(missingNumberUsingNestedLoop(nums));
        System.out.println(missingNumberUsingSorting(nums));
        System.out.println(missingNumberWithoutExtraSpace(nums));
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
