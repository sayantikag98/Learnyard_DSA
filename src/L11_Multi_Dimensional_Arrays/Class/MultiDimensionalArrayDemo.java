package L11_Multi_Dimensional_Arrays.Class;

import java.util.Scanner;
public class MultiDimensionalArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int [2][];
        arr[0] = new int[3];
        arr[1] = new int[3];
        int[][] arr1 = {{1,2}, {3,4}, {5,6}};
//        for(int i = 0; i<arr.length; i++){
//            for(int j = 0; j<arr[0].length; j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
        rowTraversal(arr1);
        columnTraversal(arr1);
    }

    private static void rowTraversal(int[][] arr){
        for(int[] row: arr){
            for(int val: row){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }

    private static void columnTraversal(int[][] arr){
        for(int j = 0; j<arr[0].length; j++){
            for(int[] row: arr){
                System.out.print(row[j]+" ");
            }
            System.out.println();
        }
    }
}
