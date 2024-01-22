package L12_Multi_Dimensional_Arrays_More_Problem_Solving.Practice;

import java.util.Scanner;

public class Leetcode_1572_MatrixDiagonalSum {
    //https://leetcode.com/problems/matrix-diagonal-sum/description/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println(diagonalSum(mat));
    }

    private static int diagonalSum(int[][] mat) {
        int sum = 0, n = mat.length;
        for(int i = 0; i<n; i++){
            sum+= (i == n-1-i ? mat[i][i]: mat[i][i] + mat[i][n-1-i]);
        }
        return sum;
    }
}
