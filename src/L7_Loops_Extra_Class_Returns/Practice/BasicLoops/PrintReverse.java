package L7_Loops_Extra_Class_Returns.Practice.BasicLoops;

import java.util.Scanner;

public class PrintReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), temp = n;
        while(temp != 0){
            System.out.print(temp%10);
            temp/=10;
        }
    }
}
