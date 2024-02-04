package L14_Functions_Classes.Practice;

public class Leetcode_2315_CountAsterisks {
    //https://leetcode.com/problems/count-asterisks/description/
    public static void main(String[] args) {
        String s = "yo|uar|e**|b|e***au|tifu|l";
        System.out.println(countAsterisks(s));
    }

    private static int countAsterisks(String s) {
        /*
        when countBar is even then you are not in between the pair of '|' and then if its asterisks then start counting it
         */
        int countAsterisks = 0, countBar = 0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if((countBar & 1) ==0 && ch == '*') countAsterisks++;
            if(ch == '|') countBar++;
        }
        return countAsterisks;
    }
}
