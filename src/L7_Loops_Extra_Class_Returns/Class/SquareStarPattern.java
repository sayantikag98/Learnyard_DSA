package L7_Loops_Extra_Class_Returns.Class;

public class SquareStarPattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
