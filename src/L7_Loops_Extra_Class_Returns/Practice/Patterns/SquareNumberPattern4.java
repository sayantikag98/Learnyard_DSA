package L7_Loops_Extra_Class_Returns.Practice.Patterns;

public class SquareNumberPattern4 {
    public static void main(String[] args) {
        int nRow = 5, nCol = 5;
        for(int row = 1; row<=nRow; row++){
            for(int col = 1; col<=nCol; col++){
                if(((row&1)==1 && (col&1)==1) || ((row&1)==0 && (col&1)==0)){
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
