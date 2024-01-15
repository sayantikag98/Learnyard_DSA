package L7_Loops_Extra_Class_Returns.Practice.Patterns;

public class TriangularNumberPatternB10 {
    public static void main(String[] args) {
        int n = 5;
        for(int row = n; row>=1; row--){
            int val = 2*row-1;
            for(int col = 1; col<=n-row+1; col++){
                System.out.print(val);
                val+=2;
            }
            System.out.println();
        }
    }
}
