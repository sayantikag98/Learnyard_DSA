package L3_Control_Flow_If_Else_For.Practice;

import java.util.Scanner;

public class SumOfEvenNoFrom1ToN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfEvenNos(n));
    }

    private static int sumOfEvenNos(int n){
        int sum = 0;
        for(int i = 1; i<=n; i++){
            if((i&1)==0){
                sum+=i;
            }
        }
        return sum;
    }
}
