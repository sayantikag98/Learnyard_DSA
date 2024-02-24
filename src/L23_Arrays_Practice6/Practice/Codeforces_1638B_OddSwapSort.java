package L23_Arrays_Practice6.Practice;

import java.util.Scanner;

public class Codeforces_1638B_OddSwapSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(canBeSorted(arr, n));
        }
    }

    private static String canBeSorted(int[] arr, int n){
        if(n == 1) return "Yes";
        for(int i = 1; i<n; i++){
            int j = i;
            while(j>=1 && arr[j]<arr[j-1] && (((arr[j]&1)==0 && (arr[j-1]&1)==1) || ((arr[j]&1)==1 && (arr[j-1]&1)==0))){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
            if(j>=1 && arr[j]<arr[j-1]) return "No";
        }
        return "Yes";
    }
}
