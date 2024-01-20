package L10_Arrays_More_Problem_Solving.Practice;

import java.util.*;

public class Leetcode_1207_UniqueNumberOfOccurrences {
    //https://leetcode.com/problems/unique-number-of-occurrences/description/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(uniqueOccurrences(arr));
//        hashSetDemo();
    }

    private static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> freqCount = new HashMap<>();
        for(int ele: arr){
            freqCount.put(ele, freqCount.getOrDefault(ele, 0) + 1);
        }
        HashSet<Integer> uniqueCount = new HashSet<>();
        for(int count: freqCount.values()){
            if(uniqueCount.contains(count)) return false;
            uniqueCount.add(count);
        }
        return true;
    }

    private static void hashSetDemo(){
        HashMap<Integer, Integer> hm = new HashMap<>();

        hm.put(1, 10);
        hm.put(2, 20);
        hm.put(3, 30);
        hm.put(4, 40);

        Map<Integer, Integer> hm1 = new HashMap<>(hm);

        HashSet<Integer> hs = new HashSet<>(hm1.values());
        Set<Integer> hs1 = new HashSet<>(hs);

        for(Map.Entry<Integer, Integer> entry : hm1.entrySet()){
            System.out.print(entry+" ");
        }
        System.out.println();

        for(int val: hs1){
            System.out.print(val+" ");
        }
        System.out.println();

    }
}
