package L25_Recursion_Time_And_Space_Complexity.Practice;
import java.util.List;
import java.util.ArrayList;

public class GFG_PrintPattern {
    //https://www.geeksforgeeks.org/problems/print-pattern3549/1
    public static void main(String[] args) {
        System.out.println(pattern(5));
    }
    private static List<Integer> pattern(int n){
        // code here
        List<Integer> ans = new ArrayList<>();
//        patternRecursive(n, n, ans, false);
        patternRecursiveCleanerImplementation(n, ans);
        return ans;
    }

    private static void patternRecursiveCleanerImplementation(int n, List<Integer> ans){
        ans.add(n);
        if(n<=0) return;
        patternRecursiveCleanerImplementation(n-5, ans);
        ans.add(n);
    }

    private static void patternRecursive(int n, int i, List<Integer> ans, boolean isIncreasing){
        if(isIncreasing && i>n) return;
        ans.add(i);
        if(i<=0){
            patternRecursive(n, i+5, ans, true);
        }
        else{
            if(isIncreasing){
                patternRecursive(n, i+5, ans, isIncreasing);
            }
            else{
                patternRecursive(n, i-5, ans, isIncreasing);
            }
        }

    }
}
