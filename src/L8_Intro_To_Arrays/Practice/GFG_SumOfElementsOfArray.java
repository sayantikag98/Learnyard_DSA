package L8_Intro_To_Arrays.Practice;

import java.util.Scanner;

public class GFG_SumOfElementsOfArray {
    //https://www.geeksforgeeks.org/problems/sum-of-array2326/1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sum(arr, arr.length));
    }

    private static int sum(int[] arr, int n) {
        int sum = 0;
        for(int element: arr){
            sum+=element;
        }
        return sum;
    }
}
