package L7_Loops_Extra_Class_Returns.Practice.BasicLoops;

import java.util.Scanner;

public class FindAllFactors {
    /*
    n = 16
    1 * 16       16 * 1
    2 * 8        8 * 2
           4 * 4

      Factors repeat itself after sqrt(n)

      so get the factors from [1, sqrt(n)] and let that be i then the other factor n/i,
      but it may so happen that i and n/i is same then consider only i

      This logic holds for prime numbers also

      a * b = n where a, b are the factors of n
      if a is greater than sqrt(n) then b has to be less than sqrt(n)
      otherwise the product will become greater than n

      so for prime numbers if there is any factor possible then it will lie in range [2, sqrt(n)]
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(1+" "+n+" ");
        for(int i = 2; i*i<=n; i++){
            if(n%i == 0){
                if(i == n/i){
                    System.out.print(i+" ");
                }
                else{
                    System.out.print(i+" "+n/i+" ");
                }
            }
        }
    }
}
