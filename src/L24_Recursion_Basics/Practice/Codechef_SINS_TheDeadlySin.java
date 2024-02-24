package L24_Recursion_Basics.Practice;
import java.util.Scanner;

public class Codechef_SINS_TheDeadlySin {
    //https://www.codechef.com/problems/SINS
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            int m = sc.nextInt(),
                    b = sc.nextInt();
            System.out.println(noOfChocolates1(m, b));
        }
    }

    private static int noOfChocolates(int m, int b){
        while(true){
            if(m == b || m == 0 || b == 0) return m+b;
            if(m>b) {
                m%=b;
                if(m==0) return 2*b;
            }
            else {
                b%=m;
                if(b==0) return 2*m;
            }
        }
    }

    private static int noOfChocolates1(int m, int b){
        if(m == b || m == 0 || b == 0) return m+b;
        if(m>b)
        {
            if(m%b == 0) return 2*b;
            return noOfChocolates1(m%b, b);
        }
        else{
            if(b%m == 0) return 2*m;
            return noOfChocolates1(m, b%m);
        }
    }
}
