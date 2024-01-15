package L5_Practicing_Loops.Class;

import java.util.Scanner;

import static L4_JAVA_Practice_Session_Warm_up.Class.SumOfDigits.sumOfDigits;

public class FirstNNosWithDigitSumEqualK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), counter = 0, i = 1;
        while(counter < n){
            if(sumOfDigits(i) == k){
                System.out.print(i+" ");
                counter++;
            }
            i++;
        }
    }
}
