package L7_Loops_Extra_Class_Returns.Practice.Patterns;

public class PlusSignPattern {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row<=2*n-1; row++){
            if(row != n){
                for(int col = 1; col<n; col++){
                    System.out.print("  ");
                }
                System.out.print("+ ");
            }
            else{
                for(int col = 1; col<=2*n-1; col++){
                    System.out.print("+ ");
                }
            }
            System.out.println();
        }
    }
}
