package L7_Loops_Extra_Class_Returns.Practice.Patterns;

public class NumericSquarePattern4 {
    public static void main(String[] args) {
        int n = 5;
        int val = 1;
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=n; col++){
                System.out.print(val+++" ");
            }
            System.out.println();
        }
    }
}
