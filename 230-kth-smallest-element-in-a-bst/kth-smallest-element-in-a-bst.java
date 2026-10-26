/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int curr=0;
    int ans=0;
    void preorder(TreeNode root,int k){
        if(root==null)return ;
        preorder(root.left,k);
        curr++;
        if(curr==k){
            ans=root.val;
            return ;
        }
        preorder(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        preorder(root,k);
        return ans;
    }
}