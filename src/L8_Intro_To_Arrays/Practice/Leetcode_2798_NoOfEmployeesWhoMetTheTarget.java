package L8_Intro_To_Arrays.Practice;
import java.util.Scanner;

public class Leetcode_2798_NoOfEmployeesWhoMetTheTarget {
    //https://leetcode.com/problems/number-of-employees-who-met-the-target/description/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] hours = new int[n];
        for(int i = 0; i<n; i++){
            hours[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(numberOfEmployeesWhoMetTarget(hours, target));
    }

    private static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for(int ele : hours){
            if(ele>=target){
                count++;
            }
        }
        return count;
    }
}
