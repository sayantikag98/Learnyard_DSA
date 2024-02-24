package L24_Recursion_Basics.Class;

public class NthFibonacci {
    public static void main(String[] args) {
        System.out.println(nThFibonacci(5));
    }

    private static int nThFibonacci(int n){
        if(n==0 || n==1) return n;
        return nThFibonacci(n-1) + nThFibonacci(n-2);
    }
}
