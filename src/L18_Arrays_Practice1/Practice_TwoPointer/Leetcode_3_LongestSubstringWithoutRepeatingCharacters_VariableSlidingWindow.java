package L18_Arrays_Practice1.Practice_TwoPointer;
import java.util.HashSet;
import java.util.HashMap;

public class Leetcode_3_LongestSubstringWithoutRepeatingCharacters_VariableSlidingWindow {
    //https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(lengthOfLongestSubstringBruteForce(str));
        System.out.println(lengthOfLongestSubstringBruteForce(str));
    }

    private static int lengthOfLongestSubstringBruteForce(String s) {
        int n = s.length();
        for(int k = n; k>0; k--){
            for(int i = 0; i+k-1<n; i++){
                HashSet<Character> hs = new HashSet<>();
                boolean isUnique = true;
                for(int j = i; j<i+k; j++){
                    if(hs.contains(s.charAt(j))){
                        isUnique = false;
                        break;
                    }
                    hs.add(s.charAt(j));
                }
                if(isUnique) return k;
            }
        }
        return 1;
    }

    public int lengthOfLongestSubstringUsingVariableSlidingWindow(String s) {
        //TC=>O(n)
        //SC=>O(n) for all characters in String s distinct
        int n = s.length();
        //variable sliding window
        //valid window => window with all characters distinct

        //window will be defined by left and right pointer

        //hashmap will store the current index occurrence of the current character
        HashMap<Character, Integer> charPos = new HashMap<>(); // check for the valid window => charPos.size() == window size (right-left+1)

        int maxLen = 0;

        for(int left = 0, right = 0; right<s.length(); right++){
            char ch = s.charAt(right);
            if(charPos.containsKey(ch)){
                //this window is invalid, it contains duplicates
                //shrink the window by moving the left pointer ****only if the duplicate is present within the window****
                int pos = charPos.get(ch);

                // this if check is very important MADE MISTAKE HERE
                // this tell if the previous instance of the character pointed by right (ch) is within the window
                // if it's outside the window, then the window is still valid no need to move the left pointer otherwise move it
                if(pos>=left) left = pos+1;
            }
            //always update the hashmap with the latest occurrences of ch
            //this is very important, without this fixing the start of the window when duplicate is found would be difficult
            charPos.put(ch, right);

            //window is always valid so compare and update maxLen
            maxLen = Math.max(maxLen, right-left+1);
        }

        return maxLen;
    }
}
