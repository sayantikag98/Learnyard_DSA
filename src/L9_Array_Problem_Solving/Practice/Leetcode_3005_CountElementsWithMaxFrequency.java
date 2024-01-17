package L9_Array_Problem_Solving.Practice;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Leetcode_3005_CountElementsWithMaxFrequency {
    //https://leetcode.com/problems/count-elements-with-maximum-frequency/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxFrequencyElementsUsingTwoPass(arr));
        System.out.println(maxFrequencyElementsUsingSinglePass(arr));
    }

    private static int maxFrequencyElementsUsingTwoPass(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int maxCount = 0;
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            maxCount = Math.max(maxCount, freq.get(num));
        }
        int count = 0;
        for(Map.Entry<Integer, Integer> freqPairs: freq.entrySet()){
            if(freqPairs.getValue() == maxCount) count++;
        }
        return maxCount*count;
    }

    private static int maxFrequencyElementsUsingSinglePass(int[] nums){
        HashMap<Integer, Integer> freq = new HashMap<>();
        int maxFreq = 0, cntMaxFreq = 0;
        for(int num: nums){
            freq.put(num, freq.getOrDefault(num, 0)+1);
            int currEleFreq = freq.get(num);
            if(currEleFreq>maxFreq){
                maxFreq = currEleFreq;
                cntMaxFreq = 1;
            }
            else if(currEleFreq == maxFreq){
                cntMaxFreq++;
            }
        }
        return cntMaxFreq * maxFreq;
    }
}
