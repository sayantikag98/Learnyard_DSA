package L24_Recursion_Basics.Class;

public class PrintNto1 {
    public static void main(String[] args) {
        printDecreasing(5);
    }

    private static void printDecreasing(int n){
        if(n<1) return;
        System.out.println(n);
        printDecreasing(n-1);
    }
}
