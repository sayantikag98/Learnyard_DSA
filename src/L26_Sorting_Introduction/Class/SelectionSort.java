package L26_Sorting_Introduction.Class;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {10,6,2,5,4,3,4,67};
        selectionSortStableVersion(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void selectionSortStableVersion(int[] nums) {
        //this algo for selection sort is stable
        for(int i = 0; i<nums.length-1; i++){
            int min = i;
            for(int j = i+1; j<nums.length; j++){
                if(nums[min]>nums[j]) min = j;
            }
            int temp = nums[min];
            for(int j = min; j>i; j--){
                nums[j] = nums[j-1];
            }
            nums[i] = temp;
        }
    }

    private static void selectionSort(int[] nums) {
        //TC=>O(n^2)
        //SC=>O(1)
        //this algo for selection sort is unstable
        for(int i = 0; i<nums.length-1; i++){
            int min = i;
            for(int j = i+1; j<nums.length; j++){
                if(nums[min]>nums[j]){
                    min = j;
                }
            }
            if(min != i){
                int temp = nums[min];
                nums[min] = nums[i];
                nums[i] = temp;
            }
        }
    }
}
