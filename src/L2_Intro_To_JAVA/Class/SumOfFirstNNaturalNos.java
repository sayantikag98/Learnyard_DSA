package L2_Intro_To_JAVA.Class;
import java.util.Scanner;

public class SumOfFirstNNaturalNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = n*(n+1)/2;
        System.out.println(sum);
    }
}
