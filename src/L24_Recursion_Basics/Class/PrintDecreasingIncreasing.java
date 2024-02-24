package L24_Recursion_Basics.Class;

public class PrintDecreasingIncreasing {
    public static void main(String[] args) {
        printDecreasingIncreasing(5);
    }

    private static void printDecreasingIncreasing(int n){
        if(n<0){
//            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDecreasingIncreasing(n-1);
        System.out.println(n);
    }
}
