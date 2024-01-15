package L7_Loops_Extra_Class_Returns.Practice.BasicLoops;

import java.util.Scanner;

public class PowerOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt(), exponent = sc.nextInt();
        int ans = 1;
        for(int i = 1; i<=exponent; i++){
            ans*=base;
        }
        System.out.println(ans);
    }
}
