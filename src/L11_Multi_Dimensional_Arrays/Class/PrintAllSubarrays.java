package L11_Multi_Dimensional_Arrays.Class;

public class PrintAllSubarrays {
    public static void main(String[] args) {
        int[] arr = {1,3,1,5,8};
        /*
        total no of subarrays -> n(n+1)/2
        print all subarrays
        one size subarray -> [1], [3], [1], [5], [8]
        two size subarray -> [1,3], [3,1], [1,5], [5,8]
        three size subarray -> [1,3,1], [3,1,5], [1,5,8]
        four size subarray -> [1,3,1,5], [3,1,5,8]
        five size subarray -> [1,3,1,5,8]
         */
       printSubArrays1(arr, arr.length);
        System.out.println("___________________________________");
       printSubArrays2(arr, arr.length);
    }

    private static void printSubArrays1(int[] arr, int n){
        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
                System.out.print("[");
                for(int k = i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println("]");
            }
        }
    }

    private static void printSubArrays2(int[] arr, int n){
        for(int i = 1; i<=n; i++){ // i will represent the length of the subarray
            for(int j = 0, k = j + i - 1; k<n; k++, j++){ // j will be the starting index and k will be the ending index and length will be of size i
                System.out.print("[");
                for(int m = j; m<=k; m++){
                    System.out.print(arr[m]+" ");
                }
                System.out.print("]");
            }
            System.out.println();
        }
    }
}
