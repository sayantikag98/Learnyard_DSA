package L7_Loops_Extra_Class_Returns.Practice.Patterns;

public class TriangularNumberPatternB6 {
    public static void main(String[] args) {
        int n = 5;
        for(int row = n; row>=1; row--){
            for(int col = 1; col<=row; col++){
                System.out.print(col+n-row);
            }
            System.out.println();
        }
    }
}
