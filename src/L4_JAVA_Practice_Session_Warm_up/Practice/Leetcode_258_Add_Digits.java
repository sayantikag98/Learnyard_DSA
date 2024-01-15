package L4_JAVA_Practice_Session_Warm_up.Practice;

import java.util.Scanner;

public class Leetcode_258_Add_Digits {
    //https://leetcode.com/problems/add-digits/
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(addDigits(num));
    }

    private static int addDigits(int num){
        int sumOfDigits = 0;
        while(num!=0){
            sumOfDigits += num%10;
            num/=10;
            if(num == 0 && sumOfDigits >= 0 && sumOfDigits <= 9) return sumOfDigits;
            if(num == 0){
                num = sumOfDigits;
                sumOfDigits = 0;
            }
        }
        return sumOfDigits;
    }
}
