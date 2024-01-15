package L7_Loops_Extra_Class_Returns.Practice.Patterns;

public class InverseRightTriangleStarPattern {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row<=n; row++){
            for(int col = 0; col<=n-row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
