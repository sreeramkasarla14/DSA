class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;     // Pointer for end of initialized nums1
        int j = n - 1;     // Pointer for end of nums2
        int k = m + n - 1; // Pointer for end of entire nums1 array
        
        // Loop until nums2 is completely merged
        while (j >= 0) {
            // Compare and place the larger element at the back
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
}
