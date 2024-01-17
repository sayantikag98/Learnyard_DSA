package L9_Array_Problem_Solving.Class;

public class MedianOfSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,3,4,4,5,6};
        int n = arr.length;
        /*
        median formula:
        when n is odd => (n+1)/2
        when n is even => (n/2 + (n/2+1))/2
         */
        if((n&1)==1){
            //odd
            System.out.println(arr[n/2]);
        }
        else{
            //even
            System.out.println((arr[n/2]+arr[(n-1)/2])/2);
        }
    }
}
