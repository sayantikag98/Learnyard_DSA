package L12_Multi_Dimensional_Arrays_More_Problem_Solving.Practice;

import java.util.Scanner;

public class Leetcode_766_ToeplitzMatrix {
    //https://leetcode.com/problems/toeplitz-matrix/description/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println(isToeplitzMatrix(mat));
    }

    private static boolean isToeplitzMatrix(int[][] matrix) {
        for(int i = 0; i<matrix.length-1; i++){
            for(int j = 0; j<matrix[0].length-1; j++){
                if(matrix[i][j] != matrix[i+1][j+1]){
                    return false;
                }
            }
        }
        return true;
    }
}
