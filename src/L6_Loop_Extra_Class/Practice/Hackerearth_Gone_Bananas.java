package L6_Loop_Extra_Class.Practice;

import java.util.Scanner;

public class Hackerearth_Gone_Bananas {
    //https://www.hackerearth.com/practice/math/number-theory/primality-tests/practice-problems/algorithm/monks-problem-ffeebf8a/
    /*
    Question missing one condition that the bananas needs to be equally distributed
    basically check for prime, if prime then equal division not possible
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            System.out.println(divideBananas(n));
        }
    }

    private static String divideBananas(int n){
        if(n<4) return "No";
        for(int i = 2; i*i<=n; i++){
            if(n%i == 0){
                return "Yes";
            }
        }
        return "No";
    }
}
