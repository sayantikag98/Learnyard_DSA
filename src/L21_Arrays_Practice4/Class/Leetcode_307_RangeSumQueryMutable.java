package L21_Arrays_Practice4.Class;

public class Leetcode_307_RangeSumQueryMutable {
    //https://leetcode.com/problems/range-sum-query-immutable/description/
    public static void main(String[] args) {
        int[][] query = {{0,2},{2,5},{0,5}};
        NumArray na = new NumArray(new int[]{-2,0,3,-5,2,-1});
        for(int[] q: query){
            System.out.println(na.sumRange(q[0], q[1]));
        }
    }
}

class NumArray {
    int[] arr;
    int n;
    int[] prefixSum;

    NumArray(int[] nums) {
        arr = nums;
        n = arr.length;
        prefixSum = new int [n];
        prefixSum[0] = arr[0];
        for(int i = 1; i<n; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
    }

    int sumRange(int left, int right) {
        //O(1)
        return prefixSum[right] - (left == 0 ? 0 : prefixSum[left-1]);
    }
}