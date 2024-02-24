package L25_Recursion_Time_And_Space_Complexity.Practice;
import java.util.*;

public class CodeStudio_SubarraysWithSumK {
    //https://www.codingninjas.com/studio/problems/subarrays-with-sum-%E2%80%98k'_6922076
    public static void main(String[] args) {
        int[] a = {1,2,3,1,1,1};
        int k = 3;
//        System.out.println(subarraysWithSumK(a, k));
        System.out.println(subarraysWithSumKRecursive(a, k));
    }

    private static List<List<Integer>> subarraysWithSumKRecursive(int[] a, long k){
        List<List<Integer>> ans = new ArrayList<>();
        subarraysWithSumKRecursiveHelper(a, a.length, k, 0, 0, 0, new LinkedList<>(), ans);
        return ans;
    }

    private static void subarraysWithSumKRecursiveHelper(int[] a, int n, long k, long sum, int i, int j, List<Integer> sub, List<List<Integer>> ans){
        //BOTH GIVING STACK OVERFLOW ERROR
        /*
        IMPLEMENTATION 1:

        if(sum == k){
            ans.add(new ArrayList<>(sub));
        }
        if(i<n && sum>k){
            sum-=a[i];
            sub.remove(0);
            subarraysWithSumKRecursiveHelper(a, n, k, sum, i+1, j, sub, ans);
        }
        else if(j<n && sum<=k){
            sum+=a[j];
            sub.add(a[j]);
            subarraysWithSumKRecursiveHelper(a, n, k, sum, i, j+1, sub, ans);
        }

         */

        /*
        IMPLEMENTATION 2:
         */

        while(i<n && sum>k){
            sum-=a[i];
            sub.remove(0);
            i++;
        }

        if(sum == k){
            ans.add(new ArrayList<>(sub));
        }

        if(j<n && sum<=k){
            sum+=a[j];
            sub.add(a[j]);
            subarraysWithSumKRecursiveHelper(a, n, k, sum, i, j+1, sub, ans);
        }
    }
    private static List< List < Integer > > subarraysWithSumK(int []a, long k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sub = new LinkedList<>();
        long sum = 0;
        for(int i = 0, j = 0; j<a.length; j++){
            sum += a[j];
            sub.add(a[j]);
            while(sum>k){
                sum -= a[i];
                i++;
                sub.removeFirst();
            }
            if(sum == k){
                ans.add(new ArrayList<>(sub));
            }
        }
        return ans;
    }
}
