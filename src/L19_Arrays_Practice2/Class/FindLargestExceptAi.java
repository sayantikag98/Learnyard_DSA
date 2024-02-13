package L19_Arrays_Practice2.Class;

public class FindLargestExceptAi {
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,4,5,7,6},
        query = {-1,7,6,3};

        querySolver1(arr, query);
        querySolver2(arr, query);

    }

    private static void querySolver1(int[] arr, int[] query){
        //TC=>O(n)
        //SC=>O(1)
        int n = arr.length, largest = 0, secondLargest = largest;
        for(int i = 1; i<n; i++){
            if(arr[largest]<arr[i]){
                secondLargest = largest;
                largest = i;
            }
            else{
                if(arr[secondLargest]<arr[i]){
                    secondLargest = i;
                }
            }
        }
        for(int k: query){
            if(k<0 || k>=n) continue;
            if(arr[k] == arr[largest]) System.out.println(arr[secondLargest]);
            else System.out.println(arr[largest]);
        }
    }

    private static void querySolver2(int[] arr, int[] query) {
        int n = arr.length;
        int[] prefixMax = new int[n],
                suffixMax = new int[n];
        prefixMax[0] = arr[0];
        suffixMax[n-1] = arr[n-1];
        for(int i = 1; i<n; i++){
            prefixMax[i] = Math.max(prefixMax[i-1], arr[i]);
        }
        for(int i = n-2; i>=0; i--){
            suffixMax[i] = Math.max(suffixMax[i+1], arr[i]);
        }
        for(int k: query){
            if(k==0) System.out.println(suffixMax[k+1]);
            else if(k == n-1) System.out.println(prefixMax[k-1]);
            else if(k>0 && k<n-1){
                System.out.println(Math.max(prefixMax[k-1], suffixMax[k+1]));
            }
        }
    }
}
