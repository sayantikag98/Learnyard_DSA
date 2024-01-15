package L7_Loops_Extra_Class_Returns.Practice.Patterns;

public class HollowInvertedPyramidStarPattern {
    public static void main(String[] args) {
        int n = 5;
        int star = 2*n-1, space = 0;
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=space; col++){
                System.out.print("  ");
            }
            for(int col = 1; col<=star; col++){
                if(row == 1 || col == 1 || col == star){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            star-=2;
            space++;
        }
    }
}
