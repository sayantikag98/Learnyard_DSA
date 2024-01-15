package L6_Loop_Extra_Class.Practice;

import java.util.Scanner;

public class Codeforces_1915A_Odd_One_Out {
    //https://codeforces.com/contest/1915/problem/A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            if(a == b){
                System.out.println(c);
            }
            else if(b == c){
                System.out.println(a);
            }
            else{
                System.out.println(b);
            }
        }
    }
}
