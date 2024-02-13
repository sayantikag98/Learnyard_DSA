package L20_Arrays_Practice3.Practice;
import java.util.Arrays;

public class Leetcode_2559_CountVowelStringsInRanges {
    //https://leetcode.com/problems/count-vowel-strings-in-ranges/description/

    public static void main(String[] args) {
        String[] words = {"aba","bcb","ece","aa","e"};
        int[][] queries = {{0,2},{1,4},{1,1}};
        System.out.println(Arrays.toString(vowelStringsUsingPrefixSum(words, queries)));
    }
    private static int[] vowelStringsUsingPrefixSum(String[] words, int[][] queries) {
        //TC=>O(n+q) where n is the length of words array and q is the length of queries array
        //SC=>O(n)
        int[] ans = new int[queries.length];
        int[] prefixNoOfVowels = new int[words.length];
        if(isVowelString(words[0])){
            prefixNoOfVowels[0] = 1;
        }
        //Compute prefix sum where prefixNoOfVowels[i] is the total number of strings having first & last characters vowel
        for(int i = 1; i<words.length; i++){
            if(isVowelString(words[i])){
                prefixNoOfVowels[i] = prefixNoOfVowels[i-1] + 1;
            }
            else{
                prefixNoOfVowels[i] = prefixNoOfVowels[i-1];
            }
        }

        //compute no of string having first and last char vowel in a range = prefixNoOfVowels[rightIdx] - prefixNoOfVowels[leftIdx-1] where start index != 0
        for(int i = 0; i<queries.length; i++){
            int leftIdx = queries[i][0], rightIdx = queries[i][1];
            if(leftIdx == 0) ans[i] = prefixNoOfVowels[rightIdx];
            else ans[i] = prefixNoOfVowels[rightIdx] - prefixNoOfVowels[leftIdx-1];
        }
        return ans;
    }

    private static boolean isVowelString(String str){
        char firstChar = str.charAt(0), lastChar = str.charAt(str.length()-1);
        return isCharVowel(firstChar) && isCharVowel(lastChar);
    }

    private static boolean isCharVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
