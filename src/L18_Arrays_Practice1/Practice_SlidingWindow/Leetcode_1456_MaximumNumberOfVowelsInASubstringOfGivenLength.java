package L18_Arrays_Practice1.Practice_SlidingWindow;

public class Leetcode_1456_MaximumNumberOfVowelsInASubstringOfGivenLength {
    //https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/
    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef", 3));
        System.out.println(maxVowelsCleanerImplementation("abciiidef", 3));
    }

    private static int maxVowelsCleanerImplementation(String s, int k) {
        /*
        sliding window approach
        TC=>O(n)
        SC=>O(1)
        */
        int count = 0, maxCount = 0;
        for(int i = 0, j = 0; j<s.length(); j++){
            if(isVowel(s.charAt(j))) count++;

            //this will happen from second window onwards
            if(j>=k){
                if(isVowel(s.charAt(i))) count--;
                i++;
            }

            //this will happen for all windows, when j reaches k-1 first window is formed
            //computing maxCount for j<k-1 is not needed because that is not even a window
            if(j>=k-1) maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }

    private static int maxVowels(String s, int k) {
        /*
        sliding window approach
        TC=>O(n)
        SC=>O(1)
         */
        int i = 0, j = 0, count = 0;
        while(j<k){
            if(isVowel(s.charAt(j))) count++;
            j++;
        }
        int maxCount = count;
        while(j<s.length()){
            if(isVowel(s.charAt(j))) count++;
            if(isVowel(s.charAt(i))) count--;
            maxCount = Math.max(maxCount, count);
            i++;
            j++;
        }
        return maxCount;
    }

    private static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
