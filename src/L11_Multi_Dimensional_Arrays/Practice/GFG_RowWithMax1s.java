package L11_Multi_Dimensional_Arrays.Practice;
import java.util.Scanner;
public class GFG_RowWithMax1s {
    //https://www.geeksforgeeks.org/problems/row-with-max-1s0023/1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int [n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(rowWithMax1s(arr, n, m));
    }

    private static int rowWithMax1s(int[][] arr, int n, int m) {
        /*
        1. Each row of the array is sorted
        2. Get the first row with max 1
        3. If for the first row, the first 1 comes at the jth index then for the next row
            the search space for finding 1 will be from 0 to j-1, because if 1 comes on
            indices j and beyond then this row cannot be the answer.
        4. onePos variable stores the index of first 1 of the first row with max 1
        5. rowWithMaxOne variable stores the least index with max 1
        6. if we get a new row with more 1, then update onePos and rowWithMaxOne.
         */
        int rowWithMaxOne = -1, onePos = m;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<onePos; j++){
                if(arr[i][j] == 1){
                    onePos = j;
                    rowWithMaxOne = i;
                    break;
                }
            }
        }
        return rowWithMaxOne;
    }
}
