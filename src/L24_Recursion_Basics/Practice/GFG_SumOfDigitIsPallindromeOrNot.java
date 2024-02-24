package L24_Recursion_Basics.Practice;

public class GFG_SumOfDigitIsPallindromeOrNot {
    //https://www.geeksforgeeks.org/problems/sum-of-digit-is-pallindrome-or-not2751/1
    public static void main(String[] args) {
        System.out.println(isDigitSumPalindrome(12345));
    }
    private static int isDigitSumPalindrome(int N) {
        long sum = digitSum(N);
        boolean ans = reverseNum2(sum, 0) == sum;
        return ans ? 1: 0;
    }

    private static long digitSum(int n){
        if(n == 0) return 0;
        return n%10 + digitSum(n/10);
    }

    private static boolean isPalindrome(String s, int i, int j){
        if(i>=j) return true;
        return s.charAt(i) == s.charAt(j) && isPalindrome(s, i+1, j-1);
    }

    private static void reverseNum1(long n, long reverse){
        if(n==0){
            System.out.println(reverse);
            return;
        }
        long digit = n%10;
        reverse = reverse*10+digit;
        reverseNum1(n/10, reverse);
    }

    private static long reverseNum2(long n, long reverse){
        if(n == 0) return reverse;
        long digit = n%10;
        reverse = reverse * 10 + digit;
        return reverseNum2(n/10, reverse);
    }
}
