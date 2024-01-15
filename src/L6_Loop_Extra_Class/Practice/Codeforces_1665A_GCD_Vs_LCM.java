package L6_Loop_Extra_Class.Practice;

import java.util.Scanner;

public class Codeforces_1665A_GCD_Vs_LCM {
    //https://codeforces.com/problemset/problem/1665/A
    public static void main(String[] args) {
        /*
        if a = n-3, b = 1, c = 1, d = 1
        then it satisfies both the conditions given in the question
        Condition 1: a+b+c+d=n
        Condition 2: gcd(a,b) = lcm(c,d)
         */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            System.out.println(n-3+" "+1+" "+1+" "+1);
        }
    }
}
