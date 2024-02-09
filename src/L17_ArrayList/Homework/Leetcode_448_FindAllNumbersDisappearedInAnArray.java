package L17_ArrayList.Homework;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

public class Leetcode_448_FindAllNumbersDisappearedInAnArray {
    //https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbersUsingHashSet(nums));
        System.out.println(findDisappearedNumbersInPlace(nums));
        System.out.println(findDisappearedNumbersUsingArray(nums));

    }

    private static List<Integer> findDisappearedNumbersUsingHashSet(int[] nums) {
        //TC=>O(n)
        //SC=>O(n)
        HashSet<Integer> hs = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        for(int val: nums){
            hs.add(val);
        }

        for(int i = 1; i<=nums.length; i++){
            if(!hs.contains(i)) ans.add(i);
        }
        return ans;
    }

    private static List<Integer> findDisappearedNumbersUsingArray(int[] nums) {
        //TC=>O(n)
        //SC=>O(n)
        int n = nums.length;
        boolean[] isFound = new boolean[n];
        List<Integer> ans = new ArrayList<>();
        for(int val: nums){
            isFound[val-1] = true;
        }

        for(int i = 0; i<n; i++){
            if(!isFound[i]) ans.add(i+1);
        }
        return ans;
    }

    private static List<Integer> findDisappearedNumbersInPlace(int[] nums) {
        //TC=>O(n)
        //SC=>O(1)
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        for(int val: nums){
            int idx = Math.abs(val) - 1; //val could be negative so Math.abs(val) and for 0 based index do minus 1
            if(nums[idx]>0) nums[idx]*=-1; //go to that index and make it negative
        }

        for(int i = 0; i<n; i++){
            if(nums[i]>0) ans.add(i+1); // add the indices of the numbers which are still positive
            else nums[i]*=-1; // revert the state of the numbers which were made as negative
        }

        return ans;
    }

}
