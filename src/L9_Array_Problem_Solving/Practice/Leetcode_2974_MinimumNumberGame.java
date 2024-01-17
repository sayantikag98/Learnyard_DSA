package L9_Array_Problem_Solving.Practice;

import java.util.*;

public class Leetcode_2974_MinimumNumberGame {
    //https://leetcode.com/problems/minimum-number-game/description/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(numberGame(arr)));
        System.out.println(Arrays.toString(numberGameWithSwapping(arr)));
        reverseDemo();
    }

    private static int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] arr =  new int[n];
        int i = 0;
        while(i<n){
            arr[i] = nums[i+1];
            arr[i+1] = nums[i];
            i+=2;
        }
        return arr;
    }

    private static int[] numberGameWithSwapping(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i+=2){
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
        }
        return nums;
    }

    private static void reverseDemo(){
        Integer[] arr = {5,3,2,4};
        List<Integer> l = new ArrayList<>();
        List<Integer> l1 = new LinkedList<>();
        System.out.println(Arrays.toString(arr));
        Collections.reverse(Arrays.asList(arr)); // asList() does not work on primitives
        System.out.println(Arrays.toString(arr));
    }


}
