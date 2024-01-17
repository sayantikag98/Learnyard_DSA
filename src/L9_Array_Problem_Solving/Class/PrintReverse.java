package L9_Array_Problem_Solving.Class;

public class PrintReverse {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        for(int i = arr.length - 1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
