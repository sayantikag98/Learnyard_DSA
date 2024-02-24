package L25_Recursion_Time_And_Space_Complexity.Class;

public class FactorialOfN {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static int factorial(int n){
        if(n <= 1) return 1;
        return n*factorial(n-1);
    }
}
