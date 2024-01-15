package L8_Intro_To_Arrays.Practice;

import java.util.Scanner;

public class GFG_FindMaximumAndMinimumElementOfArray {
    //https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] arr = new long[(int)n];
        for(long i = 0; i<n; i++){
            arr[(int)i] = sc.nextLong();
        }
        Pair ans = getMinMax(arr, n);
        ans.print();
    }

    private static Pair getMinMax(long[] a, long n)
    {
        long minEle = a[0], maxEle = a[0];
        for(long i = 0; i<n; i++){
            if(a[(int)i]>maxEle) maxEle = a[(int)i];
            if(a[(int)i]<minEle) minEle = a[(int)i];
        }
        return new Pair(minEle, maxEle);
    }
}

class Pair{
    long first, second;

    public Pair(long first, long second){
        this.first = first;
        this.second = second;
    }

    public void print(){
        System.out.println("The minimum is "+this.first);
        System.out.println("The maximum is "+this.second);
    }
}
