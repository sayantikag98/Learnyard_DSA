package L7_Loops_Extra_Class_Returns.Practice.Patterns;

public class RightArrowStarPattern {
    public static void main(String[] args) {
        int n = 5;
        int space = 0, star = n;
        for(int row = 1; row<=2*n-1; row++){
            for(int col = 1; col<=space; col++){
                System.out.print("  ");
            }
            for(int col = 1; col<=star; col++){
                System.out.print("* ");
            }
            System.out.println();
            if(row<n){
                space+=2;
                star--;
            }
            else{
                space-=2;
                star++;
            }
        }
    }
}
