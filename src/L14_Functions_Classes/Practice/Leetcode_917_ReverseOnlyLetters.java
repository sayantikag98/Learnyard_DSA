package L14_Functions_Classes.Practice;

public class Leetcode_917_ReverseOnlyLetters {
    //https://leetcode.com/problems/reverse-only-letters/description/
    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        System.out.println(reverseOnlyLetters(s));
    }

    public static String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0, j = s.length()-1;
        while(i<j){
            char leftChar = sb.charAt(i), rightChar = sb.charAt(j);
            if(validCharacter(leftChar) && validCharacter(rightChar)){
                sb.setCharAt(i++, rightChar);
                sb.setCharAt(j--, leftChar);
            }
            else if(!validCharacter(leftChar)) i++;
            else if(!validCharacter(rightChar)) j--;
        }
        return new String(sb);
    }

    private static boolean validCharacter(char ch){
        return (ch>=65 && ch<=90) || (ch>=97 && ch<=122);
    }
}
