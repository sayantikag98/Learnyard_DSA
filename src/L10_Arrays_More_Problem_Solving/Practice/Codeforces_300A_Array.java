package L10_Arrays_More_Problem_Solving.Practice;

import java.util.Scanner;
import java.util.ArrayList;

public class Codeforces_300A_Array {
    //https://codeforces.com/problemset/problem/300/A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        array(arr, n);
    }

    private static void array(int[] arr, int n){
        /*
        The answer will always exist that means-
        1. That the input will always have 0 and negative number
        2. 0 will always come in the third set
        3. The number of negative number in the first set has to be odd
        4. The number of negative number in the second set has to be even
        5. If the number of positive is zero then the number of negatives has to be greater than 2
         */

        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();

        for(int i = 0; i<n; i++){
            if(arr[i]>0) positives.add(arr[i]);
            if(arr[i]<0) negatives.add(arr[i]);
        }
        if(!positives.isEmpty()){
            /*
            If there are any positive number then
            first set -> first negative number only
            second set -> all the positive number
            third set -> zero and all the negative numbers except the first
             */
            System.out.println(1+" "+negatives.getFirst());
            System.out.print(positives.size()+" ");
            for(int ele: positives){
                System.out.print(ele+" ");
            }
            System.out.println();
            System.out.print((1+negatives.size()-1)+" "+0+" ");
            for(int i = 1; i<negatives.size(); i++){
                System.out.print(negatives.get(i)+" ");
            }
            System.out.println();
        }
        else{
            /*
            If there are no positive number then it is guaranteed that the number of negatives will be more than 3
            first set -> first negative number only
            second set -> second and third negative numbers
            third set -> zero and all the negative numbers except the first, second and third
             */
            System.out.println(1+" "+negatives.getFirst());
            System.out.println(2+" "+negatives.get(1)+" "+negatives.get(2));
            System.out.print((1+negatives.size()-3)+" "+0+" ");
            for(int i = 3; i<negatives.size(); i++){
                System.out.print(negatives.get(i)+" ");
            }
            System.out.println();
        }
    }
}
