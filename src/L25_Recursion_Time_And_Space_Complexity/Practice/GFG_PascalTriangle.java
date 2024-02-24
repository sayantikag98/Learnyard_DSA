package L25_Recursion_Time_And_Space_Complexity.Practice;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GFG_PascalTriangle {
    //https://www.geeksforgeeks.org/problems/pascal-triangle0652/1

    //https://chat.openai.com/share/db29d211-1633-4074-b2b9-f7a4c646169b
    /*
    VERY IMPORTANT CHAT GPT LINK HAVING ALL NECESSARY EXPLANATION ABOUT HOW TO
    COMPUTE nCr WHEN n AND r ARE VERY BIG VALUES AND OVERFLOWS IF NOT HANDLED
    PROPERLY, SO TAKE MODULO WITH 10^9+7
     */
    private static final int MOD = 1000000007;
    public static void main(String[] args) {
        System.out.println(nthRowOfPascalTriangle(5));
    }
    private static ArrayList<Long> nthRowOfPascalTriangle(int n) {
        /*
        0C0
        1C0 1C1
        2C0 2C1 2C2
        3C0 3C1 3C2 3C3
        4C0 4C1 4C2 4C3 4C4
        */
        ArrayList<Long> ans = new ArrayList<>();
//        pascalRecursiveOptimized(n, 0, ans);
        pascalIterative(n, ans);
        return ans;
    }

    private static void pascalRecursiveOptimized(int n, int i, ArrayList<Long> ans){
        if(i == n) return;
        ans.add(nChooseK(n-1, i));
        pascalRecursiveOptimized(n, i+1, ans);
    }

    private static void pascalRecursive(int n, int i, int j, ArrayList<Long> ans){
        if(i == n) return;
        if(j > i){
            pascalRecursive(n, i+1, 0, ans);
        }
        else{
            if(i == n-1){
                ans.add(nChooseK(i, j));
            }
            pascalRecursive(n, i, j+1, ans);
        }
    }

    private static void pascalIterative(int n, ArrayList<Long> ans){
        long[] oddRow = new long[n], evenRow = new long[n];
        //row -> 1 based indexing
        oddRow[0] = 1;
        if(n>1) evenRow[0] = evenRow[1] = 1; //if check imp edge case
        for(int i = 3; i<=n; i++){
            //even
            if((i&1)==0){
                for(int j = 1; j<i-1; j++){
                    evenRow[j] = (oddRow[j-1] + oddRow[j]) % MOD;
                }
                evenRow[i-1] = 1;
            }
            //odd
            else{
                for(int j = 1; j<i-1; j++){
                    oddRow[j] = (evenRow[j-1] + evenRow[j]) % MOD;
                }
                oddRow[i-1] = 1;
            }
        }
        if((n&1)==0){
            for(long ele: evenRow){
                ans.add(ele);
            }
        }
        else{
            for(long ele: oddRow){
                ans.add(ele);
            }
        }
    }



    // Function to calculate factorial modulo MOD
    private static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = (fact * i) % MOD;
        }
        return fact;
    }

    // Function to calculate power modulo MOD
    private static long power(long base, int exp) {
        if (exp == 0)
            return 1;
        long half = power(base, exp / 2) % MOD;
        long result = (half * half) % MOD;
        if (exp % 2 == 1)
            result = (result * base) % MOD;
        return result;
    }

    // Function to calculate modular inverse
    private static long modInverse(long n) {
        return power(n, MOD - 2);
    }

    // Function to calculate n choose k modulo MOD
    private static long nChooseK(int n, int k) {
        long numerator = factorial(n);
        long denominator = (factorial(k) * factorial(n - k)) % MOD;
        long inverseDenominator = modInverse(denominator);
        return (numerator * inverseDenominator) % MOD;
    }
}
