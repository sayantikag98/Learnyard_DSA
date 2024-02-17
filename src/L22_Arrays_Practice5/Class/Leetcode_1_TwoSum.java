package L22_Arrays_Practice5.Class;
import java.util.Arrays;
import java.util.HashMap;

public class Leetcode_1_TwoSum {
    //https://leetcode.com/problems/two-sum/
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3,3}, 6)));
    }

    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int search = target - nums[i];
            if(hm.containsKey(search)){
                return new int[]{hm.get(search), i};
            }
            hm.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
