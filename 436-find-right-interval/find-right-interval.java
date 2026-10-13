import java.util.TreeMap;

class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[] result = new int[n];
        
        // Step 1: Map each interval's start value to its original index
        TreeMap<Integer, Integer> startMap = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            startMap.put(intervals[i][0], i);
        }
        
        // Step 2: Find the smallest start value >= current interval's end value
        for (int i = 0; i < n; i++) {
            int endValue = intervals[i][1];
            
            // ceilingKey(x) returns the least key greater than or equal to x, or null
            Integer rightStartKey = startMap.ceilingKey(endValue);
            
            if (rightStartKey == null) {
                result[i] = -1; // No valid right interval exists
            } else {
                result[i] = startMap.get(rightStartKey); // Get the original index
            }
        }
        
        return result;
    }
}
