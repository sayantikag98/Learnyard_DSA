package L7_Loops_Extra_Class_Returns.Practice.Patterns;

public class HollowSquareStarPatternWithDiagonal {
    public static void main(String[] args) {
        int n = 7;
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=n; col++){
                if(row == 1 || row == n || col == 1 || col == n || col == row || col == n-row+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
