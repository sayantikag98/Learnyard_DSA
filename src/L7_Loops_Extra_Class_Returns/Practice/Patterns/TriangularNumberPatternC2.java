package L7_Loops_Extra_Class_Returns.Practice.Patterns;

public class TriangularNumberPatternC2 {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=row; col++){
                if((row&1)==1){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
