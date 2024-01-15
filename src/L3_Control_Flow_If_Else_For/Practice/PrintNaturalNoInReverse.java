package L3_Control_Flow_If_Else_For.Practice;

import java.util.Scanner;

public class PrintNaturalNoInReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n; i>0; i--){
            System.out.print(i+" ");
        }
    }
}
