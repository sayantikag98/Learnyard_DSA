package L1_Intro_To_Flowchart_And_Pseudocode.Practice;

public class P1_MaxOfThreeNumbers {
    public static void main(String[] args) {
        int a = 10, b = 10, c = 3;
        System.out.println(findMax(a, b, c));
    }

    private static int findMax(int a, int b, int c){
        return Math.max(a, Math.max(b, c));
    }
}
