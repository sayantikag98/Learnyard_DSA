package L14_Functions_Classes.Practice;
import java.util.Arrays;
import java.util.HashMap;


public class Leetcode_242_ValidAnagram {
    //https://leetcode.com/problems/valid-anagram/description/
    public static void main(String[] args) {
        String s = "bbcc", t = "bccc";
        System.out.println(isAnagram(s,t));
        System.out.println(isAnagramUsingSorting(s,t));
        System.out.println(isAnagramUsingFrequencyArray(s,t));
    }

    private static boolean isAnagram(String s, String t) {
        //TC->O(n) where n is the length of the string s
        //SC->O(k) where k is the no of unique characters in the string s (k<=26)
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);
        }
        for(int i = 0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(!freqMap.containsKey(ch) || freqMap.get(ch) == 0) return false;
            freqMap.put(ch, freqMap.get(ch)-1);
        }
        return true;
    }

    private static boolean isAnagramUsingSorting(String s, String t){
        //TC => O(nlogn) where n is the length of the string s
        //SC => O(n)
        if(s.length() != t.length()) return false;
        char[] charArrs = s.toCharArray(), charArrt = t.toCharArray();
        Arrays.sort(charArrs);
        Arrays.sort(charArrt);
        return Arrays.equals(charArrs, charArrt);
    }

    private static boolean isAnagramUsingFrequencyArray(String s, String t){
        //TC->O(n) where n is the length of the string s
        //SC->O(1)
        if(s.length() != t.length()) return false;
        int[] freqArr = new int[26];
        for(int i = 0; i<s.length(); i++){
            freqArr[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i<t.length(); i++){
            if(freqArr[t.charAt(i)-'a']-- == 0) return false;
            // if not decremented will not work for test case like s = "bbcc" and t ="bccc"
        }
        return true;
    }
}
