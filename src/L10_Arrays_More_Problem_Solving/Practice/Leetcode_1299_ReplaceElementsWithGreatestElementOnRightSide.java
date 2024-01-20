package L10_Arrays_More_Problem_Solving.Practice;

import java.util.Scanner;
import java.util.Arrays;

public class Leetcode_1299_ReplaceElementsWithGreatestElementOnRightSide {
    //https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/description/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(replaceElements(arr)));
    }

    private static int[] replaceElements(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1] = -1;
        int maxSoFar = arr[n-1];
        for(int i = n-2; i>=0; i--){
            maxSoFar = Math.max(maxSoFar, arr[i+1]);
            ans[i] = maxSoFar;
        }
        return ans;
    }
}
