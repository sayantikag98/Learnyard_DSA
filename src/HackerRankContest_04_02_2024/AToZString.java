package HackerRankContest_04_02_2024;
import java.util.Scanner;

public class AToZString {
    //https://www.hackerrank.com/contests/learnyard-jan-2024/challenges/a-to-z-string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(maxLengthSubstring(str));
    }

    private static int maxLengthSubstring(String str){

        int aIdx = str.indexOf('A');
        int zIdx = str.lastIndexOf('Z');
        if(aIdx<zIdx) return zIdx-aIdx+1;
        return -1;
    }
}
