package L17_ArrayList.Practice;

import java.util.Scanner;

public class Codeforces_1920A_SatisfyingConstraints {
    //https://codeforces.com/contest/1920/problem/A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            int n = sc.nextInt();
            long[][] arr = new long[n][2];
            for(int i = 0; i<n; i++){
                arr[i][0] = sc.nextLong();
                arr[i][1] = sc.nextLong();
            }
            System.out.println(noSatisfyingConstraint(arr, n));
        }
    }

    private static long noSatisfyingConstraint(long[][] arr, int n){
        /*
        1. for constraint 1 (greater than or equal to) get the largest x => lowerbound
        2. for constraint 2 (less than or equal to) get the smallest x => upperbound
        3. if lowerbound > upperbound then no solution possible
        4. get the count of probable answer => upperbound - lowerbound + 1
        5. again iterate for the third constraint and whichever is within the upper and lower bounds decrement the count
        6. return the count
         */
        //TC=>O(n)
        //SC=>O(1)
        long lowerBound = Long.MIN_VALUE, upperBound = Long.MAX_VALUE;
        for(long[] nums: arr){
            if(nums[0] == 1 && nums[1] > lowerBound){
                lowerBound = nums[1];
            }
            if(nums[0] == 2 && nums[1] < upperBound){
                upperBound = nums[1];
            }
        }
        if(lowerBound>upperBound) return 0;
        long count = upperBound - lowerBound + 1;
        for(long[] nums: arr){
           if(nums[0] == 3 && nums[1] >= lowerBound && nums[1] <= upperBound) count--;
        }
        return count;
    }
}
