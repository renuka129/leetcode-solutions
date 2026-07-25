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
    public boolean isValidBST(TreeNode root) {
        return helper(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    boolean helper(TreeNode root,long min1,long max1){
         if(root==null){
            return true;
        }
        if((root.val>=max1)||(root.val<=min1)){
            return false;
        }
        return helper(root.left,min1,root.val)&&helper(root.right,root.val,max1);
    }
}