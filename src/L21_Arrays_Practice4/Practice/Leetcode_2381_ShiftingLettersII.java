package L21_Arrays_Practice4.Practice;

public class Leetcode_2381_ShiftingLettersII {
    //https://leetcode.com/problems/shifting-letters-ii/description/
    public static void main(String[] args) {
        System.out.println(shiftingLettersUsingLineSweep("abc", new int [][]{{0,1,0},{1,2,1},{0,2,1}}));
    }
    private static String shiftingLettersUsingLineSweep(String s, int[][] shifts) {
        //TC=O(n+m) where n is the length of the string and m is the length of shifts array
        //SC=O(n)
        /*
        Try marking the start and ends of each shift, then perform a prefix sum of the shifts.
        Steps:
        1. Take an array of size n (pos)
        2. Traverse shifts array and in each -
            If direction is 0:
                a: decrement pos[start]
                b: increment pos[end+1] if end is equal n-1
            If direction is 1:
                a: increment pos[start]
                b: decrement pos[end+1] if end is equal n-1
         3. prefix sum pos
         4. then modify string s if pos[i] is positive, then forward shift otherwise backward shift
         */
        int n = s.length();
        int[] pos = new int[n];
        for(int[] arr: shifts){
            int start = arr[0], end = arr[1], dir = arr[2];
            if(dir == 0){
                pos[start]-=1;
                if(end!=n-1){
                    pos[end+1]+=1;
                }
            }
            else{
                pos[start]+=1;
                if(end!=n-1){
                    pos[end+1]-=1;
                }
            }
        }
        for(int i = 1; i<n; i++){
            pos[i]+=pos[i-1];
        }
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i<n; i++){
            char ch = sb.charAt(i);
            int res = ch+pos[i];
            res = (res-97)%26+97;
            if(res<97) res+=26;
            sb.setCharAt(i, (char)res);
        }
        return sb.toString();
    }
}
