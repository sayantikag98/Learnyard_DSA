package L7_Loops_Extra_Class_Returns.Practice.Patterns;

public class SquareNumberPattern1 {
    public static void main(String[] args) {
        int nRow = 6, nCol = 5;
        for(int row = 1; row<=nRow; row++){
            for(int col = 1; col<=nCol; col++){
                if((row&1)==1){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
