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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode node=new TreeNode(preorder[0]);
        for(int i=1;i<preorder.length;i++){
            helper(node,preorder[i]);
        }
        return node;
        
    }
    void helper(TreeNode node,int val){
        TreeNode cur=node;
        while(true){
            if(val<cur.val){
                if(cur.left!=null){
                    cur=cur.left;
                }
                else{
                    cur.left=new TreeNode(val);
                    break;
                }
            }
            else{
                if(cur.right!=null){
                    cur=cur.right;
                }
                else{
                    cur.right=new TreeNode(val);
                    break;
                }
            }
        }
    }
}