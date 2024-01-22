package L12_Multi_Dimensional_Arrays_More_Problem_Solving.Class;

import java.util.Arrays;

public class MultiplyTwoMatrices {
    public static void main(String[] args) {
        int[][] a = {{1,2,3}, {4,5,6}},
                b = {{6,3}, {5,2}, {4,1}};
        matrixMultiplication(a, b);
    }

    private static void matrixMultiplication(int[][] a, int[][] b){
        if(a[0].length != b.length){
            return;
        }
        int[][] res = new int[a.length][b[0].length];
        for(int i = 0; i<res.length; i++){
            for(int j = 0; j<res[0].length; j++){
                for(int k = 0; k<b.length; k++){
                    res[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for(int[] val: res){
            System.out.println(Arrays.toString(val));
        }
    }
}
