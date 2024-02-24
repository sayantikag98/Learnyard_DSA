package L25_Recursion_Time_And_Space_Complexity.Class;

public class GFG_SearchingANumber {
    //https://www.geeksforgeeks.org/problems/searching-a-number0324/1
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,2,6};
        System.out.println(search(arr, arr.length, 2));
        System.out.println(findFirstOccurrence(arr, arr.length, 2, 0, arr.length-1));
        System.out.println(findLastOccurrence(arr, arr.length, 2, 0, arr.length-1));
    }
    private static int search(int[] arr, int n, int k) {
        return findFirstOccurrence(arr, n, k, 0, n-1);
    }

    private static int findFirstOccurrence(int[] arr, int n, int k, int i, int j){
        if(i==j){
            if(arr[i] == k) return i+1;
            return -1;
        }
        int mid = i+(j-i)/2;
        int leftAns = findFirstOccurrence(arr, n, k, i, mid);
        if(leftAns != -1) return leftAns;
        return findFirstOccurrence(arr, n, k, mid+1, j);
    }

    private static int findLastOccurrence(int[] arr, int n, int k, int i, int j){
        if(i==j){
            if(arr[i] == k) return i+1;
            return -1;
        }
        int mid = i+(j-i)/2;
        int rightAns = findLastOccurrence(arr, n, k, mid+1, j);
        if(rightAns != -1) return rightAns;
        return findLastOccurrence(arr, n, k, i, mid);
    }
}
