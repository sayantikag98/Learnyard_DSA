package L11_Multi_Dimensional_Arrays.Practice;
import java.util.Scanner;

public class GFG_SumOfElementsInAMatrix {
    //https://www.geeksforgeeks.org/problems/sum-of-elements-in-a-matrix2000/1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                grid[i][j] = sc.nextInt();
            }
        }
        System.out.println(sumOfMatrix(n, m, grid));
    }

    private static int sumOfMatrix(int n, int m, int[][] grid){
        int sum = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                sum+=grid[i][j];
            }
        }
        return sum;
    }
}
