package L3_Control_Flow_If_Else_For.Practice;
import java.util.Scanner;

public class CheckWhetherCharacterIsAlphabetOrDigitOrSpecialCharacter {
    /*
    Q. Write a java program to check whether a character is alphabet, digit or special character.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if((ch>= 97 && ch <= 122) || (ch >= 65 && ch <= 90)){
            System.out.println("Alphabet");
        }
        else if(ch >= 48 && ch <= 57){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special Character");
        }

    }
}
