package L7_Loops_Extra_Class_Returns.Class;

public class EightStarPattern {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row<=2*n-1; row++){
            for(int col = 1; col<=n; col++){
                if(row==1 || row==2*n-1 || row==n){
                    if(col==1 || col==n){
                        System.out.print("  ");
                    }
                    else{
                        System.out.print("* ");
                    }
                }
                else{
                    if(col==1 || col==n){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
