package L7_Loops_Extra_Class_Returns.Practice.Patterns;

public class NumericSquarePattern5 {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=n; col++){
                if(col<row){
                    System.out.print(n-col+1);
                }
                else{
                    System.out.print(n-row+1);
                }
            }
            System.out.println();
        }
    }
}
