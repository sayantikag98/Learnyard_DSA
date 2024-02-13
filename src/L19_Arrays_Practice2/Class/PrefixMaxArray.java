package L19_Arrays_Practice2.Class;
import java.util.Arrays;

public class PrefixMaxArray {
    public static void main(String[] args) {
        int[] nums = {3,6,7,3,1,5,8},
        prefixMax = new int[nums.length];
        prefixMax[0] = nums[0];
        for(int i = 1; i<nums.length; i++){
            prefixMax[i] = Math.max(prefixMax[i-1], nums[i]);
        }
        System.out.println(Arrays.toString(prefixMax));
    }
}
