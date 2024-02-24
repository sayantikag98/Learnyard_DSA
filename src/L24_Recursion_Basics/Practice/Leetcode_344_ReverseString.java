package L24_Recursion_Basics.Practice;

import java.util.Arrays;

public class Leetcode_344_ReverseString {
    //https://leetcode.com/problems/reverse-string/description/

    public static void main(String[] args) {
        char[] ch = {'H', 'e', 'l', 'l', 'o'};
        reverseString(ch);
        System.out.println(Arrays.toString(ch));
    }
    private static void reverseString(char[] s) {
        reverseStringHelper(s, 0, s.length-1);
    }

    private static void reverseStringHelper(char[] s, int i, int j){
        if(i>=j) return;
        reverseStringHelper(s, i+1, j-1);
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}
