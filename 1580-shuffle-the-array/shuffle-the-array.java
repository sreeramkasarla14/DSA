class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        
        int p1 = 0;     // Pointer 1 starts at the beginning (for x elements)
        int p2 = n;     // Pointer 2 starts at index n (for y elements)
        int index = 0;  // Index to track placement in the result array
        
        while (p1 < n) {
            result[index++] = nums[p1++]; // Add x element, then move pointers
            result[index++] = nums[p2++]; // Add y element, then move pointers
        }
        
        return result;
    }
}
