package L13_Strings_StringBuilder.Practice;
import java.util.Scanner;
import java.util.HashMap;

public class Codeforces_977B_TwoGram {
    //https://codeforces.com/problemset/problem/977/B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(mostFreqTwoGram(str, n));
    }

    private static String mostFreqTwoGram(String str, int n){
        HashMap<String, Integer> freq = new HashMap<>();
        int maxCount = 0;
        String ans = str.substring(0, 2);
        for(int i = 0; i<n-1; i++){
            String twoGram = str.substring(i, i+2);
            int freqCount = freq.getOrDefault(twoGram, 0);
            freq.put(twoGram, ++freqCount);
            if(maxCount<freqCount){
                maxCount = freqCount;
                ans = twoGram;
            }
        }
        return ans;
    }
}
