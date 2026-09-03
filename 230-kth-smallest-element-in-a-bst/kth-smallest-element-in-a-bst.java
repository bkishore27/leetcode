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
    private int small = 0;
    private int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        small(root,k);
        return small;
    }
    public void small(TreeNode root, int k){
        if(root == null) return ;
        small(root.left,k);
        count++;
        if(count == k){
            small = root.val;
            return ;
        }
        if(count < k){
            small(root.right,k);
        }
    }
}