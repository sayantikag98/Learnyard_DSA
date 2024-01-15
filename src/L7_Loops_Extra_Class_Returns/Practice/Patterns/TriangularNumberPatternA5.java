package L7_Loops_Extra_Class_Returns.Practice.Patterns;

public class TriangularNumberPatternA5 {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=row; col++){
                System.out.print(n-row+1);
            }
            System.out.println();
        }
    }
}
