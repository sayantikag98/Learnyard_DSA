package L1_Intro_To_Flowchart_And_Pseudocode.Practice;
import java.util.Scanner;

public class P4_SumOfAllOddNumbersFrom1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0, num = 1;
        while(num<=n){
            sum+=num;
            num+=2;
        }
        System.out.println(sum);
    }
}
