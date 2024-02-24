package L24_Recursion_Basics.Class;

public class Print1ToN {
    public static void main(String[] args) {
        printIncreasing(5);
    }

    private static void printIncreasing(int n){
        if(n<1) return;
        printIncreasing(n-1);
        System.out.println(n);
    }
}
