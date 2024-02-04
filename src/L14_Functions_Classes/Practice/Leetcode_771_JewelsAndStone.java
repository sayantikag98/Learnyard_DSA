package L14_Functions_Classes.Practice;

import java.util.HashSet;

public class Leetcode_771_JewelsAndStone {
    //https://leetcode.com/problems/jewels-and-stones/description/
    public static void main(String[] args) {
        String jewels = "Aa", stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }

    private static int numJewelsInStones(String jewels, String stones) {
        /*
        TC => O(sj) where s is the length of the stones array and j is the length of jewels array
        SC => O(1)
         */
        int countJewelsInStone = 0;
        for(int i = 0; i<stones.length(); i++){
            char ch = stones.charAt(i);
            //indexOf() returns -1 when ch is not found in the string or the first occurrence when ch is found
            if(jewels.indexOf(ch) != -1) countJewelsInStone++;
        }
        return countJewelsInStone;
    }

    private static int numJewelsInStonesUsingExtraSpace(String jewels, String stones) {
        //TC => O(j+s)
        //SC => O(j)
        HashSet<Character> hs = new HashSet<>();
        for(int i = 0; i<jewels.length(); i++){
            hs.add(jewels.charAt(i));
        }
        int countJewelsInStone = 0;
        for(int i = 0; i<stones.length(); i++){
            if(hs.contains(stones.charAt(i))) countJewelsInStone++;
        }
        return countJewelsInStone;
    }
}
