package L5_Practicing_Loops.Practice;

import java.util.Scanner;

import static L5_Practicing_Loops.Practice.GCD.gcdIterative;

public class NoOfCommonFactors {
    //https://leetcode.com/problems/number-of-common-factors/description/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(commonFactors(a, b));
    }

    private static int commonFactors(int a, int b){
        int count = 1;
        for(int i = 2; i<=gcdIterative(a, b); i++){
            if(a%i == 0 && b%i==0) count++;
        }
        return count;
    }
}
