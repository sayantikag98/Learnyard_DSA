package L16_TimeAndSpaceComplexity;

import java.util.Arrays;

public class Leetcode_88_MergeSortedArray {
    //https://leetcode.com/problems/merge-sorted-array/description/
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
        int m = 3, n = 3;
//        merge(nums1, m, nums2, n);
        mergeWithoutExtraSpace(nums1, m, nums2, n);
//        mergeBruteForce(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        //TC=>O(n+m)
        //SC=>O(m+n)
        int[] mergedArray = new int[m+n];
        int i = 0, j = 0, k = 0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                mergedArray[k++] = nums1[i++];
            }
            else{
                mergedArray[k++] = nums2[j++];
            }
        }
        while(i<m){
            mergedArray[k++] = nums1[i++];
        }
        while(j<n){
            mergedArray[k++] = nums2[j++];
        }
        System.arraycopy(mergedArray, 0, nums1, 0, m+n);
    }

    private static void mergeWithoutExtraSpace(int[] nums1, int m, int[] nums2, int n){
        //TC => O(m+n)
        //SC => O(1)
        /*
        We can start with two pointers i and j, initialized to m-1 and n-1,
        respectively. We will also have another pointer k initialized to m+n-1,
        which will be used to keep track of the position in nums1 where we will
        be placing the larger element. Then we can start iterating from the end
        of the arrays i and j, and compare the elements at these positions.
        We will place the larger element in nums1 at position k, and decrement
        the corresponding pointer i or j accordingly. We will continue doing this
        until we have iterated through all the elements in nums2. If there are
        still elements left in nums1, we don't need to do anything because they
        are already in their correct place.
         */
        int i = m-1, j = n-1, k = m+n-1;
        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k--] = nums1[i--];
            }
            else{
                nums1[k--] = nums2[j--];
            }
        }
    }

    private static void mergeBruteForce(int[] nums1, int m , int[] nums2, int n){
        //TC => O((n+m)log(n+m))
        //SC => O(1)
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }
}
