package L5_Practicing_Loops.Practice;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPowerOfTwo(num));
    }

    private static boolean isPowerOfTwo(int n) {
        /*
        if the number is less than or equal to zero it is not power of 2
         */
//        if(n<=0) return false;
//        while(n%2 == 0){
//            n/=2;
//        }
//        return n==1;

        /*
        Using bitwise operator
         */
         return n>0 && (n&n-1)==0;
    }
}


