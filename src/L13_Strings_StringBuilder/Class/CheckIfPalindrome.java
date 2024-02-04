package L13_Strings_StringBuilder.Class;

import java.util.Scanner;

public class CheckIfPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(isPalindrome(str));
    }

    private static boolean isPalindrome(StringBuilder str){
        int i = 0, j = str.length()-1;
        while(i<j){
            if(str.charAt(i++) != str.charAt(j--)) return false;
        }
        return true;
    }
}
