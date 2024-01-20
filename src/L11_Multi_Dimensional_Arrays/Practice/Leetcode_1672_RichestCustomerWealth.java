package L11_Multi_Dimensional_Arrays.Practice;

import java.util.Scanner;

public class Leetcode_1672_RichestCustomerWealth {
    //https://leetcode.com/problems/richest-customer-wealth/description/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] accounts = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                accounts[i][j] = sc.nextInt();
            }
        }
        System.out.println(maximumWealth(accounts));
    }


    private static int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for(int[] account: accounts){
            int sumOfWealth = 0;
            for(int wealth: account){
                sumOfWealth+=wealth;
            }
            maxWealth = Math.max(maxWealth, sumOfWealth);
        }
        return maxWealth;
    }
}
