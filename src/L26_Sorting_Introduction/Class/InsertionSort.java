package L26_Sorting_Introduction.Class;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {2,6,2,5,4,3,4,67};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void insertionSort(int[] nums){
        //TC=>O(n^2)
        //SC=>O(1)
        for(int i = 1; i<nums.length; i++){
            int temp = nums[i], j = i-1;
            while(j>=0 && nums[j]>temp){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = temp;
        }
    }
}
