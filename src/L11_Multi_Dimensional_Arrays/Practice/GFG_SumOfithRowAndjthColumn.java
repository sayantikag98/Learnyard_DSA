package L11_Multi_Dimensional_Arrays.Practice;

import java.util.Scanner;

public class GFG_SumOfithRowAndjthColumn {
    //https://www.geeksforgeeks.org/problems/sums-of-i-th-row-and-i-th-column3054/1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println(sumOfRowCol(n, m, a));
    }

    private static int sumOfRowCol(int n, int m, int[][] a) {
        int minOfRowCol = Math.min(n, m);
        for(int i = 0; i<minOfRowCol; i++){
            if(sumOfithRow(m, a, i) != sumOfithColumn(n, a, i)) return 0;
        }
        return 1;
    }

    private static int sumOfithRow(int m, int[][] a, int idx){
        int sumOfRow = 0;
        for(int j = 0; j<m; j++){
            sumOfRow+=a[idx][j];
        }
        return sumOfRow;
    }

    private static int sumOfithColumn(int n, int[][] a, int idx){
        int sumOfColumn = 0;
        for(int i = 0; i<n; i++){
            sumOfColumn+=a[i][idx];
        }
        return sumOfColumn;
    }
}
