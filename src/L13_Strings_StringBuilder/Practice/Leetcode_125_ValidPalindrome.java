package L13_Strings_StringBuilder.Practice;

public class Leetcode_125_ValidPalindrome {
    //https://leetcode.com/problems/valid-palindrome/
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindromeAnotherApproach(s));
    }

    private static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s.toLowerCase());
        for(int i = 0; i<sb.length(); i++){
            if(sb.charAt(i)<48 || (sb.charAt(i)>57 && sb.charAt(i)<97) || sb.charAt(i)>122){
                sb.deleteCharAt(i);
                i--; //MISSED THIS MOST IMP -> whenever a character gets deleted, after deletion if check
                // should happen at the very same index from which the last character got deleted that's why doing i--;
            }
        }
        int i = 0, j = sb.length()-1;
        while(i<j){
            if(sb.charAt(i++) != sb.charAt(j--)) return false;
        }
        return true;
    }

    private static boolean isPalindromeAnotherApproach(String s){
        int i = 0, j = s.length() -1;
        while(i<j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if(isCharacterValid(ch1) && isCharacterValid(ch2)){
                if(Character.toLowerCase(ch1) != Character.toLowerCase(ch2)) return false;
                i++;
                j--;
            }
            if(!isCharacterValid(ch1)) i++;
            if(!isCharacterValid(ch2)) j--;
        }
        return true;
    }

    private static boolean isCharacterValid(char ch){
        return (ch>=48 && ch<=57) || (ch>=65 && ch<=90) || (ch>=97 && ch<=122);
    }
}
