package L7_Loops_Extra_Class_Returns.Practice.Patterns;

public class TriangularNumberPatternA2 {
    public static void main(String[] args) {
        int n = 5;
        int space = n-1;
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=space; col++){
                System.out.print(" ");
            }
            for(int col = 1; col<=row; col++){
                System.out.print(row);
            }
            System.out.println();
            space--;
        }
    }
}