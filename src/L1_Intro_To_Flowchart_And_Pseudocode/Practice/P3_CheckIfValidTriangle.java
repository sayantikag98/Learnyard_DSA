package L1_Intro_To_Flowchart_And_Pseudocode.Practice;

public class P3_CheckIfValidTriangle {
    public static void main(String[] args) {
        int a = 10, b = 10, c = 10;
        if(checkIfTriangleValid(a, b, c)){
            System.out.println("Valid Triangle");
        }
        else{
            System.out.println("Invalid Triangle");
        }
    }

    private static boolean checkIfTriangleValid(int a, int b, int c){
        return a+b>c && b+c>a && a+c>b;
    }
}
