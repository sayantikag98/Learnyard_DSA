package L7_Loops_Extra_Class_Returns.Practice.BasicLoops;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), temp = n, revNum = 0;
        while(temp != 0){
            int digit = temp%10;
            revNum = revNum * 10 + digit;
            temp/=10;
        }
        if(revNum == n){
            System.out.println(n + " is palindrome");
        }
        else{
            System.out.println(n + " is not palindrome");
        }
    }
}
