package L22_Arrays_Practice5.Class;

public class Leetcode_304_RangeSumQuery2DImmutable {
    //https://leetcode.com/problems/range-sum-query-2d-immutable/description/
    public static void main(String[] args) {
        NumMatrix nm = new NumMatrix(new int[][]{{3,0,1,4,2},{5,6,3,2,1},{1,2,0,1,5},{4,1,0,1,7},{1,0,3,0,5}});
        int[][] query = {{2,1,4,3}, {1,1,2,2}, {1,2,2,4}};
        for(int[] q: query){
            System.out.println(nm.sumRegion(q[0], q[1], q[2], q[3]));
        }
    }
}

class NumMatrix {

    int[][] arr;
    int n;
    int m;

    int[][] preSum;

    public NumMatrix(int[][] matrix) {
        arr = matrix;
        n = matrix.length;
        m = matrix[0].length;
        preSum = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                preSum[i][j] = arr[i][j];
                if(i>0) preSum[i][j]+=preSum[i-1][j];
                if(j>0) preSum[i][j]+=preSum[i][j-1];
                if(i>0 && j>0) preSum[i][j]-=preSum[i-1][j-1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        //TC=O(1)
        //SC=O(mn)
        int sum = preSum[row2][col2];
        if(row1>0){
            sum-= preSum[row1-1][col2];
        }
        if(col1>0){
            sum-=preSum[row2][col1-1];
        }
        if(row1>0 && col1>0){
            sum+=preSum[row1-1][col1-1];
        }
        return sum;
    }
}
