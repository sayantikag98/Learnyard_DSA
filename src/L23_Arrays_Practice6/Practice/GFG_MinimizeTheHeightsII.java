package L23_Arrays_Practice6.Practice;

public class GFG_MinimizeTheHeightsII {
    //https://www.geeksforgeeks.org/problems/minimize-the-heights3351/1
    public static void main(String[] args) {
        int[] arr = {1, 8, 10, 6, 4, 6, 9, 1};
        int k = 7;
        System.out.println(getMinDiff(arr, arr.length, k));
    }

    private static int getMinDiff(int[] arr, int n, int k) {
        // find min and max
        int min = 0, max = 0;
        for(int i = 1; i<n; i++){
            if(arr[min]>arr[i]){
                min = i;
            }
            if(arr[max]<arr[i]){
                max = i;
            }
        }

        int prevMin = arr[min], prevMax = arr[max];

        //max decrease and min increase
        if(arr[max]-k >= 0) arr[max]-=k;
        else arr[max]+=k;
        if(min!=max) arr[min]+=k;

        int ans = findDiff(arr, n, k, min, max);

        arr[min] = prevMin;
        arr[max] = prevMax;

        //max and min increase
        arr[max]+=k;
        if(min!=max) arr[min]+=k;
        ans = Math.min(ans, findDiff(arr, n, k, min, max));

        arr[min] = prevMin;
        arr[max] = prevMax;

        //max and min decrease
        if(arr[max]-k >= 0) arr[max]-=k;
        else arr[max]+=k;
        if(min!=max){
            if(arr[min]-k>=0) arr[min]-=k;
            else arr[min]+=k;
        }
        ans = Math.min(ans, findDiff(arr, n, k, min, max));

        arr[min] = prevMin;
        arr[max] = prevMax;

        return ans;

    }

    private static int findDiff(int[] arr, int n, int k, int min, int max){
        int currMin = arr[min], currMax = arr[max];

        for(int i = 0; i<n; i++){
            if(i == min || i == max) continue;
            if(arr[i]-k<0){
                arr[i]+=k;
                currMin = Math.min(currMin, arr[i]);
                currMax = Math.max(currMax, arr[i]);
                arr[i]-=k;
            }
            else{
                int increment = arr[i]+k, decrement = arr[i]-k;
                if(increment<=arr[max]){
                    arr[i]+=k;
                    currMin = Math.min(currMin, arr[i]);
                    currMax = Math.max(currMax, arr[i]);
                    arr[i]-=k;
                }
                else if(decrement>=arr[min]){
                    arr[i]-=k;
                    currMin = Math.min(currMin, arr[i]);
                    currMax = Math.max(currMax, arr[i]);
                    arr[i]+=k;
                }
                else{
                    if(increment-arr[max]>arr[min]-decrement){
                        arr[i]-=k;
                        currMin = Math.min(currMin, arr[i]);
                        currMax = Math.max(currMax, arr[i]);
                        arr[i]+=k;
                    }
                    else {
                        arr[i]+=k;
                        currMin = Math.min(currMin, arr[i]);
                        currMax = Math.max(currMax, arr[i]);
                        arr[i]-=k;
                    }
                }
            }
        }
        return currMax-currMin;
    }
}
