import java.util.Arrays;

class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int n = nums.length;
        int[] mappedValues = new int[n];
        for (int i = 0; i < n; i++) {
            mappedValues[i] = getMappedValue(nums[i], mapping);
        }
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (a, b) -> {
            if (mappedValues[a] != mappedValues[b]) {
                return Integer.compare(mappedValues[a], mappedValues[b]);
            }
            return Integer.compare(a, b);
        });
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = nums[indices[i]];
        }
        
        return result;
    }
    private int getMappedValue(int num, int[] mapping) {
        if (num == 0) {
            return mapping[0];
        }
        
        int mapped = 0;
        int placeValue = 1;
        int temp = num;
        
        while (temp > 0) {
            int digit = temp % 10;
            mapped += mapping[digit] * placeValue;
            placeValue *= 10;
            temp /= 10;
        }
        
        return mapped;
    }
}
