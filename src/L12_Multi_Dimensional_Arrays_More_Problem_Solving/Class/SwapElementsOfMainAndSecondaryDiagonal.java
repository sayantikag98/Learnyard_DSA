package L12_Multi_Dimensional_Arrays_More_Problem_Solving.Class;

import java.util.Arrays;

public class SwapElementsOfMainAndSecondaryDiagonal {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        swapMainAndSecondaryDiagonal(arr);
        for(int[] ele: arr)
            System.out.println(Arrays.toString(ele));
    }

    private static void swapMainAndSecondaryDiagonal(int[][] arr){
        for(int i = 0; i<arr.length; i++){
            int temp = arr[i][i];
            arr[i][i] = arr[i][arr.length-1-i];
            arr[i][arr.length-1-i] = temp;
        }
    }
}
