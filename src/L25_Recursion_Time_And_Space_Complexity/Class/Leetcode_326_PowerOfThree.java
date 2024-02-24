package L25_Recursion_Time_And_Space_Complexity.Class;

public class Leetcode_326_PowerOfThree {
    //https://leetcode.com/problems/power-of-three/description/
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
    }

    public static boolean isPowerOfThree(int n) {
        if(n<1) return false;
        if(n==1) return true;
        if(n%3 != 0) return false;
        return isPowerOfThree(n/3);
    }
}
