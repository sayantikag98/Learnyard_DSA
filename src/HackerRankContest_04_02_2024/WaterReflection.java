package HackerRankContest_04_02_2024;
import java.util.Scanner;

public class WaterReflection {
    //https://www.hackerrank.com/contests/learnyard-jan-2024/challenges/water-reflection
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        waterReflection(matrix, n, m);
        print(matrix);
    }

    private static void waterReflection(int[][] matrix, int n, int m){
        for(int j = 0; j<m; j++){
            for(int i = 0; i<n/2; i++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-1-i][j];
                matrix[n-1-i][j] = temp;
            }
        }
    }

    private static void print(int[][] matrix){
        for(int[] arr: matrix){
            for(int val: arr){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
