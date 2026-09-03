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
    private int sum = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {
        sum(root);
        return sum;
    }
    public int sum(TreeNode root){
        if(root == null) return 0;
        
        int left = Math.max(sum(root.left),0);
        int right = Math.max(sum(root.right),0);
        int cur = left+right+root.val;
        sum = Math.max(sum,cur);
        return root.val+Math.max(left,right);
    }
}