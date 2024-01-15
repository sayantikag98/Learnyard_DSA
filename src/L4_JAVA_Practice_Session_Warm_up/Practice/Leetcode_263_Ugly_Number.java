package L4_JAVA_Practice_Session_Warm_up.Practice;
import java.util.Scanner;

public class Leetcode_263_Ugly_Number {
    //https://leetcode.com/problems/ugly-number/
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isUgly(n));
    }

    private static boolean isUgly(int n){
         if(n<=0) return false;

         while(n%2 == 0){
             n/=2;
         }
         while(n%3 == 0){
             n/=3;
         }
         while(n%5 == 0){
             n/=5;
         }
         return n==1;

    }



}
