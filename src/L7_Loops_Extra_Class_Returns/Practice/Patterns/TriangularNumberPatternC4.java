package L7_Loops_Extra_Class_Returns.Practice.Patterns;

public class TriangularNumberPatternC4 {
    public static void main(String[] args) {
        int n = 9;
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=row; col++){
                if(row != n){
                    if(col == 1 || col == row){
                        System.out.print(1);
                    }
                    else{
                        System.out.print(0);
                    }
                }
                else{
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
}
