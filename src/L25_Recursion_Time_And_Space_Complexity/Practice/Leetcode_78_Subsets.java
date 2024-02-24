package L25_Recursion_Time_And_Space_Complexity.Practice;
import java.util.ArrayList;
import java.util.List;

public class Leetcode_78_Subsets {
    private static final List<List<Integer>> ans = new ArrayList<>(); //make this global constant

    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1,2,3}));
    }
    private static List<List<Integer>> subsets(int[] nums) {
//        subsetsRecursiveUsingBacktracking(nums, 0, new ArrayList<>());
//        subsetsRecursiveUsingBacktrackingForLoop(nums, 0, new ArrayList<>());
//        subsetsIterative(nums);
        subsetsUsingBitManipulation(nums);
        return ans;
    }

    private static void subsetsRecursiveUsingBacktracking(int[] nums, int i, List<Integer> sub){
        if(i==nums.length){
            //should always make a new arraylist and add
            //if sub is directly added then when elements are being removed sub will become empty so ans will become like this [[],[],[],...]
            ans.add(new ArrayList<>(sub)); //MADE MISTAKE
            return;
        }
        sub.add(nums[i]);
        subsetsRecursiveUsingBacktracking(nums, i+1, sub);
        //create an Integer object and pass to remove otherwise nums[i] would be considered index, and it will become out of bound
        //either do sub.remove(Integer.valueOf(nums[i])) or sub.remove(sub.size()-1) or sub.removeLast()
        sub.removeLast(); //MADE MISTAKE
        subsetsRecursiveUsingBacktracking(nums, i+1, sub);
    }

    private static void subsetsRecursiveUsingBacktrackingForLoop(int[] nums, int i, List<Integer> sub){
        ans.add(new ArrayList<>(sub));
        for(; i<nums.length; i++){
            sub.add(nums[i]);
            subsetsRecursiveUsingBacktrackingForLoop(nums, i+1, sub);
            sub.removeLast();
        }
    }

    private static void subsetsIterative(int[] nums){
        /*
        TC => 1+2+4+8+...+2^k => O(2^n)
        SC => List is needed for storing the answer it may not be considered for space complexity
         */
        ans.add(new ArrayList<>());
        for(int ele: nums){
            int n = ans.size();
            for(int i = 0; i<n; i++){
                List<Integer> sub = new ArrayList<>(ans.get(i));
                sub.add(ele);
                ans.add(sub);
            }
        }
    }

    private static void subsetsUsingBitManipulation(int[] nums){
        //TC => O(2^n * n)
        //SC => O(1) (List sub is for answer computing)
        int n = nums.length;
        for(int i = 0; i<(1<<n); i++){
            int ele = i, idx = 0;
            List<Integer> sub = new ArrayList<>();
            while(ele!=0){
                //bit set
                if((ele&1) != 0){
                    sub.add(nums[idx]);
                }
                idx++;
                ele>>=1;
            }
            ans.add(sub);
        }
    }

}
