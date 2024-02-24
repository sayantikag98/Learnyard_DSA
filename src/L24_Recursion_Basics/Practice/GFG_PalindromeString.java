package L24_Recursion_Basics.Practice;

import java.util.Scanner;

public class GFG_PalindromeString {
    //https://www.geeksforgeeks.org/problems/palindrome-string0817/1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isPalindrome(s));
    }

    private static int isPalindrome(String s) {
        // code here
        if(isPalindrome(s, 0, s.length()-1)){
            return 1;
        }
        return 0;
    }

    private static boolean isPalindrome(String s, int i, int j){
        //empty string or string with single character is palindrome
        if(i>=j) return true;
        return s.charAt(i) == s.charAt(j) && isPalindrome(s, i+1, j-1);
    }

}
