package L10_Arrays_More_Problem_Solving.Practice;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;

public class Leetcode_2824_CountPairsWhoseSumIsLessThanTarget {
    //https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> nums = new ArrayList<>();
        for(int i = 0; i<n; i++){
            nums.add(sc.nextInt());
        }
        int target = sc.nextInt();
        System.out.println(countPairs(nums, target));
        System.out.println(countPairsUsingSorting(nums, target));
    }

    private static int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for(int i = 0; i<nums.size()-1; i++){
            for(int j = i+1; j<nums.size(); j++){
                if(nums.get(i) + nums.get(j) < target){
                    count++;
                }
            }
        }
        return count;
    }

    private static int countPairsUsingSorting(List<Integer> nums, int target) {
        Collections.sort(nums);
        int count = 0, i = 0, j = nums.size() - 1;
        while(i<j){
            if(nums.get(i) + nums.get(j) < target){
                /*
                for all the pairs nums.get(i) forms with any nums.get(j) for j>i the above
                condition will hold
                 */
                count += (j - i);
                i++;
            }
            //here i++ will only make the sum more greater than target which will not work
            else j--;
        }
        return count;
    }


}
