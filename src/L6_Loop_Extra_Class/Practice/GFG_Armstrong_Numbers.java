package L6_Loop_Extra_Class.Practice;
import java.util.Scanner;

public class GFG_Armstrong_Numbers {
    //https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isArmstrong(num));
    }

    private static String isArmstrong(int num){
        int temp = num, sum = 0;
        while(temp != 0){
            int digit = temp%10;
            temp/=10;
            sum+=digit * digit * digit;
        }
        if(sum == num) return "Yes";
        return "No";
    }
}
