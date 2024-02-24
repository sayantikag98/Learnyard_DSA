package L24_Recursion_Basics.Class;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static int factorial(int n){
        //base case
        //0! = 1 and 1! = 1
        if(n == 0 || n == 1) return 1;
        return n * factorial(n-1);
    }
}
