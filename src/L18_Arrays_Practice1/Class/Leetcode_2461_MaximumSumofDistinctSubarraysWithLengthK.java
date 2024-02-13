package L18_Arrays_Practice1.Class;
import java.util.HashMap;

public class Leetcode_2461_MaximumSumofDistinctSubarraysWithLengthK {
    //https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/description/

    public static void main(String[] args) {
        //***** this problem **cannot be solved using HashSet** it will fail for test case where nums = {9,9,9,1,2,3} ******
        //When we encounter a subarray of size k, having all duplicate elements, then if we simply discard it from set,
        // that single will be removed and our set size will become zero and we will loose access to all previous elements.
        int[] nums = {9,9,9,1,2,3};
        int k = 3;
        System.out.println(maximumSubarraySum(nums, k));
        System.out.println(maximumSubarraySumBetterApproach(nums, k));
    }

    private static long maximumSubarraySumBetterApproach(int[] nums, int k){
        //TC=>O(n)
        //SC=>O(n)
        /*
        Approach:
        1. At first store the frequency count of all the element of the first window size k,
            if map size is equal k then the subarray contains all distinct element. Get the sum of all these elements,
            if the subarray contains all distinct element then assign sum to maxSum till now.
        2. After the first window is done, for each successive window decrease the frequency count of the first element
            of the previous window and increase the frequency count of the last element of the current window in a
            sliding window approach.
        3. If for the element getting removed from the current window the frequency count becomes 0, then remove this
            element from map.
        4. If the map size is equal k then its element are distinct so if the sum becomes maximum then assign it to maxSum
         */
        int i = 0, j = 0;
        long sum = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        while(j<k){
            sum+=nums[j];
            freq.put(nums[j], freq.getOrDefault(nums[j], 0)+1);
            j++;
        }
        long maxSum = freq.size() == k ? sum : 0;
        while(j<nums.length){
            sum+=(nums[j]-nums[i]);
            freq.put(nums[i], freq.getOrDefault(nums[i], 0)-1);
            freq.put(nums[j], freq.getOrDefault(nums[j], 0)+1);
            if(freq.get(nums[i]) == 0) freq.remove(nums[i]);
            if(freq.size() == k) maxSum = Math.max(maxSum, sum);
            i++;
            j++;
        }
        return maxSum;
    }

    private static long maximumSubarraySumCompactImplementationUsingHashMap(int[] nums, int k){
        int i = 0, j = 0;
        long sum = 0, maxSum = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        while(j<nums.length){
            sum+=nums[j];
            freq.put(nums[j], freq.getOrDefault(nums[j], 0)+1);
            //for the successive windows
            if(j>=k){
                sum-=nums[i];
                freq.put(nums[i], freq.getOrDefault(nums[i], 0)-1);
                if(freq.get(nums[i]) == 0) freq.remove(nums[i]);
                i++;
            }
            //update maxSum only when first window sum is computed and not before that
            if(j>=k-1 && freq.size() == k) maxSum = Math.max(maxSum, sum);
            j++;
        }
        return maxSum;
    }

    private static long maximumSubarraySum(int[] nums, int k) {
        //TC=>O(n)
        //SC=>O(n)
        /*
        Every time a new element is added in the hashmap or removed from the hashmap we should keep track of the
        total number of elements with count = 1, if this is equal to k then it is the subarray with all distinct element
         */
        int i = 0, j = 0, count = 0;
        long sum = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        //count represents the number of elements in the current window of size k with the frequency count of 1
        while(j<k){
            sum+=nums[j];
            int val = freq.getOrDefault(nums[j], 0);
            freq.put(nums[j], ++val);
            //if the frequency count has increased to 1 then it should be added in count
            //if the frequency count becomes 2 then it was previously included in count now it needs to be excluded
            if(val == 1) count++;
            else if(val == 2) count--;
            j++;
        }
        long maxSum = count == k ? sum : 0;
        while(j<nums.length){
            sum+=nums[j]-nums[i];
            int freqCountA = freq.getOrDefault(nums[i], 0);
            freq.put(nums[i], --freqCountA);
            int freqCountB = freq.getOrDefault(nums[j], 0);
            freq.put(nums[j], ++freqCountB);

            //here MADE MISTAKE, count increment or decrement for the element getting removed and the element getting added
            // should be separate

            //if the frequency count of element getting removed has decreased to 1 then it should be added in count
            // and if it is decreased to 0 then it was previously included in count now it needs to be excluded
            if(freqCountA == 1) count++;
            else if(freqCountA == 0) count--;

            //if the frequency count of element getting added has increased to 1 then it should be added in count
            // and if it is increased to 2 then it was previously included in count now it needs to be excluded
            if(freqCountB == 1) count++;
            else if(freqCountB == 2) count--;


            if(count == k) maxSum = Math.max(maxSum, sum);
            i++;
            j++;
        }
        return maxSum;
    }
}
