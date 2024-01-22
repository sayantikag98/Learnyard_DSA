package L12_Multi_Dimensional_Arrays_More_Problem_Solving.Practice;

import java.util.Scanner;

public class Leetcode_867_TransposeMatrix {
    //https://leetcode.com/problems/transpose-matrix/description/
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
        int[][] res = transpose(mat);
        for(int[] arr: res){
            for(int val: arr){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }

    private static int[][] transpose(int[][] mat) {
        int rowLen = mat.length, colLen = mat[0].length;
        int[][] transposeMatrix = new int[colLen][rowLen];
        for(int i = 0; i<rowLen; i++){
            for(int j = 0; j<colLen; j++){
                transposeMatrix[j][i] = mat[i][j];
            }
        }
        return transposeMatrix;
    }


    //follow up: if the given input matrix was square then transpose it in-place
    private static int[][] transposeFollowUp(int[][] mat){
        int n = mat.length;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        return mat;
    }
}
