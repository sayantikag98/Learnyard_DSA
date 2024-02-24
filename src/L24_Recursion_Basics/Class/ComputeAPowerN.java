package L24_Recursion_Basics.Class;

public class ComputeAPowerN {
    public static void main(String[] args) {
        System.out.println(power(5,2));
    }

    private static int power(int a, int b){
        if(b==0) return 1;
        return a*power(a, b-1);
    }
}
