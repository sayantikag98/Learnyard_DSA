package L10_Arrays_More_Problem_Solving.Class;
import java.util.Arrays;
public class InsertAndDeleteInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,0};
        insertElement(arr, arr.length, 3, 10);
        deleteElement(arr, arr.length, 3);
    }

    private static void insertElement(int[] arr, int n, int idx, int val){
        if(idx<0 || idx>=n){
            System.out.println("Enter proper index");
            return;
        }
        for(int i = n-1; i>=idx+1; i--){
            arr[i] = arr[i-1];
        }
        arr[idx] = val;
        printArray(arr);
    }

    private static void deleteElement(int[] arr, int n, int idx){
        if(idx<0 || idx>=n){
            System.out.println("Enter proper index");
            return;
        }
        for(int i = idx; i<n-1; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = 0;
        printArray(arr);
    }

    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
}
