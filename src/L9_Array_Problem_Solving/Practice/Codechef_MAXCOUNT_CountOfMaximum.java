package L9_Array_Problem_Solving.Practice;
import java.util.Scanner;
import java.util.Arrays;
public class Codechef_MAXCOUNT_CountOfMaximum {
    //https://www.codechef.com/problems/MAXCOUNT
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            countOfMaximum(arr, n);
        }
    }

    private static void countOfMaximum(int[] arr, int n){
        /*
        The approach here is:
            1. Iterate through the array and keep track of three things -
            frequency count of the current element (freq),
            maximum frequency till now (maxFreqCount) and
            the value having the maximum frequency (valWithMaxFreq).
            2. Whenever a new element of the array is encountered
            then only go to step 3.
            3. Compare current frequency count (freq) with the
            maximum frequency count (maxFreqCount) and if freq
            is greater than only update maxFreqCount and valWithMaxFreq.
            4. If the previous element of the array is same as the
            current element then increment freq.
            5. Once outside the loop go to step 3 once again.
         */
        Arrays.sort(arr);
        int freq = 0, maxFreqCount = 0, valWithMaxFreq = 0;
        for(int i = 0; i<n; i++){
            if(i>0 && arr[i] != arr[i-1]){
                if(freq>maxFreqCount){
                    maxFreqCount = freq;
                    valWithMaxFreq = arr[i-1];
                }
                freq = 1;
            }
            else{
                freq++;
            }
        }
        if(freq>maxFreqCount){
            maxFreqCount = freq;
            valWithMaxFreq = arr[arr.length-1];
        }
        System.out.println(valWithMaxFreq + " " + maxFreqCount);
    }
}
