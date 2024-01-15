package L7_Loops_Extra_Class_Returns.Practice.Patterns;

public class MirroredRhombusStarPattern {
    public static void main(String[] args) {
        int n = 5;
        int space = 0;
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=space; col++){
                System.out.print("  ");
            }
            for(int col = 1; col<=n; col++){
                System.out.print("* ");
            }
            System.out.println();
            space++;
        }
    }
}
