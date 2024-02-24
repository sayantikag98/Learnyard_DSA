package L23_Arrays_Practice6.Practice;

public class Leetcode_2706_BuyTwoChocolates {
    //https://leetcode.com/problems/buy-two-chocolates/description/
    public static void main(String[] args) {
        System.out.println(buyChoco(new int[]{3,3}, 6));
    }

    private static int buyChoco(int[] prices, int money) {
        //Find minimum and second minimum
        //TC => O(n)
        //SC => O(1)
        int min = 101, secMin = 101;
        for(int ele: prices){
            if(ele<min){
                secMin = min;
                min = ele;
            }
            else if(ele<secMin) secMin = ele;
        }
        return min+secMin<=money ? money-min-secMin : money;
    }
}
