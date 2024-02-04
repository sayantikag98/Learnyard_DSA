package L14_Functions_Classes.Class;
import java.util.Scanner;
public class FindSumOfFirstAndLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), temp = num;
        while(temp>=10){
            temp/=10;
        }
        System.out.println(temp+num%10);
        String str = Integer.toString(num);
        System.out.println(str.charAt(0)-'0'+str.charAt(str.length()-1)-'0');
    }
}
