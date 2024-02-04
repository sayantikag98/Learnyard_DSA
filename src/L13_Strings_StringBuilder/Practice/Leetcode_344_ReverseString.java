package L13_Strings_StringBuilder.Practice;
import java.util.Arrays;

public class Leetcode_344_ReverseString {
    //https://leetcode.com/problems/reverse-string/description/
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
        reverseStringRecursive(s, 0, s.length - 1);
        System.out.println(Arrays.toString(s));
    }

    private static void reverseString(char[] s) {
        int i = 0, j = s.length-1;
        while(i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }

    private static void reverseStringRecursive(char[] s, int i, int j){
        if(i>=j) return;
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        reverseStringRecursive(s, i+1, j-1);
    }
}
