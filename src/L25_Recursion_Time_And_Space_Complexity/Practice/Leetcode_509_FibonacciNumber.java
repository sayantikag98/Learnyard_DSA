package L25_Recursion_Time_And_Space_Complexity.Practice;

public class Leetcode_509_FibonacciNumber {
    //https://leetcode.com/problems/fibonacci-number/description/
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibIterative(n));
        System.out.println(fibRecursive(n));
        System.out.println(fibDpBottomUpTabulation(n, new int [n+1]));
        int[] dp = new int[n+1];
        dp[0] = 0;
        if(n>0) dp[1] = 1;
        System.out.println(fibDpTopDownMemoization(n, dp));
    }

    private static int fibIterative(int n){
        //TC=>O(n)
        //SC=>O(1)
        int a = 0, b = 1;
        for(int i = 0; i<n; i++){
            int c = a+b;
            a = b;
            b = c;
        }
        return a;
    }

    private static int fibRecursive(int n) {
        //TC=O(2^n)
        //SC=O(n)
        if(n<2) return n;
        return fibRecursive(n-1)+fibRecursive(n-2);
    }

    private static int fibDpTopDownMemoization(int n, int[] dp) {
        //TC=O(n)
        //SC=O(n)
        if(n>=2 && dp[n]==0){
            dp[n] = fibDpTopDownMemoization(n-1, dp) + fibDpTopDownMemoization(n-2, dp);
        }
        return dp[n];
    }

    private static int fibDpBottomUpTabulation(int n, int[] states) {
        //TC=>O(n)
        //SC=>O(n)
        for(int i = 0; i<=n; i++){
            if(i<2) states[i] = i;
            else states[i] = states[i-1]+states[i-2];
        }
        return states[n];
    }
}
