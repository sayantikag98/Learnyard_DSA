package L7_Loops_Extra_Class_Returns.Practice.BasicLoops;

import java.util.Scanner;

public class FcatorialOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), fact = 1;
        for(int i = 2; i<=n; i++){
            fact*=i;
        }
        System.out.println(fact);
    }
}
