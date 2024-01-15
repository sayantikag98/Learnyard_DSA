package L5_Practicing_Loops.Practice;
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(gcdIterative(a, b));
        System.out.println(gcdRecursive(a, b));
    }

    public static int gcdIterative(int a, int b){
        while(a%b != 0){
            int rem = a%b;
            a = b;
            b = rem;
        }
        return b;
    }

    public static int gcdRecursive(int a, int b){
        if(a%b == 0) return b;
        return gcdRecursive(b, a%b);

//        return (a%b == 0) ? b : gcd(b, a%b);
    }

}
