package HackerRankContest_04_02_2024;
import java.util.Scanner;

public class ShiftedStringTransformation {
    //https://www.hackerrank.com/contests/learnyard-jan-2024/challenges/shifted-string-transformation
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine(),
                str2 = sc.nextLine();
        System.out.println(stringTransformation(str1, str2));
    }

    private static String stringTransformation(String str1, String str2){
        int k = leftTransformation(str1.charAt(0), str2.charAt(0));
        for(int i = 1; i<str1.length(); i++){
            if(leftTransformation(str1.charAt(i), str2.charAt(i)) != k) return "No";
        }
        return "Yes";
    }

    private static int leftTransformation(char ch1, char ch2){
        /*
        26 because there will be only 26 lowercase english alphabets

        Case 1: a would be left transformed to z
        ch1: a
        ch2: z
        unicode of a: 97
        unicode of z: 122
        ch1-ch2 is negative
        (ch1-ch2+26)%26 => (97-122+26)%26 => (-22+26)%26 => 4%26 => 4


        Case 2: c would be left transformed to a
        ch1: c
        ch2: a
        unicode of ch1: 99
        unicode of ch2: 97
        ch1-ch2 is positive
        (ch1-ch2+26)%26 => (99-97+26)%26 => (2+26)%26 => 28%26 => 2
         */
        return (ch1-ch2+26)%26;
    }
}
