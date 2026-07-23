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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return root;
        }
        if(root.val==key){
            return helper(root);
        }
        TreeNode cur=root;
        while(root!=null){
            if(key<root.val){
                if(root.left!=null&&root.left.val==key){
                   root.left=helper(root.left);
                   break;
                }
                else{
                    root=root.left;
                }
            }
            else{
                if(root.right!=null&&root.right.val==key){
                    root.right=helper(root.right);
                    break;
                }
                else{
                    root=root.right;
                }
            }
        }
        return cur;
    }
    TreeNode helper(TreeNode root){
        if(root.left==null){
            return root.right;
        }
        else if(root.right==null){
            return root.left;
        }
        TreeNode rootright=root.right;
        TreeNode lastright=last(root.left);
        lastright.right=rootright;
        return root.left;
    }
    TreeNode last(TreeNode root){
        if(root.right==null){
        return root;
        }
        return last(root.right);
    }
}