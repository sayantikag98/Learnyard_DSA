package L7_Loops_Extra_Class_Returns.Class;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            if(isPerfect(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isPerfect(int num){
        if(num<=1) return false;
        int sum = 1;
        for(int i = 2; i<num; i++){
            if(num%i==0){
                sum+=i;
            }
        }
        return num==sum;
    }
}
