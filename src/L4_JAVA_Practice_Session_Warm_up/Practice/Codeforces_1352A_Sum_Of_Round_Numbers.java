package L4_JAVA_Practice_Session_Warm_up.Practice;

import java.util.Scanner;

public class Codeforces_1352A_Sum_Of_Round_Numbers {
    //https://codeforces.com/contest/1352/problem/A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;
        while(t-->0){
            n = sc.nextInt();
            int count = 0, temp = n;
            while(temp != 0){
                if(temp%10 != 0) count++;
                temp/=10;
            }
            System.out.println(count);
            int index = 0;
            while(n != 0){
                int digit = n%10;
                if(digit != 0){
                    System.out.println(digit * (int)Math.pow(10, index));
                }
                index++;
                n/=10;
            }
        }

    }
}
