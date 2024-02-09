package L17_ArrayList.Homework;
import java.util.Arrays;
import java.util.ArrayList;

public class GFG_AlternatePositiveAndNegativeNumbers {
    //https://www.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        rearrange(arr, n);
        System.out.println(Arrays.toString(arr));
        arr = new int[]{-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        rearrangeUsingExtraSpace(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    private static void rearrange(int[] arr, int n) {
        int posIdx = 0, negIdx = 0, currIdx = 0;
        while(posIdx<n && negIdx<n){
            /*
            posIdx should point to positive number and negIdx should point to negative number
             */
            while(posIdx<n && arr[posIdx]<0) posIdx++;
            while(negIdx<n && arr[negIdx]>=0) negIdx++;

            /*
            what helper() do is to shift the element from the currIdx till the posIdx or negIdx and place the postive
            or negative number at the desired location
             */
            if(helper(arr, n, posIdx, currIdx)){
                /*
                after shifting and placing the next positive element at currIdx if we see that negIdx is pointing to that positive element
                we should increment and then move to the next step where the next negative number will be placed at the currIdx
                If we don't increment negIdx then negIdx will still be pointing to the recently placed positive number then
                placing the next negative number would not be possible
                 */
                if(negIdx == currIdx) negIdx++; //IMPORTANT MADE MISTAKE
                currIdx++;
                posIdx++;
            }
            if(helper(arr, n, negIdx, currIdx)){
                // shift all the element from currIdx to negIdx-1 to the next index and place negIdx element at currIdx
                // after shift even if we don't increment posIdx then it's ok because it will anyways be placed at the next
                // positive at the next iteration
                if(posIdx == currIdx) posIdx++;
                currIdx++;
                negIdx++;
            }
        }
    }

    private static boolean helper(int[] arr, int n, int i, int k){
        boolean isChanged = false;
        if(i<n){
            int temp = arr[i];
            for(int m = i-1; m>=k; m--){
                arr[m+1] = arr[m];
            }
            arr[k] = temp;
            isChanged = true;
        }
        return isChanged;
    }

    private static void rearrangeUsingExtraSpace(int[] arr, int n){
        ArrayList<Integer> allPos = new ArrayList<>();
        ArrayList<Integer> allNeg = new ArrayList<>();
        for(int ele: arr){
            if(ele>=0){
                allPos.add(ele);
            }
            else{
                allNeg.add(ele);
            }
        }
        int posIdx = 0, negIdx = 0, currIdx = 0;
        while(posIdx<allPos.size() && negIdx<allNeg.size()){
            if((currIdx&1)==0){
                arr[currIdx++] = allPos.get(posIdx++);
            }
            else{
                arr[currIdx++] = allNeg.get(negIdx++);
            }
        }

        while(posIdx<allPos.size()){
            arr[currIdx++] = allPos.get(posIdx++);
        }

        while(negIdx<allNeg.size()){
            arr[currIdx++] = allNeg.get(negIdx++);
        }
    }
}
