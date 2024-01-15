package L7_Loops_Extra_Class_Returns.Practice.Patterns;

public class TriangularNumberPatternC3 {
    public static void main(String[] args) {
        int n = 5, val = 1;
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=row; col++){
                if((val&1)==1){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
                val++;
            }
            System.out.println();
        }
    }
}

/*
1  => 1,1
01 => 2,2
010 => 3,2
1010 => 4,1 and 4,3
10101 => 5,1 and 5,3 and 5,5
 */
