package L12_Multi_Dimensional_Arrays_More_Problem_Solving.Practice;
import java.util.Scanner;
public class GFG_CountSortedRows {
    public static void main(String[] args) {
        //https://www.geeksforgeeks.org/problems/count-sorted-rows2702/1
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println(sortedCount(n, m, mat));
    }

    private static int sortedCount(int n, int m, int[][] mat) {
        int sortedRows = 0;
        /*
        Note: strictly increasing or decreasing means no two elements can be same
         */
        for(int i = 0; i<n; i++){
            // when row contains one element that's when the row is considered sorted
            if(mat[i].length == 1){
                sortedRows++;
                continue;
            }
            if(mat[i][0] != mat[i][1]){
                char check;
                boolean isSorted = true;
                if(mat[i][0]>mat[i][1]) check = 'g';
                else check = 'l';
                for(int j = 0; j<m-1; j++){
                    if((check == 'g' && mat[i][j]<mat[i][j+1]) || (check == 'l' && mat[i][j]>mat[i][j+1]) || mat[i][j] == mat[i][j+1]) {
                        isSorted = false;
                        break;
                    }
                }
                if(isSorted) sortedRows++;
            }
        }
        return sortedRows;
    }
}
