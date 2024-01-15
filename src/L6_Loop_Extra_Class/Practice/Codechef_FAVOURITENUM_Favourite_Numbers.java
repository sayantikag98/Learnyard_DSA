package L6_Loop_Extra_Class.Practice;

import java.util.Scanner;

public class Codechef_FAVOURITENUM_Favourite_Numbers {
    //https://www.codechef.com/problems/FAVOURITENUM
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            if((a&1)==0 && a%7==0){
                System.out.println("Alice");
            }
            else if((a&1)==1 && a%9==0){
                System.out.println("Bob");
            }
            else{
                System.out.println("Charlie");
            }
        }
    }
}
