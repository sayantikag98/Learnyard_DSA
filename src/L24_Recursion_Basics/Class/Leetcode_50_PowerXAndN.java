package L24_Recursion_Basics.Class;

public class Leetcode_50_PowerXAndN {
    //https://leetcode.com/problems/powx-n/description/
    public static void main(String[] args) {
        System.out.println(myPow(4,-2));
    }

    public static double myPow(double x, int n) {
        double ans = helper(x, Math.abs(n));
        if(n<0) return 1/ans;
        return ans;
    }

    private static double helper(double x, int n){
        if(n == 0) return 1;
        double ans = helper(x, n/2);
        return (n&1)==0 ? ans*ans : ans*ans*x;
    }
}
