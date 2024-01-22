package L12_Multi_Dimensional_Arrays_More_Problem_Solving.Practice;

import java.util.Scanner;

public class Leetcode_48_RotateImage {
    //https://leetcode.com/problems/rotate-image/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        rotate(mat);
        for(int[] arr: mat){
            for(int val: arr){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }

    private static void rotate(int[][] mat) {
        /*
        Steps to rotate image:
        1. first transpose the matrix
        2. then swap the first column elements with last column elements,
            swap second column elements with the second last column elements and so on
            till you reach the half of the column for every row
         */
        int n = mat.length;
        transpose(mat, n);
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=n/2-1; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[i][n-1-j];
                mat[i][n-1-j] = temp;
            }
        }
    }

    private static void transpose(int[][] mat, int n){
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
}
