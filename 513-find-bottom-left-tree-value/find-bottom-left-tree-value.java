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
    private int maxlevel = -1;
    private int leftvalue = 0;
    public int findBottomLeftValue(TreeNode root) {
        find(root,0);
        return leftvalue;
    }

    public void find(TreeNode root,int level){
        if(root == null) return;
        if(level>maxlevel){
            maxlevel = level;
            leftvalue = root.val;
        }
        level++;
        if(root.left != null) find(root.left,level);
        if(root.right != null) find(root.right,level);
    }
}