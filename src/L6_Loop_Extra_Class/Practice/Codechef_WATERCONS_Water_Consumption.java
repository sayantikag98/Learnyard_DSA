package L6_Loop_Extra_Class.Practice;

import java.util.Scanner;

public class Codechef_WATERCONS_Water_Consumption {
    //https://www.codechef.com/problems/WATERCONS
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            if(x>=2000) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
