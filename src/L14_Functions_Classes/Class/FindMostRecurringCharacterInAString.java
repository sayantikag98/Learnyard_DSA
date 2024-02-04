package L14_Functions_Classes.Class;
import java.util.HashMap;

public class FindMostRecurringCharacterInAString {
    public static void main(String[] args) {
        String str = "Helloo999";
        System.out.println(findMostRecurringUsingNestedLoop(str));
        System.out.println(findMostRecurringUsingFrequencyArray(str));
        System.out.println(findMostRecurringUsingFrequencyMap(str));
    }

    private static char findMostRecurringUsingNestedLoop(String str){
        int maxCount = 0;
        char mostCountChar = str.charAt(0);
        for(int i = 0; i<str.length(); i++){
            int count = 0;
            for(int j = i; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j)) count++;
            }
            if(maxCount<count){
                maxCount = count;
                mostCountChar = str.charAt(i);
            }
        }
        return mostCountChar;
    }

    private static char findMostRecurringUsingFrequencyArray(String str){
        int[] freq = new int[256];
        int maxCount = 0;
        char mostCountChar = str.charAt(0);
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            freq[ch]++;
            if(maxCount<freq[ch]){
                maxCount = freq[ch];
                mostCountChar = ch;
            }
        }
        return mostCountChar;
    }

    private static char findMostRecurringUsingFrequencyMap(String str){
        HashMap<Character, Integer> freq = new HashMap<>();
        int maxCount = 0;
        char mostCountChar = str.charAt(0);
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            int freqCount = freq.getOrDefault(ch, 0);
            freq.put(ch, ++freqCount);
            if(maxCount<freqCount){
                maxCount = freqCount;
                mostCountChar = ch;
            }
        }
        return mostCountChar;
    }

}
