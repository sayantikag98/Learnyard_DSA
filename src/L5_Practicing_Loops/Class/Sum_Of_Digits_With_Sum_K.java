package L5_Practicing_Loops.Class;
import java.util.Scanner;
import static L4_JAVA_Practice_Session_Warm_up.Class.SumOfDigits.sumOfDigits;

public class Sum_Of_Digits_With_Sum_K {
    public static void main(String[] args) {
        /*
        Given a value of N, print only those numbers from 1 to N whose sum of
        digits = K
         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        for(int i = 1; i<=n; i++){
            if(sumOfDigits(i) == k){
                System.out.print(i+" ");
            }
        }

    }
}
