package L7_Loops_Extra_Class_Returns.Practice.Patterns;

public class HollowMirroredRightTriangleStarPattern {
    public static void main(String[] args) {
        int n = 5;
        int space = n-1;
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=space; col++){
                System.out.print("  ");
            }
            for(int col = 1; col<=row; col++){
                if(row==n || col == 1 || col == row){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            space--;
        }
    }
}
