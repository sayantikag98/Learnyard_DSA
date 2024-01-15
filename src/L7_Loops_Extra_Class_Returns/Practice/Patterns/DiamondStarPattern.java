package L7_Loops_Extra_Class_Returns.Practice.Patterns;

public class DiamondStarPattern {
    public static void main(String[] args) {
        int n = 5;
        int space = n-1, star = 1;
        for(int row = 1; row<=2*n-1; row++){
            for(int col = 1; col<=space; col++){
                System.out.print("  ");
            }
            for(int col = 1; col<=star; col++){
                System.out.print("* ");
            }
            System.out.println();
            if(row<n){
                space--;
                star+=2;
            }
            else{
                space++;
                star-=2;
            }
        }
    }
}
