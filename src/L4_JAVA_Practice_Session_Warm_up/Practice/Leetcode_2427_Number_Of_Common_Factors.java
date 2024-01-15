package L4_JAVA_Practice_Session_Warm_up.Practice;

import java.util.Scanner;

public class Leetcode_2427_Number_Of_Common_Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(commonFactors(a, b));
    }

    private static int commonFactors(int a, int b){
        int count = 1;
        for(int i = Math.min(a, b); i>1; i--){
            if(a%i==0 && b%i==0) count++;
        }
        return count;
    }
}
