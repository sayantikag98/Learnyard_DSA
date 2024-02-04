package L13_Strings_StringBuilder.Practice;

public class Leetcode_680_ValidPalindromeII {
    //https://leetcode.com/problems/valid-palindrome-ii/description/
    public static void main(String[] args) {
        String s = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
        System.out.println(validPalindrome(s));
    }

    private static boolean validPalindrome(String s) {
        /*
        if its already not a palindrome and can be made palindrome by deleting one character
        then if we start moving the two pointers at the end from both side at that particular
        mismatch character we can either move left pointer right or right pointer left and check
        the rest of the string if that's palindrome
         */
        int i = 0, j = s.length()-1, count = 0;
        //count -> no of mismatches

        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                i++;
                count++;
            }
            else{
                i++;
                j--;
            }
        }
        //if count equal zero then s is already a palindrome
        if (count<=1) return true;

        i = 0;
        j = s.length()-1;
        count = 0;

        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                j--;
                count++;
            }
            else{
                i++;
                j--;
            }
        }
        return count==1;
    }
}
