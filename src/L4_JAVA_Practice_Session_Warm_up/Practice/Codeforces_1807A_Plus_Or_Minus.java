package L4_JAVA_Practice_Session_Warm_up.Practice;

import java.util.Scanner;

public class Codeforces_1807A_Plus_Or_Minus {
    //https://codeforces.com/problemset/problem/1807/A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a, b, c;
        while (t-- > 0) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if (a + b == c) {
                System.out.println('+');
            } else {
                System.out.println('-');
            }
        }
    }
}
