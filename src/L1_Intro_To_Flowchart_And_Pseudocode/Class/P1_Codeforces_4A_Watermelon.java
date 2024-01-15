package L1_Intro_To_Flowchart_And_Pseudocode.Class;
import java.util.Scanner;

public class P1_Codeforces_4A_Watermelon {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        isWaterMelonDivisible(w);
    }

    private static void isWaterMelonDivisible(int w){
        if(w == 2 || (w&1)==1) System.out.println("NO");
        else System.out.println("YES");
    }
}
