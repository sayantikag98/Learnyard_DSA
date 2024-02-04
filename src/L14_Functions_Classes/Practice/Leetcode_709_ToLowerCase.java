package L14_Functions_Classes.Practice;

public class Leetcode_709_ToLowerCase {
    //https://leetcode.com/problems/to-lower-case/description/
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(toLowerCase(s));
    }

    private static String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>=65 && ch<=90){
                sb.setCharAt(i, (char)(ch+32));
            }
        }
        return sb.toString();
    }
}
