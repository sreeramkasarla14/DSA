class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        
        // Traverse the string backwards
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else if (length > 0) {
                // A word was already found, and now we hit a space
                break;
            }
        }
        
        return length;
    }
}
