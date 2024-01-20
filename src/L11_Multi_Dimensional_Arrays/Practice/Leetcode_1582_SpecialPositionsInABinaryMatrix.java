package L11_Multi_Dimensional_Arrays.Practice;

import java.util.Scanner;

public class Leetcode_1582_SpecialPositionsInABinaryMatrix {
    //https://leetcode.com/problems/special-positions-in-a-binary-matrix/description/
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
        System.out.println(numSpecial(mat));
        System.out.println(numSpecialAnotherApproach(mat));
    }

    private static int numSpecialAnotherApproach(int[][] mat){
        /*
        TC => O(n^2)
        SC => O(n)
         */
        int row = mat.length, col = mat[0].length, specialOne = 0;
        int[] rowOneCount = new int [row], columnOneCount = new int [col]; //initialized with default zero
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(mat[i][j] == 1){
                    rowOneCount[i]++;
                    columnOneCount[j]++;
                }
            }
        }

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(mat[i][j] == 1 && rowOneCount[i] == 1 && columnOneCount[j] == 1) specialOne++;
            }
        }
        return specialOne;
    }

    private static int numSpecial(int[][] mat) {
        /*
        TC => O(n^3)
        SC => O(1)
         */
        int count = 0;
        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[0].length; j++){
                if(mat[i][j] == 1 && checkInRowIfOnePresentOnce(mat, i) && checkInColumnIfOnePresentOnce(mat, j)) count++;
            }
        }
        return count;
    }

    private static boolean checkInRowIfOnePresentOnce(int[][] mat, int idx){
        int countOne = 0;
        for(int val: mat[idx]){
            if(val == 1) countOne++;
        }
        return countOne == 1;
    }

    private static boolean checkInColumnIfOnePresentOnce(int[][] mat, int idx){
        int countOne = 0;
        for(int[] arr: mat){
            if(arr[idx] == 1) countOne++;
        }
        return countOne == 1;
    }


}
