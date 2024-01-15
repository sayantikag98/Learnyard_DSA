package L5_Practicing_Loops.Class;

import java.util.Scanner;

public class CheckIfPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 0) System.out.println("Not prime");
        else{
            boolean isPrime = true;
            for(int i = 2; i*i<=n; i++){
                if(n%i==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) System.out.println("Prime");
            else System.out.println("Not prime");
        }
    }
}

/*
12 =>
1 * 12
2 * 6
3 * 4
4 * 3
6 * 2
12 * 1
 */
