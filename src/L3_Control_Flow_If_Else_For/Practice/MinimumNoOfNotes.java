package L3_Control_Flow_If_Else_For.Practice;

import java.util.Scanner;

public class MinimumNoOfNotes {
    /*
    Q. Write a Java program to input amount from user and print minimum number
    of notes (Rs. 500, 100, 50, 20, 10, 5, 2, 1) required for the amount.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();
        System.out.println(minimumNotes(amt));
    }

    private static int minimumNotes(int amt){
        int totalNotes = 0, index = 0;
        int[] denomination = {500, 100, 50, 20, 10, 5, 2, 1};
        while(amt != 0 && index < denomination.length){
            totalNotes += amt/denomination[index];
            amt %= denomination[index];
            index++;
        }
        return totalNotes;
    }
}
