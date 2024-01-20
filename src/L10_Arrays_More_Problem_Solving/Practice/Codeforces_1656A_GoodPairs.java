package L10_Arrays_More_Problem_Solving.Practice;

import java.util.Scanner;

public class Codeforces_1656A_GoodPairs {
    //https://codeforces.com/problemset/problem/1656/A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            goodPairs(arr, n);
        }
    }

    private static void goodPairs(int[] arr, int n){
        /*
        If the i points to the minimum element and j points to the maximum element
        then for all numbers in between (k) the relationship |ai−ak|+|ak−aj|=|ai−aj| will hold

        suppose we have three numbers a, b, c such that b lies in between a and c
        then b-a + c-b will be equal to c-a for any a, b, c
         */
        int min = 0, max = 0;
        for(int i = 1; i<n; i++){
            if(arr[min]>arr[i]){
                min = i;
            }
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        System.out.print((min+1)+" "+(max+1));
        System.out.println();
    }
}
