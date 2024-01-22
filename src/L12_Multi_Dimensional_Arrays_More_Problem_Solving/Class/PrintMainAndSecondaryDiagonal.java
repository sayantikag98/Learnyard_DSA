package L12_Multi_Dimensional_Arrays_More_Problem_Solving.Class;

public class PrintMainAndSecondaryDiagonal {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Main diagonal");
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i][i]);
        }
        System.out.println("Secondary diagonal");
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i][arr.length-i-1]);
        }
    }
}
