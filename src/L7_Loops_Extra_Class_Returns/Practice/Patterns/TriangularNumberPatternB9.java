package L7_Loops_Extra_Class_Returns.Practice.Patterns;

public class TriangularNumberPatternB9 {
    public static void main(String[] args) {
        int n = 5;
        for(int row = n; row>=1; row--){
            int val = 2*(n-row+1)-1;
            for(int col = 1; col<=row; col++){
                System.out.print(val);
                val+=2;
            }
            System.out.println();
        }
    }
}

/*
1 - 1  0   x - row = row-1
2 - 3  1    x = 2*row-1
3 - 5  2
4 - 7  3
5 - 9  4
 */
