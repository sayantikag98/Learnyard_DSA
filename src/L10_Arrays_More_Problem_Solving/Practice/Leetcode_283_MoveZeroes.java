package L10_Arrays_More_Problem_Solving.Practice;
import java.util.Scanner;
import java.util.Arrays;

public class Leetcode_283_MoveZeroes {
    //https://leetcode.com/problems/move-zeroes/description/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        moveZeroes(arr);
    }

    private static void moveZeroes(int[] nums) {
        int i = 0, j = 0, n = nums.length;
        while(i<n && j<n){
            /*
            if nums[j] is equal to 0 then increment j
            otherwise
                if nums[i] is equal to 0 then swap and increment i & j
                if nums[i] is not equal to 0 then increment i & j
             */
            if(nums[j] != 0) {
                if(nums[i] == 0){
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
                i++;
            }
            j++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
