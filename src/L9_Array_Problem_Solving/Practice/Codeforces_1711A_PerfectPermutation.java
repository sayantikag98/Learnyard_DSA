package L9_Array_Problem_Solving.Practice;

import java.util.Scanner;

public class Codeforces_1711A_PerfectPermutation {
    //https://codeforces.com/problemset/problem/1711/A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] ans = perfectPermutation(n);
            for(int i: ans){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    private static int[] perfectPermutation(int n){
        int[] ans = new int[n];
        while(n-2>=0){
            ans[n-2] = n;
            n--;
        }
        ans[ans.length - 1] = 1;
        return ans;
    }
}
