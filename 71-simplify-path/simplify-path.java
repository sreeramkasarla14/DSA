import java.util.Stack;

class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] components = path.split("/");
        
        for (String dir : components) {
            if (dir.isEmpty() || dir.equals(".")) {
                continue;
            }
            if (dir.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(dir);
            }
        }
        StringBuilder canonicalPath = new StringBuilder();
        for (String dir : stack) {
            canonicalPath.append("/").append(dir);
        }
        return canonicalPath.length() == 0 ? "/" : canonicalPath.toString();
    }
}
