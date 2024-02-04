package HackerRankContest_04_02_2024;
import java.util.Scanner;

public class CountTriplets {
    //https://www.hackerrank.com/contests/learnyard-jan-2024/challenges/count-triplets-4
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(countTriplets(nums, n));
    }

    private static int countTriplets(int[] nums, int n){
        int count = 0;
        for(int i = 0; i<=n-3; i++){
            for(int j = i+1; j<=n-2; j++){
                for(int k = j+1; k<=n-1; k++){
                    if(isTriangleWithDistinctSides(nums[i], nums[j], nums[k])) count++;
                }
            }
        }
        return count;
    }

    private static boolean isTriangleWithDistinctSides(int a, int b, int c){
        if(a==b || b==c || c==a) return false;
        return a+b>c && b+c>a && c+a>b;
    }
}
