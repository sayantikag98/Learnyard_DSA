package L14_Functions_Classes.Practice;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Deque;

public class Leetcode_1544_MakeTheStringGreat {
    //https://leetcode.com/problems/make-the-string-great/description/
    public static void main(String[] args) {
        char[] ch = {'h', 'e', 'l'};
        String str = new String(ch);
        String s = "abBAcCehDeEd";
        System.out.println(makeGood(s));
        System.out.println(makeGoodUsingStringBuilder(s));
        System.out.println(makeGoodUsingStack(s));
        System.out.println(makeGoodUsingDeque(s));
    }

    public static String makeGood(String s) {
        /*
        TC => O(n*k) where n is the length of the StringBuilder and k is the no of those special pairs
        SC => O(1)
         */
        StringBuilder sb = new StringBuilder(s);
        while(true){
            boolean isGreat = true;
            for(int i = 0; i<sb.length()-1; i++){
                char firstChar = sb.charAt(i), secondChar = sb.charAt(i+1);
                /*
                Using ^ 32 we can perform toggling the case of a character.
                eg:
                char ch = 'a';
                System.out.println((char)(ch ^ 32)); // will print upper case 'A'
                and
                char ch1 = 'A';
                System.out.println((char)(ch1 ^ 32)); // will print lower case 'a'

                The XOR operation with 32 (which is 2^5) works because of the binary
                representation of the ASCII values. The ASCII values for uppercase
                and lowercase letters differ only in the sixth bit (counting from the
                right, starting at 0). The XOR operation with 32 effectively flips
                this bit, converting uppercase letters to lowercase and vice versa.
                 */
                if(Math.abs(firstChar - secondChar) == 32){
                    sb.delete(i, i+2);
                    isGreat = false;
                    break;
                }
            }
            if(isGreat) return sb.toString();
        }
    }

    public static String makeGoodUsingStringBuilder(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i<sb.length()-1; i++){
            while(i<sb.length()-1 && Math.abs(sb.charAt(i) - sb.charAt(i+1)) == 32){
                sb.delete(i, i+2); //start index inclusive but end index exclusive
                if(i>0) i--;
            }
        }
        return new String(sb);
    }

    public static String makeGoodUsingStack(String s){
        /*
        A more complete and consistent set of LIFO stack operations is provided by the Deque interface
         and its implementations, which should be used in preference to this class.
         For example:
        Deque<Integer> stack = new ArrayDeque<Integer>();
         */
        /*
        TC => O(n)
        SC => O(n) where n is the length of the string

        Imp points for Stack:
        1. peek() & pop()-> will throw exception if stack is empty so before using this check whether stack is empty or not
        2. pop() -> removes the top element of the stack and returns it
        3. peek() -> returns the top element of the stack
         */
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!st.isEmpty() && Math.abs(st.peek() - ch) == 32){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.insert(0, st.pop());
        }
        return new String (sb);
//        return sb.toString();
    }

    private static String makeGoodUsingDeque(String s){
        /*
        A more complete and consistent set of LIFO stack operations is provided by the Deque interface
         and its implementations, which should be used in preference to this class.
         For example:
        Deque<Integer> stack = new ArrayDeque<Integer>();
         */
        Deque<Character> d = new LinkedList<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!d.isEmpty() && Math.abs(d.peekFirst()-ch) == 32){
                d.pollFirst();
            }
            else{
                d.offerFirst(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!d.isEmpty()){
            sb.append(d.pollLast());
        }
        return sb.toString();
    }
}
