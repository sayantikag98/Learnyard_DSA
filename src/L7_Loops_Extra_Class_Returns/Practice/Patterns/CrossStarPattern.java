package L7_Loops_Extra_Class_Returns.Practice.Patterns;

public class CrossStarPattern {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row<=2*n-1; row++){
            for(int col = 1; col<=2*n-1; col++){
                if(col == row || col == 2*n-row){
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
