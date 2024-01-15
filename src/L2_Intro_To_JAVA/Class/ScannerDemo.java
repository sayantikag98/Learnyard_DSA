package L2_Intro_To_JAVA.Class;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        System.out.println(str+" "+n);
    }
}
