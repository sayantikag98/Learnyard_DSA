package L1_Intro_To_Flowchart_And_Pseudocode.Class;
import java.util.Scanner;

public class P2_CheckIfPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkIfPrime(num);
    }

    private static void checkIfPrime(int num){
        if(num == 2){
            System.out.println("Prime");
            return;
        }
        int factor = 2;
        while(factor<num){
            if(num%factor == 0){
                System.out.println("Not Prime");
                return;
            }
            factor++;
        }
        System.out.println("Prime");
    }
}
