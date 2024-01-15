package L6_Loop_Extra_Class.Practice;

import java.util.Scanner;

public class Leetcode_2652_Sum_Multiples {
    //https://leetcode.com/problems/sum-multiples/description/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfMultiples(n));
        System.out.println(sumOfMultiplesAlternate(n));
    }

    private static int sumOfMultiples(int n) {

        /*
        Brute force
         space O(1) & time complexity O(n)
         */
        int sum = 0;
        for(int i = 3; i<=n; i++){
            if(i%3 == 0 || i%5 == 0 || i%7==0) sum+=i;
        }
        return sum;
    }

    private static int sumOfMultiplesAlternate(int n){
         /*
        Alternate solution with O(1) space & O(1) time complexity:

        1. To get sum of all factors of k until n, we can have this formula (sum of Arithmetic progression):
        k * (n/k) * (n/k + 1) / 2
        If you wonder how we get above formula then check this out :
        k + 2k + 3k + 4k + ..... xk = k (1 + 2 + 3 + 4 ... x) = k((x )( x + 1)/2)
        where x is the largest value of (xk <= n) => (x <= n/k) => n/k

        2. Above formula is implemented on cal function.

        3. To get the ans, we can sum :
        sum all the factor of 3 + sum of all the factors of 5 + sum of all the factors of 7
        - sum of all the factor of 3 * 5 - sum of all the factors of 5 * 7
        - sum of all the factors of 3 * 7 + sum of all the factors of 3 * 5 * 7.


        n(A U B U C) = n(A) + n(B) + n(C) - n(A ∩ B) - n(B ∩ C) - n(A ∩ C) + n(A ∩ B ∩ C)

         */
        return sumOfAllFactors(3, n) + sumOfAllFactors(5, n) + sumOfAllFactors(7, n) - sumOfAllFactors(15, n) - sumOfAllFactors(35, n) - sumOfAllFactors(21, n) + sumOfAllFactors(105, n);

    }

    private static int sumOfAllFactors(int k, int n){
        return k * (n/k) * (n/k+1)/2;
    }
}
