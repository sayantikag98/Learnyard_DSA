package L13_Strings_StringBuilder.Practice;

public class Leetcode_9_PalindromeNumber {
    //https://leetcode.com/problems/palindrome-number/description/
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindromeWithoutString(x));
        System.out.println(isPalindromeWithString(x));


//        int n = 10;
//        demo(++n);
//        System.out.println("inside main "+n); //inside main 11
    }

//    private static void demo(int n){
//        System.out.println("inside demo "+n); //inside demo 11
//    }

    private static boolean isPalindromeWithoutString(int x) {
        if(x<0) return false;
        if(x<10) return true;

        //x>=10
        int reverseNum = 0;
        for(int temp = x; temp>0; temp/=10){
            reverseNum = reverseNum * 10 + temp%10;
        }
        return x == reverseNum;
    }

//    private static boolean isPalindromeWithoutStringReverseHalfDigits(int x){
//        if(x<0) return false;
//        if(x<10) return true;
//    }

    private static boolean isPalindromeWithString(int x){
        if(x<0) return false;
        if(x<10) return true;

        String num = Integer.toString(x);
//        return isPalindromeUsingIteration(num, 0, num.length()-1);
        return isPalindromeUsingRecursion(num, 0, num.length()-1);

    }

    private static boolean isPalindromeUsingIteration(String num, int i, int j){
        while(i<j){
            if(num.charAt(i++) != num.charAt(j--)) return false;
        }
        return true;
    }

    private static boolean isPalindromeUsingRecursion(String num, int i, int j){
        if(i>=j) return true;
        boolean ans = isPalindromeUsingRecursion(num, i+1, j-1);
        return ans && num.charAt(i) == num.charAt(j);
    }
}
