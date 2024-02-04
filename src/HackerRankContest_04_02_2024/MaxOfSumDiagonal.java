package HackerRankContest_04_02_2024;
import java.util.Scanner;

public class MaxOfSumDiagonal {
    //https://www.hackerrank.com/contests/learnyard-jan-2024/challenges/max-sum-of-diagonal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(maxSumOfDiagonals(matrix, n));
    }

    private static long maxSumOfDiagonals(int[][] matrix, int n){
        int count = 2*n-1, start = n-1, end = 0;
        long maxSum = Long.MIN_VALUE;

        while(count-->0){
            long sum = 0;
            int i = start, j = end;
            while(i<n && j<n){

                sum+=matrix[i][j];
                i++;
                j++;
            }
            maxSum = Math.max(maxSum, sum);
            if(start != 0){
                start--;
            }
            else{
                end++;
            }
        }


        count = 2*n-1;
        start = n-1;
        end = n-1;

        while(count-->0){
            long sum = 0;
            int i = start, j = end;
            while(i<n && j>=0){

                sum+=matrix[i][j];
                i++;
                j--;
            }
            maxSum = Math.max(maxSum, sum);
            if(start != 0){
                start--;
            }
            else{
                end--;
            }
        }
        return maxSum;
    }
}
