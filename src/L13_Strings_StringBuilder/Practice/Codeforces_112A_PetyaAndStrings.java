package L13_Strings_StringBuilder.Practice;
import java.util.Scanner;

public class Codeforces_112A_PetyaAndStrings {
    //https://codeforces.com/problemset/problem/112/A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(compareStrings(sc.nextLine().toLowerCase(), sc.nextLine().toLowerCase()));
    }

    private static int compareStrings(String str1, String str2){
        for(int i = 0; i<str1.length(); i++){
            if(str1.charAt(i)>str2.charAt(i)) return 1;
            if(str1.charAt(i)<str2.charAt(i)) return -1;
        }
        return 0;
    }
}
