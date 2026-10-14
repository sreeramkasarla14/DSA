import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       // int m=nums1.length;
       // int n=nums2.length;
        int[] result = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, result, 0, nums1.length);
        System.arraycopy(nums2, 0, result, nums1.length, nums2.length);
       /* int left=0;
        int right=result.length-1;
        while(left<right){
            int t=result[left];
            result[left]=result[right];
            result[right]=t;
            left++;
            right--;
        }*/
        for (int left = 0; left < result.length - 1; left++) {
            for (int right = left + 1; right < result.length; right++) {
                if (result[left] > result[right]) {
                    int temp = result[left];
                    result[left] = result[right];
                    result[right] = temp;
                }
            }
        }
        if(result.length%2==0){
            int rightMidIndex = result.length / 2;      
            int leftMidIndex = rightMidIndex - 1;
            double average=(result[rightMidIndex]+result[leftMidIndex])/2.0;
            return average;    
        }
        else{
            int middleIndex = result.length / 2;
            return result[middleIndex];
        }

    }

}