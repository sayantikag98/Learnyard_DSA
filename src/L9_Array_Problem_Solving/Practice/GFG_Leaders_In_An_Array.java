package L9_Array_Problem_Solving.Practice;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class GFG_Leaders_In_An_Array {
    //https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(leaders(arr, n));
    }

    private static ArrayList<Integer> leaders(int[] arr, int n){
        // Your code here
        int maxTillNow = Integer.MIN_VALUE;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = n-1; i>=0; i--){
            if(arr[i]>=maxTillNow){
                ans.add(arr[i]);
                maxTillNow = arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
