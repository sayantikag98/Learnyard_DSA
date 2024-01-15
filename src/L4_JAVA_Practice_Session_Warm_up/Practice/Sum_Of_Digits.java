package L4_JAVA_Practice_Session_Warm_up.Practice;

import java.util.Scanner;

public class Sum_Of_Digits {
    //https://www.geeksforgeeks.org/problems/sum-of-digits1742/1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfDigits(n));
    }

    private static int sumOfDigits(int n){
        int sum = 0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
