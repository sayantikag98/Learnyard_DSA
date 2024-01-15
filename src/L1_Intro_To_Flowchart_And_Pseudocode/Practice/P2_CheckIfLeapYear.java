package L1_Intro_To_Flowchart_And_Pseudocode.Practice;

public class P2_CheckIfLeapYear {
    public static void main(String[] args) {
        int year = 2000;
        if(checkIfLeapYear(year)){
            System.out.println("Its a Leap Year");
        }
        else{
            System.out.println("Its not a Leap Year");
        }
    }

    private static boolean checkIfLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
