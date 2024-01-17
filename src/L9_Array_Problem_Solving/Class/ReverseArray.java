package L9_Array_Problem_Solving.Class;
import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 2, 5};
        int i = 0, j = arr.length - 1;
        while(i<j){
            swap(arr, i++, j--);
        }
        System.out.println(Arrays.toString(arr));


    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
