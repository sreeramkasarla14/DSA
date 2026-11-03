class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int i = 0; i < n; i++) {
            int low = 0;
            int high = n-1;
            while (low <= high) {
                if (low == high) {
                    image[i][low] = image[i][low] ^ 1;
                } else {
                    int temp = image[i][low] ^ 1;
                    image[i][low] = image[i][high] ^ 1;
                    image[i][high] = temp;
                }
                low++;
                high--;
            }
        }
        
        return image;
    }
}
