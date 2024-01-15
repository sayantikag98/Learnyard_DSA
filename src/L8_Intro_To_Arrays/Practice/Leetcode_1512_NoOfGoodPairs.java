package L8_Intro_To_Arrays.Practice;

import java.util.Scanner;
import java.util.HashMap;

public class Leetcode_1512_NoOfGoodPairs {
    //https://leetcode.com/problems/number-of-good-pairs/description/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(numIdenticalPairs(nums));
    }

    private static int numIdenticalPairs(int[] nums) {
        /*
        get the frequency count of each element of the array
        freq count of nums[2] = 3 then the no of good pairs from this will 1+2 = 3
         */
        int count = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int ele: nums){
            int freqCount = freq.getOrDefault(ele, 0);
            freq.put(ele, freqCount+1);
            count+=freqCount;
        }
        return count;
    }
}
