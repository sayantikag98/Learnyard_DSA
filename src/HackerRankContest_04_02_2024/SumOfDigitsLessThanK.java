package HackerRankContest_04_02_2024;
import java.util.Scanner;

public class SumOfDigitsLessThanK {
    //https://www.hackerrank.com/contests/learnyard-jan-2024/challenges/sum-of-digits-less-than-k
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(sumOfDigitsLessThanK(nums, n, k));
    }

    private static int sumOfDigitsLessThanK(int[] nums, int n, int k){
        int numLessThanK = 0;
        for(int val: nums){
            if(sumOfDigits(val)<k) numLessThanK++;
        }
        return numLessThanK;
    }

    private static int sumOfDigits(int n){
        int sum = 0;
        for(int temp = n; temp>0; temp/=10){
            sum+=(temp%10);
        }
        return sum;
    }
}
