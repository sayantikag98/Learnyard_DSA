package L7_Loops_Extra_Class_Returns.Practice.Patterns;

public class NumericSquarePattern6{
    public static void main(String[] args) {
        int n = 9;
        for(int row = n; row>=1; row--){
            for(int col = 1; col<=n; col++){
                System.out.print(Math.max(col, row));
            }
            System.out.println();
        }
    }
}
