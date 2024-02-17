package L21_Arrays_Practice4.Class;

import java.util.Arrays;

public class RangeQuery {
    public static void main(String[] args) {
        /*
        Given an array of all zeroes and q queries,
        1. Each query has l, r, 1 meaning 1 should be added to arr[l], arr[l+1], arr[l+2], .... arr[r]
        2. Print the final state after all queries are processed
         */
        int[][] query = {{2,4},{3,6},{1,4}};
        NumArray1 na = new NumArray1(new int[]{0,0,0,0,0,0,0,0});
        for(int[] q: query){
//            na.sumRange(q[0], q[1]);
            na.sumRangeOptimized(q[0], q[1]);
        }
        na.print();
    }
}

class NumArray1 {
    int[] arr;
    int n;

     NumArray1(int[] nums) {
        arr = nums;
        n = arr.length;
    }

    void sumRange(int left, int right) {
        //0<=left<=right<n
        for(int i = left; i <= right; i++){
            arr[i]+=1;
        }
    }

    void sumRangeOptimized(int left, int right){
         arr[left]+=1;
         if(right != n-1) arr[right+1]-=1;
    }

    void print(){
        System.out.print(arr[0]+" ");
        for(int i = 1; i<n; i++){
            arr[i]+=arr[i-1];
            System.out.print(arr[i]+" ");
        }
    }
}
