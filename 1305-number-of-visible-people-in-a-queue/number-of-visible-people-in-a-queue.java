class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;

        int[] nextTaller = new int[n];
        nextTaller[n - 1] = n;

        int[] result = new int[n];
        result[n - 1] = 0;
        for(int i = n - 2; i >= 0; --i) {
            int j = i + 1;
            int counter = 1;
            while(j <= n - 1 && heights[j] < heights[i]) {
                j = nextTaller[j];
                counter++;
            }
            if(j == n) counter--;
            nextTaller[i] = j;
            result[i] = counter;
        }
        return result;
    }
}