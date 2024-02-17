package L22_Arrays_Practice5.Practice;

public class Leetcode_3033_ModifyTheMatrix {
    //https://leetcode.com/problems/modify-the-matrix/description/
    public static void main(String[] args) {
//        print(modifiedMatrix(new int[][]{{1,2,-1},{4,-1,6},{7,8,9}}));
        print(modifiedMatrixOptimized(new int[][]{{1,2,-1},{4,-1,6},{7,8,9}}));
    }

    private static int[][] modifiedMatrixOptimized(int[][] matrix){
        /*
            Time complexity: O(M*N)
            Space complexity: O(M*N)
         */
        int row = matrix.length, col = matrix[0].length;
        for(int j = 0; j<col; j++){
            int max = -1, posNeg = -1;
            for(int i = 0; i<row; i++){
                max = Math.max(max, matrix[i][j]);
                if(matrix[i][j] == -1){
                    matrix[i][j] = posNeg;
                    posNeg = i;
                }
            }
            //this is the optimization wherein in this second iteration go only to the cells with value -1 and update with max
            for(int i = posNeg; i!=-1;){
                int temp = i;
                i = matrix[i][j];
                matrix[temp][j] = max;
            }
        }
        return matrix;
    }

    private static int[][] modifiedMatrix(int[][] matrix) {
         /*
            Time complexity: O(M*N)
            Space complexity: O(M*N)
         */
        int row = matrix.length, col = matrix[0].length;
        for(int j = 0; j<col; j++){
            int max = -1;
            for (int[] ints : matrix) {
                max = Math.max(max, ints[j]);
            }
            for(int i = 0; i<row; i++){
                if(matrix[i][j] == -1) matrix[i][j] = max;
            }
        }
        return matrix;
    }

    private static void print(int[][] matrix){
        for(int[] arr: matrix){
            for(int ele: arr){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
