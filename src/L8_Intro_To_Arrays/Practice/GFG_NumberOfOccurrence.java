package L8_Intro_To_Arrays.Practice;

import java.util.*;

public class GFG_NumberOfOccurrence {
    //https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt();
        int[] arr = new int [n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(countUsingTwoPointers(arr, n, x));
        System.out.println(countUsingLinearSearch(arr, n, x));
        System.out.println(countUsingHashMap(arr, n, x));
        System.out.println(countUsingCollectionFrequency(arr, n, x));
        System.out.println(countUsingBinarySearch(arr,n, x));


    }

    private static int countUsingTwoPointers(int[] arr, int n, int x) {
        // using two pointers
        /*
        SC => O(1)
        TC => O(n)

        Worst case complexity occurs when the element to be searched is the first element or the last element of the array
        if the search element is the first element then only the high pointer will move left till it reaches the low pointer
        and if the search element is the last element then the low pointer will move right till it reaches the high pointer
         */
        int countFreq = 0, low = 0, high = n-1;
        while(low<=high){
            if(arr[low]==x && arr[high]==x){
               countFreq = high - low + 1;
                break;
            }
            if(arr[low] != x){
                low++;
            }
            if(arr[high] != x){
                high--;
            }
        }
        return countFreq;
    }


    private static int countUsingLinearSearch(int[] arr, int n, int x){
        /*
        TC => O(n)
        SC => O(1)
         */
        int count = 0;
        for(int ele: arr){
            if(ele == x) count++;
        }
        return count;
    }

    private static int countUsingHashMap(int[] arr, int n, int x){
        /*
        TC => O(n)
        SC => O(k) where k is the unique element of the array
         */
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int ele: arr){
            hm.put(ele, hm.getOrDefault(ele, 0)+1);
        }
        return hm.getOrDefault(x, 0);
    }

    private static int countUsingCollectionFrequency(int[] arr, int n, int x){
        /*
        TC => O(n)
        SC => O(n)
         */
        ArrayList<Integer> al = new ArrayList<>();
        for(int ele: arr){
            al.add(ele);
        }
        return Collections.frequency(al, x);
    }

    private static int countUsingBinarySearch(int[] arr, int n, int x){
        /*
        get the lower bound of x
        which is the first occurrence of x if x is present otherwise the next greater element

        get the upper bound of x
        which is the next greater element
         */
        return getUpperBound(arr, n, x) - getLowerBound(arr, n, x);
    }

    private static int getLowerBound(int[] arr, int n, int x){
        /*
         get the lower bound of x -> which is the first occurrence of x if x is present otherwise the next greater element of x
         */
        int low = 0, high = n-1, ans = n;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid] >= x){
                // this conditions can lead to a potential answer that's why updating ans
                ans = mid;
                high = mid - 1;
            }
            else{
                //arr[mid] < x
                // here this cannot be the potential answer because neither mid can be the first occurrence nor it can be next greater element
                low = mid + 1;
            }
        }
        return ans;
    }

    private static int getUpperBound(int[] arr, int n, int x){
        /*
        get the upper bound of x -> which is the next greater element
         */

        int low = 0, high = n-1, ans = n;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid] <= x){
                //this cannot the potential answer or nge
                low = mid+1;
            }
            else{
                ans = mid;
                high = mid - 1;
            }
        }
        return ans;
    }
    private static void hashMapDemo(){
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(1,100);
        hm.put(2,200);

        System.out.println(hm.getOrDefault(8, 0));
        System.out.println(hm.getOrDefault(2, 0));
    }
}


