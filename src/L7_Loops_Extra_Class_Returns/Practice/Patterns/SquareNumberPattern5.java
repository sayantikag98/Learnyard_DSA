package L7_Loops_Extra_Class_Returns.Practice.Patterns;

public class SquareNumberPattern5 {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=n; col++){
                if(row == (n+1)/2 || col == (n+1)/2){
                    System.out.print("0");
                }
                else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
