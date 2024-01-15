package L6_Loop_Extra_Class.Practice;

import java.util.Scanner;

public class Hackerearth_Does_It_Divide {
    //https://www.hackerearth.com/practice/math/number-theory/primality-tests/practice-problems/algorithm/does-it-divide-3c60b8fb/
    public static void main(String[] args) {
        /*
        S = 1+2+3+4+......+(n-1)+n = n(n+1)/2
        P = 1*2*3*4*......*(n-1)*n

        we have to basically check whether P is divisible by S or not

        P/S = 1*2*3*.....*(n-1)*n/n(n+1)/2
            = 1*2*......*(n-1)*2/(n+1)

        now if (n+1) is prime then it is only divisible by itself and
        (n+1) is not present in the numerator

        so if (n+1) is prime then it will not be divisible otherwise it will be

        there is an edge case when n=1 because when n=1 then P/S = 1,
        so it is divisible but n+1 for n=1 is prime
         */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            if(n==1 || !isPrime(n+1)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }

    private static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i = 2; i*i<=n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
