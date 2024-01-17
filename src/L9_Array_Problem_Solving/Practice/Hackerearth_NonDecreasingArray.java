package L9_Array_Problem_Solving.Practice;

import java.util.Scanner;
public class Hackerearth_NonDecreasingArray {
    //https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/make-it-non-decreasing-7d3391fd/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            nonDecreasingArray(arr, n);
        }
    }

    private static void nonDecreasingArray(int[] arr, int n){
        long[] ans = new long[n];
        ans[0] = arr[0];
        for(int i = 1; i<n; i++){
            if(ans[i-1]<=arr[i]){
                ans[i] = arr[i];
            }
            else{
                long rem = ans[i-1] % arr[i];
                if(rem == 0){
                    ans[i] = ans[i-1];
                }
                else{
                    ans[i] = ans[i-1] + (arr[i] - rem);
                }
            }
        }
        for(long i: ans){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
