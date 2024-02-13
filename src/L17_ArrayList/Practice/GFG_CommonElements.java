package L17_ArrayList.Practice;

import java.util.*;

public class GFG_CommonElements {
    //https://www.geeksforgeeks.org/problems/common-elements1132/1
    public static void main(String[] args) {
        System.out.println(commonElements(new int[]{1, 5, 10, 20, 40, 80}, new int[]{6, 7, 20, 80, 100}, new int[]{3, 4, 15, 20, 30, 70, 80, 120}, 6,5,8));
        System.out.println(commonElementsUsingThreePointers(new int[]{1, 5, 10, 20, 40, 80}, new int[]{6, 7, 20, 80, 100}, new int[]{3, 4, 15, 20, 30, 70, 80, 120}, 6,5,8));
        System.out.println(commonElementsUsingTwoHashSet(new int[]{1, 5, 10, 20, 40, 80}, new int[]{6, 7, 20, 80, 100}, new int[]{3, 4, 15, 20, 30, 70, 80, 120}, 6,5,8));
    }

    private static ArrayList<Integer> commonElements(int[] A, int[] B, int[] C, int n1, int n2, int n3)
    {
        //TC=>O(n1+n2+n3)
        //SC=>O(min(n1,n2,n3))
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        while(i<n1 && j<n2){
            while(i<n1 && j<n2 && A[i] == B[j]){
                if(!ans.contains(A[i]))
                    ans.add(A[i]);
                i++;
                j++;
            }
            while(i<n1 && j<n2 && A[i] < B[j]){
                i++;
            }
            while(i<n1 && j<n2 && A[i] > B[j]){
                j++;
            }
        }
        i = 0;
        j = 0;
        while(i<n3 && j<ans.size()){
            int currCommon = ans.get(j);
            while(i<n3 && C[i]<currCommon){
                i++;
            }
            if(i<n3 && C[i] != currCommon){
                ans.remove(j);
            }
            else if(i<n3 && C[i] == currCommon){
                i++;
                j++;
            }
        }
        while(i == n3 && j!=ans.size()){
            ans.removeLast();
        }
        if(ans.isEmpty()) ans.add(-1);
        return ans;
    }

    private static ArrayList<Integer> commonElementsUsingThreePointers(int[] A, int[] B, int[] C, int n1, int n2, int n3){
         /*
            1. Have three pointers pointing to the three values from the three arrays
            2. If the values are equal then add in the answer arraylist if not present already and increment the pointers
            3. If the values are not equal then get the largest among the three values because any common element for the
               answer cannot be less than this largest element. So bring the three pointers to a value which is greater
               than or equal to the largest element and start iterating over and again.
          */

        //TC=>O(n1+n2+n3)
        //SC=>O(min(n1,n2,n3))
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0, k = 0;
        while(i<n1 && j<n2 && k<n3){
            if(A[i] == B[j] && B[j] == C[k]){
                if(!ans.contains(A[i])) ans.add(A[i]);
                i++;
                j++;
                k++;
            }
            else{
                int largest = Math.max(A[i], Math.max(B[j], C[k]));
                while(i<n1 && A[i]<largest){
                    i++;
                }
                while(j<n2 && B[j]<largest){
                    j++;
                }
                while(k<n3 && C[k]<largest){
                    k++;
                }
            }
        }
        if(ans.isEmpty()){
            ans.add(-1);
        }
        return ans;
    }

    private static ArrayList<Integer> commonElementsUsingTwoHashSet(int[] A, int[] B, int[] C, int n1, int n2, int n3){

        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();

        //add all the distinct elements of A in hs1
        for(int val: A){
            hs1.add(val);
        }

        //adding all the common elements between A and B in hs2
        for(int val: B){
            if(hs1.contains(val)) hs2.add(val);
        }

        //remove all elements from hs1
        hs1.clear();

        //adding the common elements between A, B, and C in hs1
        for(int val: C){
            if(hs2.contains(val)) hs1.add(val);
        }

        ArrayList<Integer> ans = new ArrayList<>(hs1);
        Collections.sort(ans);

        if(ans.isEmpty()) ans.add(-1);
        return ans;
    }
}
