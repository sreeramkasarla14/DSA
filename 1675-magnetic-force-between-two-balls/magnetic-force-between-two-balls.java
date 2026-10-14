import java.util.Arrays;

class Solution {
    public int maxDistance(int[] position, int m) {
        // Step 1: Sort the basket positions
        Arrays.sort(position);
        
        int n = position.length;
        int low = 1;
        int high = position[n - 1] - position[0];
        int ans = 0;
        
        // Step 2: Binary search for the maximum minimum distance
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (canPlaceBalls(position, m, mid)) {
                ans = mid;     // mid is a valid distance, save it
                low = mid + 1; // Try to maximize the minimum distance
            } else {
                high = mid - 1; // mid is too large, reduce the distance
            }
        }
        
        return ans;
    }
    
    // Helper function to check if we can place m balls with at least 'force' distance apart
    private boolean canPlaceBalls(int[] position, int m, int force) {
        int count = 1; // Place the first ball in the first basket
        int lastPlacedPosition = position[0];
        
        for (int i = 1; i < position.length; i++) {
            if (position[i] - lastPlacedPosition >= force) {
                count++;
                lastPlacedPosition = position[i]; // Update the last placed position
                
                // If all m balls are successfully placed
                if (count >= m) {
                    return true;
                }
            }
        }
        
        return false;
    }
}
