class Solution {
    public int lengthLongestPath(String input) {
        String[] lines = input.split("\n");
        int[] pathLens = new int[input.length() + 1];
        int maxLen = 0;
        
        for (String line : lines) {
            int depth = line.lastIndexOf("\t") + 1;
            String name = line.substring(depth);
            if (depth > 0) {
                pathLens[depth] = pathLens[depth - 1] + 1 + name.length();
            } else {
                pathLens[depth] = name.length();
            }
            if (name.contains(".")) {
                maxLen = Math.max(maxLen, pathLens[depth]);
            }
        }
        
        return maxLen;
    }
}
