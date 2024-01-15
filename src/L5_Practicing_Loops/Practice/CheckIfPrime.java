package L5_Practicing_Loops.Practice;
import java.util.Scanner;

public class CheckIfPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }

    public static boolean isPrime(int N){
        // code here
        /*
        1 is not a prime number
         */
        boolean isPrime = true;
        for(int i = 2; i*i<=N; i++){
            if(N%i==0){
                isPrime = false;
                break;
            }
        }
        return N>1 && isPrime;
    }
}
