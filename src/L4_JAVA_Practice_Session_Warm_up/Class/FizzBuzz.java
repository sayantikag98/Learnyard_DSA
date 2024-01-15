package L4_JAVA_Practice_Session_Warm_up.Class;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0;
        for(int i = 1; i<=n; i++){
            sum += i;
            if(sum > 3*n) break;
            if(i%3 != 0 && i%5 != 0){
                System.out.println(i);
            }
            else{
                if(i%3 == 0){
                    System.out.print("Fizz");
                }
                if(i%5 == 0){
                    System.out.print("Buzz");
                }
                System.out.println();
            }
        }

    }
}
