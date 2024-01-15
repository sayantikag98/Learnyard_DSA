package L8_Intro_To_Arrays.Practice;

import java.util.Scanner;

public class GFG_CheckIfArrayIsSorted {
    //https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(arraySortedOrNot(arr, arr.length));
    }

    private static boolean arraySortedOrNot(int[] arr, int n) {
        for(int i = 1; i<n; i++){
            if(arr[i-1]>arr[i]) return false;
        }
        return true;
    }
}
