package HackerRankContest_04_02_2024;
import java.util.Scanner;

public class MaximizeArrayOperations {
    //https://www.hackerrank.com/contests/learnyard-jan-2024/challenges/maximise-array-operations
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int [n];
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(maxArrayOperations(nums, n));
    }

    private static int maxArrayOperations(int[] nums, int n){
        int maxOps = Integer.MAX_VALUE;
        for(int val: nums){
            maxOps = Math.min(maxOps, noOfUnsetBits(val));
        }
        return maxOps;
    }

    private static int noOfUnsetBits(int num){
        int count = 0;
        while((num&1) == 0){
            num>>=1;
            count++;
        }
        return count;
    }
}
