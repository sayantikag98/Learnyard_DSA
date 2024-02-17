package L22_Arrays_Practice5.Practice;
import java.util.Scanner;

public class Codeforces_961B_LectureSleep {
    //https://codeforces.com/problemset/problem/961/B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] sleep = new int[n], lecture = new int[n];
        for(int i = 0; i<n; i++){
            lecture[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++){
            sleep[i] = sc.nextInt();
        }
        System.out.println(totalLectures(lecture, sleep, n, k));
        System.out.println(totalLecturesShorterImplementation(lecture, sleep, n, k));
    }

    private static long totalLecturesShorterImplementation(int[] lectures, int[] sleep, int n, int k){
        long totalCount = 0, sum = 0, maxSum = 0;
        for(int i = 0, j = 0; j<n; j++){
            if(sleep[j] == 1) totalCount+=lectures[j];
            else sum+=lectures[j];
            //past the first window
            if(j>=k){
                if(sleep[i] == 0) sum-=lectures[i];
                maxSum = Math.max(maxSum, sum);
                i++;
            }
            //reached the end of first window
            if(j==k-1){
                maxSum = sum;
            }
        }
        return totalCount+maxSum;
    }

    private static long totalLectures(int[] lectures, int[] sleep, int n, int k){
        long totalCount = 0;
        int i = 0, j = 0;
        long sum = 0;
        while(j!=k){
            if(sleep[j] == 1) totalCount+=lectures[j];
            else{
                sum+=lectures[j];
            }
            j++;
        }
        long maxSum = sum;
        while(j<n){
            if(sleep[j] == 1) totalCount+=lectures[j];
            else{
                sum+=lectures[j];
                if(sleep[i] == 0) sum-=lectures[i];
            }
            maxSum = Math.max(maxSum, sum);
            i++;
            j++;
        }
        return totalCount+maxSum;
    }
}
