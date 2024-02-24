package L26_Sorting_Introduction.Class;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {2,6,2,5,4,3,4,67};
//        bubbleSort(nums);
        bubbleSortOptimized(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void bubbleSortOptimized(int[] nums){
        //this algo for bubble sort is an optimized version because of countSwaps
        //which counts the number of swaps in each inner iteration
        //if this swap count is zero then the array is already sorted no need to sort further
        for(int i = nums.length-2; i>=0; i--){
            int countSwaps = 0;
            for(int j = 0; j<=i; j++){
                if(nums[j]>nums[j+1]){
                    countSwaps++;
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            if(countSwaps == 0) return;
        }
    }

    private static void bubbleSort(int[] nums){
        //TC=>O(n^2)
        //SC=>O(1)
        //at each iteration correct element goes to its correct place
        //bubble sort is stable
        for(int i = nums.length-2; i>=0; i--){
            for(int j = 0; j<=i; j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}
