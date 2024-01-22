package L12_Multi_Dimensional_Arrays_More_Problem_Solving.Practice;

import java.util.Scanner;
import java.util.Arrays;

public class GFG_PrintMatrixInDiagonalPattern {
    //https://www.geeksforgeeks.org/problems/print-matrix-in-diagonal-pattern/1
    /*
    MARK FOR REVISION
     */
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] mat = new int[n][n];
//        for(int i = 0; i<n; i++){
//            for(int j = 0; j<n; j++){
//                mat[i][j] = sc.nextInt();
//            }
//        }

        int[][] mat = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        System.out.println(Arrays.toString(matrixDiagonally(mat)));
    }

    private static int[] matrixDiagonally(int[][] mat) {
        /*
        TC => O(n^2)
        SC => O(n^2)
         */
        int n = mat.length;

        // to store the traversal
        int[] ans = new int [n*n];

        // i&j will be the indices of the cells in the matrix where we traverse
        // k is the current index of the ans array which stores traversal
        // prevRow will be storing the previous value of i and prevCol will be storing the previous value of j when i&j goes out of bound of the matrix
        int i = 0, j = 0, k = 0, prevRow = 0, prevCol = 0;


        // isUp is going to control the traversal direction
        // when isUp is true then the traversal is diagonally up and when isUp is false then the traversal is diagonally down
        // with every new diagonal the traversal direction reverses
        boolean isUp = true;


        // the outer loop should run till the ans array has all the elements of the matrix i.e k<ans.length
        while(k<ans.length){

            // inner loop controls the diagonal traversal (up or down) till it is within the bounds of the matrix
            while(i>=0 && i<n && j>=0 && j<n){

                //store the current element in the ans array
                ans[k++] = mat[i][j];

                //store the current value of i and j so that when i and j is outside bounds of the matrix then prevRow
                // and prevCol stores the previous value of i and j which will be required later
                prevRow = i;
                prevCol = j;

                //when isUp is true then the traversal is diagonally up and when isUp is false then the traversal is diagonally down
                if(isUp){
                    j++;
                    i--;
                }
                else{
                    i++;
                    j--;
                }
            }

            // after every complete diagonal traversal reverse the direction of traversal
            isUp = !isUp;


            /*
            after a diagonal traversal is done and i and j is currently outside the bounds of the matrix
            then based on the value of prevRow and prevCol the value of i and j should be reinitialized to continue
            the further traversal
             */
            if((prevRow == 0 || prevRow == n-1) && prevCol != n-1){
                i = prevRow;
                j = prevCol+1;
            }
            else if(prevRow != n-1 && (prevCol == n-1 || prevCol == 0)){
                i = prevRow+1;
                j = prevCol;
            }
        }

        return ans;
    }

}
