package L22_Arrays_Practice5.Class;
import java.util.HashSet;

public class GFG_KeyPair {
    //https://www.geeksforgeeks.org/problems/key-pair5616/1
    public static void main(String[] args) {
        System.out.println(hasArrayTwoCandidates(new int[]{3,3}, 2, 6));
    }

    private static boolean hasArrayTwoCandidates(int[] arr, int n, int x) {
        HashSet<Integer> hs = new HashSet<>();
        for(int ele: arr){
            if(hs.contains(x-ele)) return true;
            hs.add(ele);
        }
        return false;
    }
}
