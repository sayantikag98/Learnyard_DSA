package L3_Control_Flow_If_Else_For.Practice;
import java.util.Scanner;

public class PrintEvenNosDivisibleBy7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            if((i&1)==0 && i%7==0){
                System.out.print(i+" ");
            }
        }
    }
}
