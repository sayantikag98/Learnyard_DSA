package L4_JAVA_Practice_Session_Warm_up.Class;
import java.util.Scanner;
import static L4_JAVA_Practice_Session_Warm_up.Class.SumOfDigits.sumOfDigits;

public class SumOfDigitsFromLToR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(), r = sc.nextInt();
        for(int i = l; i<=r; i++){
            System.out.println(i+" "+sumOfDigits(i));
        }
    }
}
