package L7_Loops_Extra_Class_Returns.Practice.Patterns;

public class NumericSquarePattern3 {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row<=n; row++){
            int val = row;
            for(int col = 1; col<=n; col++){
                System.out.print(val++);
            }
            System.out.println();
        }
    }
}
