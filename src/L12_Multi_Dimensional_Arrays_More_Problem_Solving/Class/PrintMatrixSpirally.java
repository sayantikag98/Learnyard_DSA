package L12_Multi_Dimensional_Arrays_More_Problem_Solving.Class;

import java.util.ArrayList;
import java.util.List;

public class PrintMatrixSpirally {
    /*
    MARK FOR REVISION - COULD NOT DO IT
     */
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,10}, {4,5,6,11}, {7,8,9,12}};
        List<Integer> ans = printSpirallyAnotherApproach(arr);
        System.out.println(ans);
    }

    private static List<Integer> printSpirallyAnotherApproach(int[][] arr){
        List<Integer> ans = new ArrayList<>();
        int n = arr.length, m = arr[0].length, rowStart = 0, colStart = 0, rowEnd = n-1, colEnd = m-1;
        while(ans.size() != n*m){
            // go right
            for(int j = colStart; ans.size() != n*m && j<=colEnd; j++){
                ans.add(arr[rowStart][j]);
            }
            //go down
            for(int i = rowStart+1; ans.size() != n*m && i<=rowEnd; i++){
                ans.add(arr[i][colEnd]);
            }
            //go left
            for(int j = colEnd-1; ans.size() != n*m && j>=colStart; j--){
                ans.add(arr[rowEnd][j]);
            }
            //go up
            for(int i = rowEnd-1; ans.size() != n*m && i>rowStart; i--){
                ans.add(arr[i][colStart]);
            }
            rowStart++;
            colStart++;
            rowEnd--;
            colEnd--;
        }

        return ans;
    }

    private static List<Integer> printSpirally(int[][] arr){
        /*
        starting point is one left of 0,0 cell
        till the time you can go right, go
        till the time you can go down, go
        till the time you can go left, go
        till the time you can go up, go
        at every cell print the value, increment counter, mark visited
         */
        List<Integer> ans = new ArrayList<>();
        int n = arr.length, m = arr[0].length, counter = 0;
        boolean[][] visited = new boolean[n][m];
        int i = 0, j = -1;
        while(counter != n*m){
            //go right
            while(counter != n*m && isValid(visited, n, m, i, j+1)){
                j++;
                ans.add(arr[i][j]);
                visited[i][j] = true;
                counter++;
            }

            //go down
            while(counter != n*m && isValid(visited, n, m, i+1, j)){
                i++;
                ans.add(arr[i][j]);
                visited[i][j] = true;
                counter++;
            }

            //go left
            while(counter != n*m && isValid(visited, n, m, i, j-1)){
                j--;
                ans.add(arr[i][j]);
                visited[i][j] = true;
                counter++;
            }

            //go up
            while(counter != n*m && isValid(visited, n, m, i-1, j)){
                i--;
                ans.add(arr[i][j]);
                visited[i][j] = true;
                counter++;
            }
        }
        return ans;
    }

    private static boolean isValid(boolean[][] visited, int n, int m, int i, int j){
        return i>=0 && i<n && j>=0 && j<m && !visited[i][j];
    }
}
