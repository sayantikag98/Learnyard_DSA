package L7_Loops_Extra_Class_Returns.Practice.Patterns;

public class TriangularNumberPatternB3 {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row<=n; row++){
            int val = n;
            for(int col = 1; col<=row; col++){
                System.out.print(val--);
            }
            System.out.println();
        }
    }
}
