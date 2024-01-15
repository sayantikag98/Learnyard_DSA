package L6_Loop_Extra_Class.Class;

import java.util.Scanner;

import static L5_Practicing_Loops.Practice.CheckIfPrime.isPrime;

public class PrintPrimeFrom1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            if(isPrime(i)){
                System.out.println(i+" -> Prime");
            }
            else{
                System.out.println(i+" -> Not Prime");
            }
        }
    }
}
