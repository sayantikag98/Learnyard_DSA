package L7_Loops_Extra_Class_Returns.Practice.Patterns;

public class SquareNumberPattern7 {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=n; col++){
                if(row == 1 || row == n){
                    if(col == 1 || col == n){
                        System.out.print("0");
                    }
                    else{
                        System.out.print("1");
                    }
                }
                else{
                    if(col == 1 || col == n){
                        System.out.print("1");
                    }
                    else{
                        System.out.print("0");
                    }
                }
            }
            System.out.println();
        }
    }
}
