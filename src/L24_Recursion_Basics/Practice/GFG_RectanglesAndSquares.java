package L24_Recursion_Basics.Practice;

public class GFG_RectanglesAndSquares {
    //https://practice.geeksforgeeks.org/contest/job-a-thon-11-hiring-challenge/problems
    public static void main(String[] args) {
        System.out.println(minimumMoves(2,3));
    }
    public static int minimumMoves(int A, int B) {
        return helper(A,B,0);
    }

    private static int helper(int A, int B, int sum){
        if(A <= 1 || B <=1 ) return sum+A*B;
        if(A>B){
            return helper(A%B, B, sum+A/B);
        }
        return helper(A, B%A, sum+B/A);
    }
}
