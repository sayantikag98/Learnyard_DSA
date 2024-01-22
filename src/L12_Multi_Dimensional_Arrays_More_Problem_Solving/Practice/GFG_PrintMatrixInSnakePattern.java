package L12_Multi_Dimensional_Arrays_More_Problem_Solving.Practice;

import java.util.Scanner;
import java.util.ArrayList;

public class GFG_PrintMatrixInSnakePattern {
    //https://www.geeksforgeeks.org/problems/print-matrix-in-snake-pattern-1587115621/1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println(snakePattern(mat));
    }

    private static ArrayList<Integer> snakePattern(int[][] mat){
        /*
        if row is even then moving right otherwise moving left
         */
        ArrayList<Integer> ans = new ArrayList<>();
        int n = mat.length;
        for(int i = 0; i<n; i++){

            //even
            if((i&1)==0){
                for(int j = 0; j<n; j++){
                    ans.add(mat[i][j]);
                }
            }
            else{
                for(int j = n-1; j>=0; j--){
                    ans.add(mat[i][j]);
                }
            }
        }
        return ans;
    }
}
