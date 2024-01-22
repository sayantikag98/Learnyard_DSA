package L12_Multi_Dimensional_Arrays_More_Problem_Solving.Practice;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode_1380_LuckyNumbersInAMatrix {
    //https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/
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
        System.out.println(luckyNumbers(mat));

    }

    private static List<Integer> luckyNumbers (int[][] mat) {
        /*
        TC => O(n*m(n+m))
        SC => O(1)
         */
        List<Integer> ans = new ArrayList<>();
        int n = mat.length, m = mat[0].length;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                boolean isLucky = true;
                int minEle = mat[i][0], maxEle = mat[0][j];

                //to find minimum element in that row
                for(int k = 1; k<m; k++){
                    if(mat[i][k]<minEle) minEle = mat[i][k];
                }
                if(minEle != mat[i][j]) isLucky = false;

                //to find the maximum element in that column
                for(int k = 1; k<n; k++){
                    if(mat[k][j]>maxEle) maxEle = mat[k][j];
                }
                if(maxEle != mat[i][j]) isLucky = false;

                if(isLucky) ans.add(mat[i][j]);
            }
        }
        return ans;
    }

    private static List<Integer> luckyNumbersAnotherApproach(int[][] mat){
        /*
        TC => O(nm)
        SC => O(n+m)
         */
        List<Integer> ans = new ArrayList<>();
        int n = mat.length, m = mat[0].length;

        // to compute the minimum element in each row and the maximum element in each column
        int[] rowMin = new int [n], colMax = new int[m];
        Arrays.fill(rowMin, Integer.MAX_VALUE);
        Arrays.fill(colMax, Integer.MIN_VALUE);

        for(int i = 0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                rowMin[i] = Math.min(rowMin[i], mat[i][j]);
                colMax[j] = Math.max(colMax[j], mat[i][j]);
            }
        }


        // traverse each cell of the matrix and check if it's lucky from the computed rowMin and colMax
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(rowMin[i] == colMax[j]){
                    ans.add(mat[i][j]);
                    // these are distinct elements in the matrix so there can only be one lucky number per row so break
                    break;
                }
            }
        }
        return ans;
    }
}
