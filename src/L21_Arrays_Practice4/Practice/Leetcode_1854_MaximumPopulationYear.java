package L21_Arrays_Practice4.Practice;

public class Leetcode_1854_MaximumPopulationYear {
    //https://leetcode.com/problems/maximum-population-year/description/
    public static void main(String[] args) {
        int[][] logs = {{1982,1998},{2013,2042},{2010,2035},{2022,2050},{2047,2048}};
        System.out.println(maximumPopulation(logs));
    }

    private static int maximumPopulation(int[][] logs) {
        //marking the end range of each query in an array
        /*
            We can mark the start and end of each life as +1 and -1 on the timeline.
            Then, we go through timeline from 1950 to 2050 and accumulate the current
            population for each year

            Steps:
            1. Create an array of 101 length because of the constraint in the question
            2. Traverse the input array and increment the index corresponding to the birth year and decrement the index
                corresponding to the death year
            3. Compute the prefix sum of this array and get the year which has the maximum prefix sum
         */
        //TC =>O(n)
        //SC =>O(1)
        int[] populationChart = new int[101];
        for(int[] l : logs){
            populationChart[l[0]-1950]+=1;
            populationChart[l[1]-1950]-=1;
        }
        int maxPopulation = populationChart[0], maxPopulationYear = 1950;

        for(int i = 1; i<populationChart.length; i++){
            populationChart[i]+=populationChart[i-1];
            if(maxPopulation<populationChart[i]){
                maxPopulation = populationChart[i];
                maxPopulationYear = 1950+i;
            }
        }
        return maxPopulationYear;
    }
}
